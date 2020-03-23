package com.company;

import java.util.Timer;

public enum  Course {

    // fileds
    JAVA("Java Programming",8,20),
    JAVAA("Advanced Java",8,25),
    JEE("JavaEE Building entreprise Java_with EJBs",14,30),
    MCS("Mainframe_case_study",6,20),
    LIN("UNIX_LINUX_Shell_programming",4,15),
    SQL("SQL_fundamentals",6,40),
    WEB("Internet_web_enabling_techniques",10,20);
    private String title;
    private int day;
    private double dayPrice;

    // constructor
    Course(String title, int day, double dayPrice) {
        this.title = title;
        this.day = day;
        this.dayPrice = dayPrice;
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }
}
