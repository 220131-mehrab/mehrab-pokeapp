package com.github.MehrabRahman.pokedex;

import java.util.Objects;

//ID,Number,Name,Type1,Type2,Total,HP,Atk,Def,SpAtk,SpDef,Spd,Species,Height,Weight
public class Pokemon {
    private String ID;
    private String Number;
    private String Name;
    private String Type1;
    private String Type2;
    private String Total;
    private String HP;
    private String Atk;
    private String Def;
    private String SpAtk;
    private String SpDef;
    private String Spd;
    private String Species;
    private String Height;
    private String Weight;

    public Pokemon(String ID, String number, String name, String type1, String type2, String total, String HP, String atk, String def, String spAtk, String spDef, String spd, String species, String height, String weight) {
        Objects.requireNonNull(ID, "ID must not be null");
        this.ID = ID;
        Number = number;
        Name = name;
        Type1 = type1;
        Type2 = type2;
        Total = total;
        this.HP = HP;
        Atk = atk;
        Def = def;
        SpAtk = spAtk;
        SpDef = spDef;
        Spd = spd;
        Species = species;
        Height = height;
        Weight = weight;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType1() {
        return Type1;
    }

    public void setType1(String type1) {
        Type1 = type1;
    }

    public String getType2() {
        return Type2;
    }

    public void setType2(String type2) {
        Type2 = type2;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    public String getAtk() {
        return Atk;
    }

    public void setAtk(String atk) {
        Atk = atk;
    }

    public String getDef() {
        return Def;
    }

    public void setDef(String def) {
        Def = def;
    }

    public String getSpAtk() {
        return SpAtk;
    }

    public void setSpAtk(String spAtk) {
        SpAtk = spAtk;
    }

    public String getSpDef() {
        return SpDef;
    }

    public void setSpDef(String spDef) {
        SpDef = spDef;
    }

    public String getSpd() {
        return Spd;
    }

    public void setSpd(String spd) {
        Spd = spd;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public Pokemon() {
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "ID='" + ID + '\'' +
                ", Number='" + Number + '\'' +
                ", Name='" + Name + '\'' +
                ", Type1='" + Type1 + '\'' +
                ", Type2='" + Type2 + '\'' +
                ", Total='" + Total + '\'' +
                ", HP='" + HP + '\'' +
                ", Atk='" + Atk + '\'' +
                ", Def='" + Def + '\'' +
                ", SpAtk='" + SpAtk + '\'' +
                ", SpDef='" + SpDef + '\'' +
                ", Spd='" + Spd + '\'' +
                ", Species='" + Species + '\'' +
                ", Height='" + Height + '\'' +
                ", Weight='" + Weight + '\'' +
                '}';
    }
}
