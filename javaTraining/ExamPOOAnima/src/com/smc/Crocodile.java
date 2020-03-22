package com.smc;

public class Crocodile extends Reptile {

   // constructor


    public Crocodile() {
    }

    public Crocodile(String type, String nom, double poids) {
        super(type, nom, poids);
    }

    @Override
    public void manger() {
        System.out.println("un crocodile mange");
    }

}
