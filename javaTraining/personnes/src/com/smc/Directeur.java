package com.smc;

public class Directeur  extends Personne{


    private String communauté;

    public Directeur(String nom, String prenom, int telephone, int numero, String rue, int cp, String ville, String communauté) {
        super(nom, prenom, telephone, numero, rue, cp, ville);
        this.communauté = communauté;
    }

    public Directeur(String nom, String prenom, int telephone, Adresse adresse, String communauté) {
        super(nom, prenom, telephone, adresse);
        this.communauté = communauté;
    }


    public String getCommunauté() {
        return communauté;
    }

    public void setCommunauté(String communauté) {
        this.communauté = communauté;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.println("et je suis de la communauté "+getCommunauté());
    }
}
