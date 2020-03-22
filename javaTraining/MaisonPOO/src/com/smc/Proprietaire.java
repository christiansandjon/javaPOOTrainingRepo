package com.smc;

public class Proprietaire extends Personne {

    private String metier;


    public Proprietaire(String nom, String prenom, String metier) {
        super(nom, prenom);
        this.metier = metier;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    @Override
    public String afficherNomComplet() {
        return super.afficherNomComplet()+
                "son metier est : "+getMetier();

    }
}
