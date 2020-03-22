package com.smc;

public class Professeur extends Personne {

    private String matiere;

    public Professeur(String nom, String prenom, int telephone, String matiere) {
        super(nom, prenom, telephone);
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }
}
