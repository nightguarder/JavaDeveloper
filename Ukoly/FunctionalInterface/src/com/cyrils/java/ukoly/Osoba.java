package com.cyrils.java.ukoly;

public class Osoba {
    //instancni promenne
    private String jmeno;
    private int vek;

    //konstruktor
    public Osoba(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }
    
}
