package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Liste {


    List<Integer> myList = new ArrayList<>();

    public void addElements(int first, int last) {
        for (int i=first ; i<=last; i++) {
            myList.add(i);
        }
    }

    public void printList() {
        for (Integer l : myList) {
            System.out.println(l);
        }
    }

    public void removeOdd() {
        System.out.println("les elements paires sont : ");
        Iterator<Integer> iterator = myList.iterator();

        for (Integer l : myList) {
            Integer i =  iterator.next();
            if (i % 2 == 1) {
                iterator.remove(i);
            }
        }

    }


}
