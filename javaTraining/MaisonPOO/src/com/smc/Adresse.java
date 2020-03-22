package com.smc;

public class Adresse {

    // attributs

    private String rue;
    private int numero;
    private String ville;
    private int cP;

    // constructeurs

    public Adresse(String rue, int numero, String ville, int cP) {
        this.rue = rue;
        this.numero = numero;
        this.ville = ville;
        this.cP = cP;
    }

    public String getRue() {
        return rue;
    }

    public int getNumero() {
        return numero;
    }

    public String getVille() {
        return ville;
    }

    public int getcP() {
        return cP;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setcP(int cP) {
        this.cP = cP;
    }

    // methods
    public String afficherAdresseComplete (){
        return "numero "+getNumero()+
                " rue : "+getRue()+
                " ville : "+getVille()+
                "code postal : "+getcP();
    }
}
