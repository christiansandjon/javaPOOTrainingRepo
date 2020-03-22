package com.smc;

public class Calculatrice {

    public int add (int a, int b){
        int somme = a+b;
        return somme;
    }

    public int soustraire (int a, int b){
        int dif =0;
        if(a>b) {
            dif = a - b;
        } else {
            dif = b - a;
        }
        return dif;
    }
}
