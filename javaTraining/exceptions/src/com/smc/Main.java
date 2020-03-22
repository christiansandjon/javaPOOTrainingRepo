package com.smc;

public class Main {

    public static void main(String[] args) {

        try {
            Point p = new Point(-3, 4);
            p.afficher();
        } catch (ErrConstException e) {
            e.message();
        }


    }
}
