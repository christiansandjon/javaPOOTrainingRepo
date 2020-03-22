package com.smc;

public abstract class CompteDepot extends Compte {

    protected double taux_accroissement;

    public CompteDepot(int numCompte, double solde, double taux_accroissement) {
        super(numCompte, solde);
        this.taux_accroissement = taux_accroissement;
    }

    public double getTaux_accroissement() {
        return taux_accroissement;
    }
}
