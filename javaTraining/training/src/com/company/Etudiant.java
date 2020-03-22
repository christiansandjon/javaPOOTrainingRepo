package com.company;

public class Etudiant extends Personne{

    public static double moyenne;

    // constructor
    public Etudiant(String nom, String prenom) {
        super(nom, prenom);
    }

    // methodes
    public double calculMoyenne(double note1, double note2, double note3, double note4) {
        moyenne = (note1+note2+note3+note4)/4;
        return moyenne;
    }

    public boolean reussite(){
       return moyenne > 10 ? true : false;
    }

    public void afficher(){
        System.out.println("l'etudiant "+prenom+" "+nom);
        System.out.println("a obtenu la note de " +
                "\n " +
                moyenne+" / 20");

        if (reussite()) {
            System.out.println("l'etudiant a reussi");
        } else {
            System.out.println("l'etudiant à echoué ");
        }
    }
}
