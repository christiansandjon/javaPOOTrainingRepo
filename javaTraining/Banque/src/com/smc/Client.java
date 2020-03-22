package com.smc;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String nom;
    private int numeroCI;
    private List<Compte> comptes;


    public Client() {
    }

    public Client(String nom, int numeroCI, List<Compte> comptes) {
        this.nom = nom;
        this.numeroCI = numeroCI;
        this.comptes = new ArrayList<>();
    }

    public Client(String nom, int numeroCI, CompteVue, CompteDepotType1, CompteDepotType2) {
        this(nom, numeroCI);
        this.compteVue = new CompteVue(com)
        this.comptes = comptes;
    }
}
