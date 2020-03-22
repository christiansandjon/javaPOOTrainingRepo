package com.smc;

public class Ville {

    private String nom;
    private double longitude;
    private double latitude;

    public Ville(String nom, double longitude, double latitude) {
        this.nom = nom;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}


