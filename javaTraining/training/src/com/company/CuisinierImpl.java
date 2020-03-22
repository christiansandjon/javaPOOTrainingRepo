package com.company;

public class CuisinierImpl extends Personne implements Cuisinier{

    public CuisinierImpl(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void preparer() {
        System.out.println("je prepare le repas");
    }
}
