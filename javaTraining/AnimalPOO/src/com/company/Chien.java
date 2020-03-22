package com.company;

public class Chien extends Carnivore {

    private boolean tatoue;

    public Chien() {
    }

    public Chien(double poids, double age, String type, String nom, int nbDents, boolean tatoue) {
        super(poids, age, type, nom, nbDents);
        this.tatoue = tatoue;
    }

    public boolean isTatoue() {
        return tatoue;
    }

    public void setTatoue(boolean tatoue) {
        this.tatoue = tatoue;
    }

    @Override
    public void manger() {
        System.out.println("chien mange");
    }

    public void monterGarde(){
        System.out.println("chien monte la garde");
    }

}
