package com.smc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Refuge {

    private String nom;
    private String adresse;
    List<Animal> animaux;

    public Refuge(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        animaux = new ArrayList<>();
    }

    public void ajouterAnimaux(Animal animal) {
        animaux.add(animal);
    }

    public void trier(){
       // Collections.sort(animaux);
    }

    public void afficher () {
        for (int i=0; i<animaux.size(); i++)
        {
           Animal a = animaux.get(i)  ;
            System.out.println(a.toString());
        }
    }
}
