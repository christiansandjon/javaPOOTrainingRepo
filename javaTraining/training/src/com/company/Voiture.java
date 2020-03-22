package com.company;

public class Voiture {

    private String marque;
    private String modele;
    private String numeroSerie;
    private double prixCat;
    private double prixReel;

    public Voiture(String marque, String modele, String numeroSerie, double prixCat) {
        this.marque = marque;
        this.modele = modele;
        this.numeroSerie = numeroSerie;
        this.prixCat = prixCat;
    }

    public void calculPrixReel(double tauxReduction) {
        prixReel = prixCat*(1-tauxReduction);
    }

    public void afficher() {
        System.out.println("la voiture est" +
                " de marque "+marque+
                " de modele "+modele+
                " et coute "+prixReel);
    }
}
