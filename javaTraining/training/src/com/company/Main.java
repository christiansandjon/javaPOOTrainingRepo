package com.company;

public class Main {

    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire(200);
      Personne p1 = new ServeurImpl("chris", "sandjon", c1);
      Personne p2 = new ClientImpl("bris", "motio", new CompteBancaire(400));

      ((ClientImpl) p2).payer();
    }
}
