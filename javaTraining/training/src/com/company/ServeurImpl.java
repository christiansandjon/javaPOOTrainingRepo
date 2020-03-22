package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServeurImpl extends Personne implements Serveur {

    private List<Commande> commandes;

    public ServeurImpl(String nom, String prenom, CompteBancaire compteBancaire) {
        super(nom, prenom, compteBancaire );
        commandes = new ArrayList<>();
    }

    @Override
    public void prendreCommande() {
        System.out.println("je prend des commandes");
      //  commandes.add(Commande commande);
    }

    @Override
    public void servir() {
        System.out.println("je sers les clients");
    }
}
