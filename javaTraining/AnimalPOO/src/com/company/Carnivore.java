package com.company;

abstract public class Carnivore extends Mammifere{

    private int nbDents;

    public Carnivore() {
    }

    public Carnivore(double poids, double age, String type, String nom, int nbDents) {
        super(poids, age, type, nom);
        this.nbDents = nbDents;
    }

    public int getNbDents() {
        return nbDents;
    }

    public void setNbDents(int nbDents) {
        this.nbDents = nbDents;
    }

    @Override
    public void bouger() {
        System.out.println("carnivore bouge");
    }
}
