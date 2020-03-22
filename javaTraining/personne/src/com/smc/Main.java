package com.smc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Personne p1 = new Etudiant("chris","motio",487,"info");
        Personne p2 = new Etudiant("greg", "motio", 637, "optique");
        Personne p3 = new Professeur("fievez", "vincent", 123,"info");
        Personne p4 = new Professeur("Hecquet", "jean", 456, "info");



        Etablissement e1 = new Etablissement("ephec");
        e1.ajouterPersonne(p1);
        e1.ajouterPersonne(p2);

        Etablissement e2 = new Etablissement("isfce");
        e2.ajouterPersonne(p3);
        e2.ajouterPersonne(p4);

        Ville v = new Ville("bruxelles");
        v.ajouterEtalissement(e1);
        v.ajouterEtalissement(e2);

        System.out.println("liste des personnes de Ephec");
        e1.afficherListePersonne3();
        System.out.println("liste des personnes de ISFCE");
        e2.afficherListePersonne3();

        System.out.println("liste des etablissements");
        v.afficherListeEtablissement();




    }
}
