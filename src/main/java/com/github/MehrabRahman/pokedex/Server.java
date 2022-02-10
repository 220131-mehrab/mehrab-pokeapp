package com.github.MehrabRahman.pokedex;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket server;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(Pokedex pokedex) {
        while (server.isBound()) {
            try {
                Socket socket = server.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("HTTP/1.1 200 Ok");
                out.println();
                out.println("<html><body><ul>");
                for (Pokemon pokemon : pokedex.pokemans) {
                    out.println("<li>" + pokemon + "</li>");
                }
                out.println("</ul></body></html>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
