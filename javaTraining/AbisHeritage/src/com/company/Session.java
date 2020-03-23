package com.company;

import java.util.ArrayList;
import java.util.List;

abstract public class Session implements Service{

    /**
     * fields
     */
    protected Course course;
    protected String date;
    protected Company location;
    protected Person instructor;

    /**
     * constructors
     */
    public Session() {
    }

    public Session(Course course, String date, Company location) {
        this.course = course;
        this.date = date;
        this.location = location;
    }

    public Session(Course course, String date, Company location, Person instructor) {
        this(course,date,location);
        this.instructor = instructor;
    }

    /**
     * getters setters
     */
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Company getLocation() {
        return location;
    }

    public void setLocation(Company location) {
        this.location = location;
    }

    public Person getInstructor() {
        return instructor;
    }

    public void setInstructor(Person instructor) {
        this.instructor = instructor;
    }
    /**
     * methods
     */
    abstract public Company getOrganizer();

    @Override
    abstract public double invoice() throws MyException;

    abstract public void addEnrolement(Person person);
    public abstract void print();
}
