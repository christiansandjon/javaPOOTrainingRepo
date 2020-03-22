package com.smc;

public class Belge extends Personne {

    private String Communauté;

    public Belge(String nom, String prenom, String communauté) {
        super(nom, prenom);
        Communauté = communauté;
    }

    public String getCommunauté() {
        return Communauté;
    }
}
