package com.smc;

public class CompteException extends Exception {

    public void mauvaisNumeroMessage() {
        System.out.println("numero doit être positif !");
    }

    public void mauvaisSoldeMessage() {
        System.out.println("solde doit etre positif !");
    }
    public void mauvaisMontantMessage() {
        System.out.println("montant doit etre positif !");
    }

    public void montantTropEleveMessage() {
        System.out.println("montant doit pas être trop haut !");
    }

    public void montantTropBasMessage(){
        System.out.println("montant doit pas être trop bas !");
    }
    public void montantplusGrandquesolde(){
        System.out.println("montant doit etre plus petit que solde");
    }
}
