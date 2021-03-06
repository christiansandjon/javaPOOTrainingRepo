package com.smc;

public class Personne {

    // fields
    private String nom;
    private String prenom;

    // constructors
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    // getters setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // methods
    public String afficherNomComplet(){
        return "nom : "+getNom()+" prenom : "+getPrenom();
    }


}
