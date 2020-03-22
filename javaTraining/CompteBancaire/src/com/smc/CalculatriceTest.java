package com.smc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void add() {
        Calculatrice calculatrice = new Calculatrice();
        int a = 5;
        int b = 6;
        int somme = a+b;
        assertEquals(somme,calculatrice.add(a,b));
    }

    @Test
    void soustraire() {
        Calculatrice calculatrice = new Calculatrice();
        int a = 5;
        int b = 6;
        int dif = (a>b ? a-b : b-a);
        assertEquals(dif, calculatrice.soustraire(a,b));
    }
}