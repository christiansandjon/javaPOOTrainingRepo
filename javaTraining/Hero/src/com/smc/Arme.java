package com.smc;

import java.util.Random;

public class Arme {

    public static int number=0;

    private String nom;

    public Arme(String nom) {
        this.nom = nom;
    }

    public static int getNumber() {
        return number;
    }

    public String getNom() {
        return nom;
    }

    public int degatscouteau()
    {
        Random random = new Random();
        number  = random.nextInt(2)+1;
       return number;
    }
    public int degatsHache()
    {
        Random random = new Random();
        number  = random.nextInt(5)+10;
        return number;
    }
}
