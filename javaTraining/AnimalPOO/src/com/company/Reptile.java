package com.company;

abstract public class Reptile extends Animal {

    public Reptile() {
    }

    public Reptile(double poids, double age, String type, String nom) {
        super(poids, age, type, nom);
    }

    @Override
    public void bouger() {
        System.out.println("reptile bouge");
    }
}
