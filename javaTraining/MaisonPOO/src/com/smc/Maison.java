package com.smc;

public class Maison {

    // fields
    private int nbPieces;
    private double superficie;
    private boolean jardin;
    private boolean garage;
    private Adresse adresse;
    private Proprietaire proprietaire;

    // constructor

    public Maison(int nbPieces, double superficie, String rue, int numero, String ville, int cP) {
        this.nbPieces = nbPieces;
        this.superficie = superficie;
        this.adresse = new Adresse(rue,numero,ville,cP);
        this.jardin = false;
        this.garage = false;
    }

    public Maison(int nbPieces, double superficie, String rue, int numero, String ville, int cP, Proprietaire proprietaire) {
        this.nbPieces = nbPieces;
        this.superficie = superficie;
        this.jardin = false;
        this.garage = false;
        this.adresse = new Adresse(rue,numero,ville,cP);
        this.proprietaire = proprietaire;
    }

    public Maison(int nbPieces, double superficie, Adresse adresse, Proprietaire proprietaire) {
        this.nbPieces = nbPieces;
        this.superficie = superficie;
        this.jardin = false;
        this.garage = false;
        this.adresse = adresse;
        this.proprietaire = proprietaire;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }


    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    // methods

    public String aUnJardin (){
        if(jardin){
            return "la maison a un jardin";
        } else {
            return "";
        }
    }

    public String aUnGarage (){
        if(garage){
            return "la maison dispose d'un garage";
        } else {
            return "";
        }
    }



    // afficher description maison
    public void afficherDescription(){
        System.out.println(
                "nb piece "+getNbPieces()+ "superficie "+getSuperficie()+ aUnJardin()+aUnGarage()
                        +"adresse : "+this.adresse.afficherAdresseComplete()+
                        "proprietaire : "+proprietaire.afficherNomComplet()

        );
    }



}
