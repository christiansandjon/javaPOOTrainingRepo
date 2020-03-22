package com.smc;

import java.util.ArrayList;
import java.util.List;

public class Ville {

    private String nom;
    private List<Etablissement> etablissements;

    public Ville(String nom) {
        this.nom = nom;
        etablissements = new ArrayList<Etablissement>();
    }

    public String getNom() {
        return nom;
    }

    public List<Etablissement> getEtablissements() {
        return etablissements;
    }

    public void ajouterEtalissement(Etablissement etablissement){
        etablissements.add(etablissement);
    }

    public void afficherListeEtablissement(){
        for (Etablissement etablissement : etablissements){
            System.out.println(etablissement.getNom());
            etablissement.afficherListePersonne3();
        }
    }
}
