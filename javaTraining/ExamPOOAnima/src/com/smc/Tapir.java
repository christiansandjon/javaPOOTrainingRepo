package com.smc;

public class Tapir extends Insectivore {

    // constructor
    public Tapir() {
    }

    public Tapir(String type, String nom, double poids) {
        super(type, nom, poids);
    }

    @Override
    public void manger() {
        System.out.println("un tapir mange");
    }
}
