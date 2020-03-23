package com.company;

import java.util.Comparator;

/**
 * This is a simulation of a person, in my computer
 */
public class Person implements Instructor, CourseParticipant, Comparable<Person> {

    /**
     * this is static attribute
     */
    private static int count = 0;
    /**
     * this are fields
     */
    private String firstName;
    private String lastName;
    private int number;
    private Company employer;

    /**
     * this is constructor
     *
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        number = ++count;
        //System.out.println(count+" personne(s) crée(s)");
    }

    /**
     * constructor with company
     *
     * @param firstName
     * @param lastName
     * @param company
     */
    public Person(String firstName, String lastName, Company company) {
        this(firstName, lastName);
        this.number = number;
        this.employer = company;
    }

    // getters and setters

    /**
     *  this getters and setters
     * @return
     */
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonneNumber() {
        return number;
    }

    public Company getEmployer() {
        return employer;
    }

    public void setEmployer(Company employer) {
        this.employer = employer;
    }

    // methods
    public int getNumnerOfPersons() {
        return count;
    }

    @Override
    public void teach() {
        System.out.println( "i teach ");
    }

    @Override
    public void attendCourse() {
        System.out.println( "i attend a course ");
    }

    @Override
    public String toString() {
        return  firstName +
                " " + lastName;
    }

    @Override
    public int compareTo(Person p) {
        return this.getFirstName().compareTo(p.getFirstName());
    }
}
