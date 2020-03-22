package com.company;

    public class Crocodile extends Reptile {

    public Crocodile() {
    }

    public Crocodile(double poids, double age, String type, String nom) {
        super(poids, age, type, nom);
    }

    @Override
    public void manger() {
        System.out.println("crocodile mange");
    }
}
