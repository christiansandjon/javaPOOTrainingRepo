package com.smc;

public class Professeur extends Personne{

    // attributs

    private String matiiere;

    // constructeur

    public Professeur(String nom, String prenom, int telephone, int numero, String rue, int cp, String ville, String matiiere) {
        super(nom, prenom, telephone, numero, rue, cp, ville);
        this.matiiere = matiiere;
    }

    public Professeur(String nom, String prenom, int telephone, Adresse adresse) {
        super(nom, prenom, telephone, adresse);
        this.matiiere = matiiere;
    }


    // getteurs et setteurs

    public String getMatiiere() {
        return matiiere;
    }

    public void setMatiiere(String matiiere) {
        this.matiiere = matiiere;
    }


    // methodes  se presenter
    public void sePresenter(){
        super.sePresenter();
        System.out.println("\n et je suis prof de "+getMatiiere()+"\n");
    }
}




