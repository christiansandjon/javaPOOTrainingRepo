package com.smc;

public class Voiture {

    private String chassis;
    private String modele;
    private double consommation;

    public Voiture(String chassis, String modele, double consommation) {
        this.chassis = chassis;
        this.modele = modele;
        this.consommation = consommation;
    }

    public double distance(Ville v1, Ville v2) {
        return
                Math.pow((v1.getLatitude()- v2.getLatitude()),2)
                +
                Math.pow((v1.getLongitude()- v2.getLongitude()),2);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "chassis='" + chassis + '\'' +
                ", modele='" + modele + '\'' +
                "consommation=" +consommation+
                '}';
    }
}
