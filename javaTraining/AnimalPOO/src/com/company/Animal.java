package com.company;

public abstract class Animal {

    private double poids;
    private double age;
    private String type;
    private String nom;

    public Animal() {
    }

    public Animal(double poids, double age, String type, String nom) {
        this.poids = poids;
        this.age = age;
        this.type = type;
        this.nom = nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void bouger();
    public abstract void manger();
}
