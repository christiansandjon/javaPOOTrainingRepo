package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // creer le scanner
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Animal chien = new Chien(20,3,"dalmatien","cado",28,true);
        Animal chat = new Chat(15,5,"gris","cat",22);
        Animal tapir = new Tapir(5,1,"insecte","tapiry");
        Animal crocodile = new Crocodile(200,50,"africain","haligator");
        Animal lezard = new Lezard(5,10,"africa","lezarius", 12);

/*
        // methode 1 tableau
        Animal animaux[] = {chien,chat,tapir,crocodile,lezard};

        // boucle pour encoder mes animaux
        for (int i=0; i<animaux.length; i++){
            // utiliser le scanner
            System.out.println("quel est le nom de l'animal ?");
            String nom = scanner.next();
            animaux[i].setNom(nom);

            System.out.println("quel est son poids ?");
            double poids = scanner.nextDouble();
            animaux[i].setPoids(poids);

        }

        // boucle pour afficher mes animaux
        System.out.println("voici ma liste");
        for (int i=0; i<animaux.length; i++){
            System.out.println(animaux[i].getNom());
        }
*/
// methode liste
        List<Animal> animaux = new ArrayList<>();
        animaux.add(chien);
        animaux.add(chat);
        animaux.add(tapir);
        animaux.add(crocodile);
        animaux.add(lezard);

        // boucle pour afficher mes animaux
        System.out.println("voici ma liste");

        for (int i=0; i<animaux.size(); i++){
            System.out.println(animaux.get(i).getNom());
        }

    }
}
