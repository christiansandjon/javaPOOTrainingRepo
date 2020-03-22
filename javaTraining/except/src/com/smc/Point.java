package com.smc;

public class Point {

    private int x;
    private int y;

    public Point(){

    }
    // exception
    public Point(int x, int y) throws MauvaiseValeurException {
        if (x<0 || y<0) throw new MauvaiseValeurException();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // exception
    public void setX(int x) throws MauvaiseValeurException {
        if (x<0) throw new MauvaiseValeurException();
        this.x = x;
    }
    // exception
    public void setY(int y) throws MauvaiseValeurException{
        if (y<0) throw new MauvaiseValeurException();
        this.y = y;
    }

    public void afficher(){
        System.out.println("mon point a pour coordonnées : ("+getX()+","+getY()+")");
    }
}
