package com.smc;

public class Personne {

    protected String nom;
    protected String prenom;
    protected int telephone;

    public Personne(String nom, String prenom, int telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTelephone() {
        return telephone;
    }
}
