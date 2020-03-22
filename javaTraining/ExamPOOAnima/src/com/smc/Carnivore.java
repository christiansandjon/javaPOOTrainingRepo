package com.smc;

public abstract class Carnivore extends Mammifere {

    protected int nbDents;

    // constructor

    public Carnivore(int nbDents) {
        this.nbDents = nbDents;
    }

    public Carnivore(String type, String nom, double poids, int nbDents) {
        super(type, nom, poids);
        this.nbDents = nbDents;
    }

    @Override
    public void bouger(){
        System.out.println("un carnivore bouge");
    }

}
