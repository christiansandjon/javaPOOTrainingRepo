package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PublicSession extends Session {

    /**
     * fields
     */
    public static final Company ABIS = new Company("ABIS");

    private List<Person> participants = new ArrayList<>();

    /**
     * constructor
     */
    public PublicSession() {
    }

    public PublicSession(Course course, String date, Company location) {
        super(course, date, location);
    }

    public PublicSession(Course course, String date, Company location, Person instructor) {
        super(course, date, location, instructor);
    }

    /**
     * getters setters
     */
    public static Company getABIS() {
        return ABIS;
    }

    /**
     * methods overide
     *
     * @return
     */
    @Override
    public Company getOrganizer() {
        return ABIS;
    }

    @Override
    public double invoice() throws MyException {
        double montant = getCourse().getDayPrice() * getCourse().getDay();
        if (montant<0 || montant >5000 ) throw new MyException();
        return montant;
    }

    public void addEnrolement(Person student) {
                List<Person> students = new ArrayList<>();
                students.add(student);
    }

    public void print() {
        System.out.println("liste des participants : ");
        for (Person person : participants) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + "\n");
        }
    }

    public void getEnrolmentsIterator() {

    }
}
