package com.company;

import java.util.*;

public class Main {

    public static int count = 0;

    public Main() {
    }

    public static void main(String[] args) {


        Company iris = new Company("iris");

        Person christian = new Person(" Christian", "motio", PublicSession.ABIS);
        Person jeff = new Person("jeff", "bedos", PublicSession.ABIS);
        Person abdel = new Person("abdel", "bockstael", PublicSession.ABIS);
        Person nathalie = new Person("nathalie", "bruxells", PublicSession.ABIS);
        Person sophie = new Person("sophie", "ottignies", PublicSession.ABIS);

        List<Person> personList = new ArrayList<>();

        personList.add(christian);
        personList.add(jeff);
        personList.add(abdel);
        personList.add(nathalie);
        personList.add(sophie);
        personList.add(christian);

        Iterator<Person> iter = personList.iterator();
        while (iter.hasNext()){
            Person p = iter.next();
            if ("christian".equalsIgnoreCase(p.getFirstName().trim())){
                iter.remove();
            } else {
                System.out.println(p.getFirstName()+" "+p.getLastName());
            }
        }

        System.out.println("\nliste non-triée ");
        for (Person p : personList){
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }
        Collections.sort(personList);

        System.out.println("\nliste triée ");
        for (Person p : personList){
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }


        Set<Person> personSet = new TreeSet<>();
        personSet.add(christian);
        personSet.add(jeff);
        personSet.add(abdel);
        personSet.add(nathalie);
        personSet.add(sophie);
        personSet.add(christian);

        System.out.println("\nliste triée sans doublon ");
        for (Person p : personSet){
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }

        Session coursAbis = new PublicSession(Course.JAVA, "07 aout 2019", PublicSession.ABIS);


        coursAbis.addEnrolement(christian);
        coursAbis.addEnrolement(jeff);
        coursAbis.addEnrolement(abdel);
        coursAbis.addEnrolement(nathalie);
        coursAbis.addEnrolement(sophie);

        coursAbis.print();

        Session session1 = new PublicSession(Course.JAVA, "07 aout 2019", PublicSession.ABIS);
        Session session2 = new PublicSession(Course.JEE, "17 aout 2019", PublicSession.ABIS);
        Session session3 = new CompanySession(Course.SQL, "01 septembre 2019", PublicSession.ABIS, iris);
        Session session4 = new CompanySession(Course.WEB, "07 septembre 2019", PublicSession.ABIS, iris);


        List<Session> sessions = new ArrayList<>();
        sessions = new ArrayList<>();
        sessions.add(session1);
        sessions.add(session2);
        sessions.add(session3);
        sessions.add(session4);

        for (Session s : sessions) {
            if (s instanceof PublicSession) {
                PublicSession publicSession = (PublicSession) s;
                count++;
                System.out.println("session publique : \ntitre " +
                        publicSession.getCourse().getTitle() + "\njour "
                        + publicSession.getCourse().getDay() + "\nprix par jour "
                        + publicSession.getCourse().getDayPrice() + "\ndate "
                        + publicSession.getDate() + "\nlieu "
                        + publicSession.getLocation().getName() + "\nsociete "
                        + publicSession.getOrganizer().getName() + "\n");
            } else if (s instanceof CompanySession) {
                CompanySession companySession = (CompanySession) s;
                System.out.println("session privée : \ntitre " +
                        companySession.getCourse().getTitle() + "\njour "
                        + companySession.getCourse().getDay() + "\nprix par jour "
                        + companySession.getCourse().getDayPrice() + "\ndate "
                        + companySession.getDate() + "\nlieu "
                        + companySession.getLocation().getName() + "\nsociete "
                        + companySession.getOrganizer().getName() + "\n");
            }
        }
        System.out.println("nous avons finalement " + count + " sessions publiques ");

        // 2
        Service service = new PublicSession(Course.JEE, "07 aout 2019", PublicSession.ABIS);
        Service service1 = new PublicSession(Course.WEB, "17 aout 2019", PublicSession.ABIS);
        Service service2 = new CompanySession(Course.JAVA, "01 septembre 2019", PublicSession.ABIS, iris);
        Service service3 = new Consultancy(300, "Super Consultant");

        List<Service> services = new ArrayList<>();
        services.add(service);
        services.add(service1);
        services.add(service2);
        services.add(service3);

        for (Service s : services) {
            if (s instanceof PublicSession) {
                PublicSession publicSession = (PublicSession) s;
                try {
                    System.out.println("session publique : qui coute " + publicSession.invoice());
                } catch (MyException e) {
                    System.err.println(e.getMessage());
                }
            } else if (s instanceof CompanySession) {
                CompanySession companySession = (CompanySession) s;
                try {
                    System.out.println("session privée : qui coute " + companySession.invoice());
                } catch (MyException e) {
                    System.err.println(e.getMessage());
                }
            } else if (s instanceof Consultancy) {
                Consultancy consultancy = (Consultancy) s;
                try {
                    System.out.println("session consultance : qui coute " + consultancy.invoice()+" pour "+consultancy.getNumberOfConsult()+" prestations");
                } catch (MyException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
}
