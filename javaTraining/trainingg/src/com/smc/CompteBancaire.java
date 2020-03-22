package com.smc;

public class CompteBancaire {

    protected int numero;
    protected double solde;

    public CompteBancaire(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void ajouter(int montant){
        solde+=montant;
    }
    public boolean retirer(int montant){
        if (solde >= montant) {
            solde -= montant;
            return true;
        } else {
            System.out.println("solde insuffisant");
            return false;
        }
    }

    public void afficher(){
        System.out.println(""+
                "compte bancaire numero : "+numero+
                "solde du compte : "+solde);
    }
}
