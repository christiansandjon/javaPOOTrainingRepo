package com.smc;

public class CompteBancaire {

    private int numero;
    private double solde;

    public CompteBancaire() {}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws CompteException {
        if(numero < 0) throw new CompteException();
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) throws CompteException {
        if(solde < 0) throw new CompteException();
        this.solde = solde;
    }

    public void afficherSolde(){
        System.out.println("le numero est : "+getNumero()+
                "\net le solde est : "+getSolde());
    }

    public void ajouterMontant(int montant) throws CompteException {
        if(montant < 0 || montant>1000 || montant<10) throw new CompteException();
        System.out.println("le montant "+montant+" euro a ete ajouté");
        solde += montant;
    }

    public void retirerMontant(int montant) throws CompteException {
        if(montant < 0 || montant>solde) throw new CompteException();
        System.out.println("le montant "+montant+" euro a ete retiré");
        solde -= montant;
    }

}
