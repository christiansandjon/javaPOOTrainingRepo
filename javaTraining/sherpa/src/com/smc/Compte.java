package com.smc;


import static java.lang.Math.*;

public class Compte {

    public double solde;
    public int taux;
    public int nombreAnnee;

    public Compte(double solde, int taux, int nombreAnnee) {
        this.solde = solde;
        this.taux = taux;
        this.nombreAnnee = nombreAnnee;
    }

    public void calculCapital(){
        double capital = solde*(pow((1+(taux/100.0)),nombreAnnee));

        System.out.println("capital au taux de "+taux+
                "% après "+nombreAnnee+" d'années est : "+capital);
    }

}
