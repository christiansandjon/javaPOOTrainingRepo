package com.smc;

public class Personne {

    protected String nom;
    protected String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficher(){
        System.out.println("" +
                "nom : "+nom+
                "prenom "+prenom+"\n");
    }
}
