package com.smc;

public class Eleve extends Personne{

    // attributs
    private String filiere;

    // construct

    public Eleve(String nom, String prenom, int telephone, int numero, String rue, int cp, String ville, String filiere) {
        super(nom, prenom, telephone, numero, rue, cp, ville);
        this.filiere = filiere;
    }

    public Eleve(String nom, String prenom, int telephone, Adresse adresse, String filiere) {
        super(nom, prenom, telephone, adresse);
        this.filiere = filiere;
    }


    // get set

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    // methodes  se presenter
    public void sePresenter(){
        super.sePresenter();
        System.out.println("\n et je suis eleve en "+getFiliere());
    }
}
