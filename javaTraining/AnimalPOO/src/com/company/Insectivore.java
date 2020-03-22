package com.company;

abstract public class Insectivore extends Mammifere{


    public Insectivore() {
    }

    public Insectivore(double poids, double age, String type, String nom) {
        super(poids, age, type, nom);

    }


    @Override
    public void bouger() {
        System.out.println("insectivore bouge");
    }

    @Override
    public void manger() {
        System.out.println("insectivore mange");
    }
}
