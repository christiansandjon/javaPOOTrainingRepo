package com.smc;

public class Sphere {

    private Point centre;
    private double rayon;


    public Sphere(double rayon, double x, double y) {
        this.rayon = rayon;
        centre = new Point(x,y);
    }

    public double volume(){
       System.out.println("le volume de la sphere est de ");
        double volume = Math.pow(rayon, 3) * Math.PI * 4 / 3;
        return volume;

    }
    public void afficher() {
        System.out.println( "Sphere de centre "+centre.getX() +","+centre.getY()+
                ", de rayon=" + rayon +
                "et de volume "+volume());
    }
}
