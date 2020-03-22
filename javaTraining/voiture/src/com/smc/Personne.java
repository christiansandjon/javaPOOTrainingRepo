package com.smc;

import java.util.ArrayList;
import java.util.List;

public class Personne {

    private String nom;
    private String adresse;
    private List<Voiture> voitures;

    public Personne(String nom, String adresse, List<Voiture> voitures) {
        this.nom = nom;
        this.adresse = adresse;
        this.voitures = voitures;
    }

    public void ajouterVoiture(Voiture voiture){
        voitures.add(voiture);
    }


}
