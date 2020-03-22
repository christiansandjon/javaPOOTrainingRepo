package com.company;

abstract public class Mammifere extends Animal {

    public Mammifere() {
    }

    public Mammifere(double poids, double age, String type, String nom) {
        super(poids, age, type, nom);
    }

    @Override
    public void bouger() {
        System.out.println("mammifere bouge");
    }
}
