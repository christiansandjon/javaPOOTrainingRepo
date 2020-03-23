package com.smc;

public class Main {

    public static void main(String[] args) {
	Hero h1 = new Hero("chris", 10,"hache");
	Hero h2 = new Hero("bris", 10, "couteau");

	do {
        if(h2.getPDV()>0) {
            h2.attaquer(h1);
            h1.monEtat();
        }
        if(h1.getPDV()>0) {
            h1.attaquer(h2);
            h2.monEtat();
        }
    } while (h2.getPDV() < 0 && h1.getPDV() < 0);
        System.out.println("le combat a duré "+ Hero.count+ " round");
    }
}
