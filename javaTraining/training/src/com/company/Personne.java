package com.company;

abstract public class Personne {

    // fields
    protected String nom;
    protected String prenom;
    protected Adresse adresse;
    protected
    protected CompteBancaire compteBancaire;

    // constructor

    public Personne(String nom, String prenom, CompteBancaire compteBancaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.compteBancaire = compteBancaire;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void payer(Personne p2, int montant){
        Banque banque = new Banque();
        banque.effectuerTransactions(this, p2, montant);
    }
}
