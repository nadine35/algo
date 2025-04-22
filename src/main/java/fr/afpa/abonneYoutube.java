package fr.afpa;

public class AbonneYoutube {
    public static void main(String[] args) {
        abonneYtb();
    }

    public static void abonneYtb() {

        int abonne = 2500;
        // int i = 0;
        int mois = 24;

        for (int i = 0; i < mois; i++) {

            abonne += abonne * 0.05;

        }
        System.out.println("Coucou " + abonne);
    }

}
