package com.smc;

public abstract class Personne {

    // attributs
    private String nom;
    private String prenom;
    private int telephone;
    //aggregation : adresse est desormais une classe dans personne
    private Adresse adresse;

    // constructeur

    // composition
    public Personne(String nom, String prenom, int telephone, int numero, String rue, int cp, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = new Adresse(numero,rue,cp,ville);
    }

    // Agregation : on cree d'abord une adresse à part dans le main qu'on utilisera dans le constructeur de personne
    public Personne(String nom, String prenom, int telephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    // getteurs setteurs

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    // methodes
    public void sePresenter(){
        System.out.println("je m'appelle : "+getPrenom()+" "
                +getNom()+"\nmon numero est : "
                +getTelephone()+"\nj'habite : "
                +this.adresse.afficherAdresse());
    }
}
