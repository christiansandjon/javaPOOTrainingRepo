package com.smc;

public class Secretaire extends Personne{


    private String affectation;

    public Secretaire(String nom, String prenom, int telephone, int numero, String rue, int cp, String ville, String affectation) {
        super(nom, prenom, telephone, numero, rue, cp, ville);
        this.affectation = affectation;
    }

    public Secretaire(String nom, String prenom, int telephone, Adresse adresse, String affectation) {
        super(nom, prenom, telephone, adresse);
        this.affectation = affectation;
    }

    public String getAffectation() {
        return affectation;
    }

    public void setAffectation(String affectation) {
        this.affectation = affectation;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.println("et je suis affecté à "+getAffectation());
    }
}
