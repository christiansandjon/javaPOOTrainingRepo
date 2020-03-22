package com.smc;

public class Olibrius extends Chien implements IAnimal{

    // fields
    private int nbRepas;

    // constructor
    public Olibrius(int nbDents, boolean tatoue, int nbRepas) {
        super(nbDents, tatoue);
        this.nbRepas = nbRepas;
    }

    public Olibrius(String type, String nom, double poids, int nbDents, boolean tatoue, int nbRepas) {
        super(type, nom, poids, nbDents, tatoue);
        this.nbRepas = nbRepas;
    }

    // methods


    public Olibrius(int nbDents, boolean tatoue) {
        super(nbDents, tatoue);
    }

    public Olibrius(String type, String nom, double poids, int nbDents, boolean tatoue) {
        super(type, nom, poids, nbDents, tatoue);
    }

    @Override
    public void manger() {
        super.manger();
    }

    @Override
    public void monterGarde() {
        super.monterGarde();
    }

    @Override
    public void bouger() {
        super.bouger();
    }

    // getter setter
    public int getNbRepas() {
        return nbRepas;
    }

    public void setNbRepas(int nbRepas) {
        this.nbRepas = nbRepas;
    }
}
