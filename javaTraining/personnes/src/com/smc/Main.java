package com.smc;

public class Main {

    public static void main(String[] args) {

        Professeur professeur = new Professeur("chris","john",487594669,548,"chaussee de jette",1090,"Jette","info");

        Adresse mondomicile = new Adresse(548,"chaussee de jette", 1090,"Jette");
        Professeur professeur1 = new Professeur("chris","john",487594669,mondomicile);

        professeur.sePresenter();
        professeur1.sePresenter();
    }
}
