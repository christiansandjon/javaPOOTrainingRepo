package com.company;

    public class Lezard extends Reptile {

    private double vitesse;

    public Lezard() {
    }

    public Lezard(double poids, double age, String type, String nom, double vitesse) {
        super(poids, age, type, nom);
        this.vitesse = vitesse;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public void manger() {
        System.out.println("lezard mange");
    }
}
