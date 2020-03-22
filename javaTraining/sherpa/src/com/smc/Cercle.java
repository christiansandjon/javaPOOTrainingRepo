package com.smc;

import static java.lang.Math.*;

public class Cercle {

    //constantes
   // public final double pi = 3.14;

    // attributs
    private double rayon;

    //constructeur

    public Cercle() {
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }


    // methodes de la classe

    // getter
    public double getRayon(){
        return rayon;
    }

    // setter
    public void setRayon(double rayon){
        this.rayon = rayon;
    }
    // methode

    public void calculPerimetre(){
        double perimetre = 2*PI*rayon;
        System.out.println("Perimetre : "+perimetre);

    }

    public void calculAire(){
        double aire = PI*pow(rayon,2);
        System.out.println("Aire : "+aire);
    }
}
