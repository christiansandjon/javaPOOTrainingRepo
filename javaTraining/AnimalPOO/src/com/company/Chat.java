package com.company;

    public class Chat extends Carnivore {

    public Chat() {
    }

    public Chat(double poids, double age, String type, String nom, int nbDents) {
        super(poids, age, type, nom, nbDents);
    }


    @Override
    public void manger() {
        System.out.println("chat mange");
    }

}
