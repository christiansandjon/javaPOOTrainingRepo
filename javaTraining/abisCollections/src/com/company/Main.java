package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Liste mylist = new Liste();

            mylist.addElements(1,20);

        mylist.printList();
        mylist.removeOdd();
        mylist.printList();
    }

}
