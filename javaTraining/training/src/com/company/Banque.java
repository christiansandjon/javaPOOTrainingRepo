package com.company;

public class Banque {

    public void effectuerTransactions(Personne p1, Personne p2, int montant)
    {
       p1.getCompteBancaire().crediter(montant);
       p2.getCompteBancaire().debiter(montant);
    }
}
