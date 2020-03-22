package com.company;

public class ClientImpl extends Personne implements Client{

    private int argent;

    public ClientImpl(String nom, String prenom, CompteBancaire compteBancaire) {
        super(nom, prenom, compteBancaire);
    }

    @Override
    public void payer() {

    }
}
