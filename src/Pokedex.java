import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Properties;
import java.util.stream.Stream;


class Pokedex {
	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("\nError: No filename provided.");
			System.out.println("\tUSAGE: java Pokedex <filename>");
		} else {
			Properties props = new Properties();
			// alt: for (String arg : args)
			for (int i = 0; i < args.length; i++) {
				switch (args[i]) {
					case "--help":
					case "-h":
						usage();
						System.exit(0);
					case "-f":
						loadFile(args[i+1]);
						i++;
						break;
					case "-i":
						loadStdIn();
						break;
					case "-s":
						loadFileStream(args[i+1]);
						i++;
						break;
					case "--server":
						server();
						break;
					default:
						System.out.println("Unknown argument " + args[i]);
						System.exit(1);
				}
			}
		}
	}

	public static void usage() {
		System.out.println("Read the docs!");
	}
	public static void loadFile(String filename) throws Exception {
		File pokedex = new File(filename);
		Scanner sc = new Scanner(pokedex);
		sc.useDelimiter("\n");
		while (sc.hasNext()) {
			String[] columns = sc.next().split(",");
			System.out.println("Pokemon: " + columns[2]);
			
		}
	}

	public static void loadFileStream(String filename) throws Exception {
		new BufferedReader(new FileReader(filename)).lines().forEach(System.out::println);
	}

	public static void loadStdIn() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Stream<String> lines = br.lines();
		lines.forEach(System.out::println);
	}

	public static void server() throws Exception {
		ServerSocket server = new ServerSocket(8080);
		while (server.isBound()) {
			Socket incomingRequest = server.accept();
			Scanner sc = new Scanner(incomingRequest.getInputStream());
			PrintWriter out = new PrintWriter(incomingRequest.getOutputStream(), true);
			//System.out.println(sc.nextLine());
			out.println("HTTP/1.1 200 Ok\r\nContent-Length: 28\r\n\r\n<h1>Hello From Server</h1>");
		}
	}
}
