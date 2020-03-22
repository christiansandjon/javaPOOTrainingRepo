package com.smc;

public abstract class Animal {

    // fields
    protected String type;
    protected String nom;
    protected double poids;
    protected double age;

    // constructor
    public Animal() {
    }

    public Animal(String type, String nom, double poids) {
        this.type = type;
        this.nom = nom;
        this.poids = poids;
        age = 0;
    }

    // methods
    public abstract void manger();
    public abstract void bouger();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", nom='" + nom + '\'' +
                ", poids=" + poids +
                ", age=" + age +
                '}';
    }

    // getter and setter
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
}
