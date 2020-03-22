package com.smc;

public class Lezard extends Reptile{

    protected double vitesse;

    // constructor
    public Lezard(double vitesse) {
        this.vitesse = vitesse;
    }

    public Lezard(String type, String nom, double poids, double vitesse) {
        super(type, nom, poids);
        this.vitesse = vitesse;
    }

    @Override
    public void manger() {
        System.out.println("un lezard mange");
    }

}
