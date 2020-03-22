package com.company;

public class CompteBancaire {
    private String numero;
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public CompteBancaire(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void crediter(int montant){
         solde+=montant;
    }

    public void debiter(int montant){
        solde-=montant;
    }
}
