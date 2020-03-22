package com.smc;

public class Etudiant extends Personne{

    private String filiere;

    public Etudiant(String nom, String prenom, int telephone, String filiere) {
        super(nom, prenom, telephone);
        this.filiere = filiere;
    }

    public String getFiliere() {
        return filiere;
    }
}
