package com.smc;

public class Main {

    public static void main(String[] args) {

        Animal chien = new Chien("berger","rocky",30,25,true);
        Animal chat = new Chat("tigre","pitou",25,35);
        Animal crocodile = new Crocodile("aligator", "lacoste", 100);
        Animal lezard = new Lezard("margouillard", "denver", 12,30);
        Animal tapir= new Tapir("volant","taps", 15);

        Refuge refuge = new Refuge("animaux", "waza");

        refuge.ajouterAnimaux(chien);
        refuge.ajouterAnimaux(chat);
        refuge.ajouterAnimaux(crocodile);
        refuge.ajouterAnimaux(lezard);
        refuge.ajouterAnimaux(tapir);

        refuge.afficher();

    }
}
