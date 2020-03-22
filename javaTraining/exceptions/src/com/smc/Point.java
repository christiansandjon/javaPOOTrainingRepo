package com.smc;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) throws ErrConstException {
        if (x < 0 || y < 0) throw new ErrConstException();
        {
            this.x = x;
            this.y = y;
        }
    }

    public void afficher(){
        System.out.println("le point a pour coordonnées ("+getX()+","+getY()+")");
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
