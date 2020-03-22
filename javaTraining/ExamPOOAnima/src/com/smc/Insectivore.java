package com.smc;

public abstract class Insectivore extends Mammifere {

    //constructor
    public Insectivore() {
    }

    public Insectivore(String type, String nom, double poids) {
        super(type, nom, poids);
    }

    @Override
    public abstract void manger();

    @Override
    public void bouger() {
        System.out.println("un insectivore bouge");
    }
}
