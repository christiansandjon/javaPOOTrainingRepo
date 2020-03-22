package com.company;

import java.util.Random;

public class DeImpl implements De {

    public static int number = 1;

    @Override
    public void lancer() {
        Random random = new Random();
        number = random.nextInt(5)+1;
    }

    public boolean gagner(){
        return number == 6;
    }
    @Override
    public void lire() {
        System.out.println("le de affiche "+number);
        if(gagner()){
            System.out.println("vous avez gagné ");
        } else {
            System.out.println("vous avez perdu ");
        }
    }
}
