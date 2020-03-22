package com.company;

import java.util.Scanner;

public class Temperature {

    private double temperature;
    private String unite;

    public Temperature(double temperature, String unite) {

        if (unite == "c" || unite == "C") {
            this.temperature = temperature;
        } else {
            this.temperature = (temperature - 32) *5/9;
        }
        this.unite = unite;
    }

    public double enCell() {
        return temperature;
    }

    public double enFahr() {
        return temperature*9/5 + 32;
    }

    public boolean froid(){
        return enCell() < 15 ? true : false;
    }

    public void chauffage(){
        if (froid()) {
            System.out.println("on allume le chauffage ");
        } else {
            System.out.println("on n'a pas besoin d'allumer le chauffage ");
        }
    }
    public void affichage(){
        System.out.println("il fait "+enCell()+" degre celcius cad "+enFahr()+" fahrenheit");
    }
}
