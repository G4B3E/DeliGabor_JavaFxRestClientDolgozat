package com.example.deligabor_javafxrestclientdolgozat;

public class Movie {
    private String filmek;
    private int ertekeles;
    private int evjarat;
    private String dijak;

    public Movie(String filmek, int ertekeles, int evjarat, String dijak) {
        this.filmek = filmek;
        this.ertekeles = ertekeles;
        this.evjarat = evjarat;
        this.dijak = dijak;
    }

    public String getFilmek() {
        return filmek;
    }

    public void setFilmek(String filmek) {
        this.filmek = filmek;
    }

    public int getErtekeles() {
        return ertekeles;
    }

    public void setErtekeles(int ertekeles) {
        this.ertekeles = ertekeles;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    public String getDijak() {
        return dijak;
    }

    public void setDijak(String dijak) {
        this.dijak = dijak;
    }
}
