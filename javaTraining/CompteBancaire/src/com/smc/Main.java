package com.smc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CompteBancaire compte1 = new CompteBancaire();

        // configurer mon clavier
        Scanner clavier = new Scanner(System.in);

        // utiliser le clavier
        System.out.println("entrer un numero de compte");
        int numero = clavier.nextInt();
        try {
            compte1.setNumero(numero);
        } catch (CompteException e) {
            //e.mauvaisNumeroMessage();
            System.out.println("numero doit être positif !");
            System.exit(1);
        }

        System.out.println("entrer un solde pour ce numero");
        double solde = clavier.nextDouble();
        try {
            compte1.setSolde(solde);
        } catch (CompteException e) {
            e.mauvaisSoldeMessage();
            System.exit(1);
        }

        compte1.afficherSolde();

            System.out.println("entrer le montant à ajouter ");
            int montant = clavier.nextInt();

        try {
            compte1.ajouterMontant(montant);
        } catch (CompteException e) {
            e.mauvaisMontantMessage();
            e.montantTropBasMessage();
            e.montantTropEleveMessage();
            System.exit(1);
        }

        compte1.afficherSolde();

            System.out.println("entrer le montant à retirer ");
            int montant2 = clavier.nextInt();

        try {
            compte1.retirerMontant(montant2);
        } catch (CompteException e) {
            e.mauvaisMontantMessage();
            e.montantplusGrandquesolde();
            System.exit(1);
        }
        compte1.afficherSolde();
    }
}
