package com.smc;

public class CompteBancaire {

    private int numero;

    public void calculValidite(String numCompte){
        String valeurTransformee = numCompte.substring(0,(numCompte.length()-3));

        System.out.println(valeurTransformee);
    }
}
