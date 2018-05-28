package edu.upc.dsa.Model;

public class Etakemon {
    public int id;
    public String nombre;
    public String tipo;
    public int nivel;

    public static int lastid = 1;

    public Etakemon () {
        this.id = lastid;
        lastid++;
    }
    public Etakemon (String name, String type, int lvl) {
        this.id = lastid;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        lastid++;
    }

}
