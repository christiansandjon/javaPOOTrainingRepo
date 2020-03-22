package com.smc;

import java.util.ArrayList;
import java.util.List;

public class Etablissement {

    private String nom;
    private List<Personne> personnes;

    public Etablissement(String nom) {
        this.nom = nom;
        personnes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterPersonne(Personne personne){
        personnes.add(personne);
    }

    // methode 1
    public void afficherListePersonne(){
        for (int i=0; i< personnes.size(); i++){
        Personne personne = personnes.get(i);
            if (personne instanceof Etudiant) {
                Etudiant etudiant = (Etudiant) personne;
                System.out.println(etudiant.nom + " " +
                        etudiant.prenom + " " +
                        etudiant.telephone + " " +
                        etudiant.getFiliere());
            }
            else if (personne instanceof Professeur) {
                Professeur professeur = (Professeur) personne;
                System.out.println(professeur.nom + " " +
                        professeur.prenom + " " +
                        professeur.telephone + " " +
                        professeur.getMatiere());
            }
        }
    }

    // methode 2
    public void afficherListePersonne2(){
        for (Personne personne : personnes) {
            if (personne instanceof Etudiant) {
                Etudiant etudiant = (Etudiant) personne;
                System.out.println(etudiant.nom + " " +
                        etudiant.prenom + " " +
                        etudiant.telephone + " " +
                        etudiant.getFiliere());
            }
            else if (personne instanceof Professeur) {
                Professeur professeur = (Professeur) personne;
                System.out.println(professeur.nom + " " +
                        professeur.prenom + " " +
                        professeur.telephone + " " +
                        professeur.getMatiere());
            }

        }
    }

    public void afficherListePersonne3 (){
        for (int i=0; i<personnes.size(); i++) {
            if (personnes.get(i) instanceof Etudiant){
            Etudiant etudiant = (Etudiant) personnes.get(i);
                System.out.println(etudiant.getNom()+" "+etudiant.getPrenom()+" "+etudiant.getTelephone()+" "+etudiant.getFiliere());
            } else if (personnes.get(i) instanceof Professeur){
                Professeur professeur = (Professeur) personnes.get(i);
                System.out.println(professeur.getPrenom()+" "+professeur.getNom()+" "+professeur.getTelephone()+" "+professeur.getMatiere());
            }
        }

    }
}
