package com.smc;

public class Chien extends Carnivore{

    protected boolean tatoue = true;


    public Chien(int nbDents, boolean tatoue) {
        super(nbDents);
        this.tatoue = tatoue;
    }

    public Chien(String type, String nom, double poids, int nbDents, boolean tatoue) {
        super(type, nom, poids, nbDents);
        this.tatoue = tatoue;
    }

    @Override
    public void manger() {
        System.out.println("un chien mange");
        if (isTatoue()){
            System.out.println("et il est tatoué");
        }
    }

    public void monterGarde(){
        System.out.println("un chien monte la garde");
        if (isTatoue()) {
            System.out.println("et il est tatoué");
        }
    }

    // getter setter

    public boolean isTatoue() {
        return tatoue;
    }
}
