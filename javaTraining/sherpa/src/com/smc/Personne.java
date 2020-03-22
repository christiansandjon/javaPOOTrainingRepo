package com.smc;

public class Personne {

    // attributs
    String nom;
    String prenom;
    int age;
    char sexe;
    int telephone;
    String adresse;

    // constructeurs

    public Personne(){}
    public Personne(String nom, String prenom){
        this.nom =nom;
        this.prenom = prenom;
    }
    public Personne( String nom, String prenom, int age, char sexe, int telephone, String adresse ){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    // methodes
    public void sePresenter() {
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(age);
        System.out.println(sexe);
        System.out.println(telephone);
        System.out.println(adresse);
    }
}
