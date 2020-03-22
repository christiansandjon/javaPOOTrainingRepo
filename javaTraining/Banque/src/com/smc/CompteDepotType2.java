package com.smc;

public class CompteDepotType2 extends CompteDepot{

    public CompteDepotType2(int numCompte, double solde, double taux_accroissement) {
        super(numCompte, solde, taux_accroissement);
    }

    @Override
    public double interet() {
        return solde*(0.05+taux_accroissement) + prime() + accroissement();
    }
}
