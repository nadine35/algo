package fr.afpa;

public class AbonneYoutube {
    public static void main(String[] args) {
        abonneYtb();
    }

    // TODO Ajouter le JavaDoc
    // ✅ Okay
    /**
     * Calcule l'évolution du nombre d'abonnés sur une chaîne YouTube après un
     * nombre donné de mois.
     * Cette méthode simule l'augmentation du nombre d'abonnés d'une chaîne YouTube
     * en appliquant
     * un taux de croissance de 5% chaque mois pendant une période de 24 mois (2
     * ans). Le résultat
     * final est affiché à l'écran.
     * 
     * 
     * 
     */

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
