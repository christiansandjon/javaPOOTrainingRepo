package com.smc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Proprietaire chris = new Proprietaire("Jean","JO","avocat");
        Adresse adresse = new Adresse("chausee",548,"Bruxelles",1090);

        Maison maison1 = new Maison(4,75,"chausee",548,"Bruxelles",1090, proprietaire);
        Maison maison2 = new Maison (4,75,adresse,chris);

        maison.afficherDescription();
*/
        Scanner clavier = new Scanner(System.in);

        // maison
        System.out.println("rentrez le nombre de piece : ");
        int nbp = clavier.nextInt();
        System.out.println("rentrez superficie : ");
        double sup = clavier.nextDouble();
        // adresse
        System.out.println("rentrez adresse : rue, numero, ville, cp");
        String rue = clavier.next();
        int num = clavier.nextInt();
        String ville = clavier.next();
        int cp = clavier.nextInt();
        // proprio
        System.out.println("rentrez proprio : nom, prenom, metier");
        String nom = clavier.next();
        String prenom = clavier.next();
        String metier = clavier.next();

        /*
        chris.setNom(nom);
        chris.setPrenom(prnm);
        chris.setMetier(metier);
         */
        // creer un nouveau proprio qui prend les valeurs entrées au clavier
        Proprietaire nassim = new Proprietaire(nom,prenom,metier);
        // creer une nouvelle maison qui prendra les valeurs entrées au clavier
        Maison maison1 = new Maison(nbp,sup,rue,num,ville,cp,nassim);

        System.out.println("jardin ? : oui / non  ");
        String jar = clavier.next();
        if (jar.equals("oui")){
            maison1.setJardin(true);
        }
        else if (jar.equals("non")) {
            maison1.setJardin(false);
        } else {
            System.out.println("reponse incorrecte");
        }

        System.out.println("garage ? : oui / non  ");
        String gar = clavier.next();
        if (gar.equals("oui")){
            maison1.setGarage(true);
        }
        else if (gar.equals("non")){
            maison1.setGarage(false);
        }
        else {
            System.out.println("reponse incorrecte");
        }

            maison1.afficherDescription();

    }
}
