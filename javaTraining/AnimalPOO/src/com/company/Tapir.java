package com.company;

public class Tapir extends Insectivore {
    public Tapir() {
    }

    public Tapir(double poids, double age, String type, String nom) {
        super(poids, age, type, nom);
    }

    @Override
    public void manger() {
        System.out.println("tapir mange");
    }
}
