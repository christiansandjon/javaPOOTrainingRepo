package com.smc;

public abstract class Mammifere extends Animal{

    public Mammifere() {
    }

    public Mammifere(String type, String nom, double poids) {
        super(type, nom, poids);
    }

    @Override
    public abstract void bouger();
}
