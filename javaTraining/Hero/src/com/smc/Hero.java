package com.smc;

import java.util.Random;

public class Hero {

    // statics fields

    public static int count=0;

    // fields
    public String nom;
    public double PDV;
    public Arme arme;

    // costructor


    public Hero(String nom, double PDV) {
        this.nom = nom;
        this.PDV = PDV;
    }

    public Hero(String nom, double PDV, String armeNom) {
        this.nom = nom;
        this.PDV = PDV;
        arme = new Arme(armeNom);
        System.out.println("bonjour les amis " +
                "je m'appelle " +
                nom+" " +
                "et je suis là pour tuer avec mon/ma "+
                armeNom);
    }

    // getter

    public String getNom() {
        return nom;
    }

    public double getPDV() {
        return PDV;
    }

    // setter
    public void setPDV(double PDV) {
        this.PDV = PDV;
    }

    // methods
    public void attaquer(Hero hero2){
        System.out.println(this.getNom()+" parle :\n"
                +"j'attaque "+hero2.getNom()+" !");

        if (this.arme.getNom() == "couteau"){
            hero2.setPDV(hero2.getPDV() - arme.degatscouteau());
        }
        else if (this.arme.getNom() == "hache"){
            hero2.setPDV(hero2.getPDV() - arme.degatsHache());
        }
         count++;
    }

    public boolean mort(){
        return this.PDV <= 0 ? true : false ;
    }

    public void monEtat(){
        if (!mort()) {
            System.out.println(this.getNom()+" parle :\n"
                    +"je suis toujours là " +
                    "mon sang est de " +
                    this.getPDV());
        } else {
            System.out.println(this.getNom()+" parle :\n"
            +" a dieu les amis mon sang est de "+
                    this.getPDV());
        }
    }
}
