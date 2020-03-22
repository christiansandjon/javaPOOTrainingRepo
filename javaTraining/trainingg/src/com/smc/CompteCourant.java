package com.smc;

public class CompteCourant extends CompteBancaire {

    private double decouvertMax;

    public CompteCourant(int numero, double solde, double decouvertMax) {
        super(numero, solde);
        this.decouvertMax = decouvertMax;
    }

    public boolean retirer( int montant){
        if ((solde - montant) < decouvertMax){
            System.out.println("solde insuffisant");
            return false;
        } else {
            solde -=montant;
            return true;
        }
    }
}
