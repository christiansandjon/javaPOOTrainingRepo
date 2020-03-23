package com.company;

public class CompanySession extends Session {
    /**
     * fields
     */
    private Company organizer;
    private int numberOfEnrolements;

    /**
     * constructors
     */
    public CompanySession() {
    }

    public static int count = 0;

    public CompanySession(Course course, String date, Company location, Company organizer) {
        super(course, date, location);
        this.organizer = organizer;
        numberOfEnrolements = ++count;
    }
    public CompanySession(Course course, String date, Company location, Person instructor, Company organizer) {
        super(course, date, location, instructor);
        this.organizer = organizer;
        numberOfEnrolements = ++count;
    }

    public CompanySession(Course course, String date, Company location, Company organizer, Person instructor, int numberOfEnrolements) {
        this(course, date, location, instructor, organizer);
        this.numberOfEnrolements = numberOfEnrolements;
    }

    /**
     * getters setters
     */
    public int getNumberOfEnrolements() {
        return numberOfEnrolements;
    }

    public void setNumberOfEnrolements(int numberOfEnrolements) {
        this.numberOfEnrolements = numberOfEnrolements;
    }

    /**
     * overide method
     * @return
     */
    @Override
    public Company getOrganizer() {
        return organizer;
    }

    @Override
    public double invoice() throws MyException {
        double montant = getCourse().getDayPrice()*getCourse().getDay()*getNumberOfEnrolements();
        if (montant<0 || montant >5000 ) throw new MyException();
        return montant;
    }

    @Override
    public void addEnrolement(Person person) {

    }

    @Override
    public void print() {

    }

    public void setOrganizer(Company organizer) {
        this.organizer = organizer;
    }

}
