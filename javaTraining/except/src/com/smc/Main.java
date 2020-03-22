package com.smc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        Point p = new Point();

        try {
            System.out.println("entrer les coordonnees :");
            int x = clavier.nextInt();
            int y = clavier.nextInt();
            p.setX(x);
            p.setY(y);
            p.afficher();
        } catch ( MauvaiseValeurException e) {
            e.message();
        }


    }
}
