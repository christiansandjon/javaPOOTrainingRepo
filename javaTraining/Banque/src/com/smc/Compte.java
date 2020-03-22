package com.smc;

public abstract class Compte {

    public static int nombreCompte = 0;

    protected int numCompte;
    protected double solde;

    public Compte(int numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;

        nombreCompte ++;
    }

    // methods
    public abstract double prime();
    public abstract double interet();
    public abstract double accroissement();

    // getter setter
    public static int getNombreCompte() {
        return nombreCompte;
    }

    public static void setNombreCompte(int nombreCompte) {
        Compte.nombreCompte = nombreCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
