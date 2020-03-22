package com.smc;

public abstract class Reptile extends Animal {

    // constructor
    public Reptile() {
    }

    public Reptile(String type, String nom, double poids) {
        super(type, nom, poids);
    }

    @Override
    public void bouger(){
        System.out.println("un reptile bouge");
    }
}
