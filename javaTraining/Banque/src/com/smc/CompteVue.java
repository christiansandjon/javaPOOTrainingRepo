package com.smc;

public class CompteVue extends Compte{

    private int joursNegatif;

    public CompteVue(int numCompte, double solde, int joursNegatif) {
        super(numCompte, solde);
        this.joursNegatif = joursNegatif;
    }

    public int getJoursNegatif() {
        return joursNegatif;
    }
}
