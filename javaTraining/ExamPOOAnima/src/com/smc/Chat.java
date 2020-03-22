package com.smc;

public class Chat extends Carnivore {

    public Chat(int nbDents) {
        super(nbDents);
    }

    public Chat(String type, String nom, double poids, int nbDents) {
        super(type, nom, poids, nbDents);
    }

    @Override
    public void manger() {
        System.out.println("un chat mange");
    }
}
