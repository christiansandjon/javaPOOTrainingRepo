package com.company;

public class Consultancy implements Service{

    public static int hourPrice = 200;
    protected int numberOfConsult;
    private String name;

    public Consultancy(int numberOfPrestation, String name) {
        this.numberOfConsult = numberOfPrestation;
        this.name = name;
    }

    @Override
    public double invoice()throws MyException {
        double montant =  hourPrice*numberOfConsult;
        if (montant<0 || montant >5000) throw new MyException();
        return montant ;
    }

    @Override
    public void addEnrolement(Person person) {

    }

    @Override
    public void print() {

    }

    public static int getHourPrice() {
        return hourPrice;
    }

    public int getNumberOfConsult() {
        return numberOfConsult;
    }

    public String getName() {
        return name;
    }
}
