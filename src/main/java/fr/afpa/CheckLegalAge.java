package fr.afpa;

import java.util.Scanner;

public class CheckLegalAge {
    public static void main(String[] args) {

        checkLegalAge();
    }

    // Ajouter la JavaDoc
    // TODO Récupérer l'année en cours du système
    /**
     * 
     * @return
     */

    public static boolean checkLegalAge() {
        System.out.println("Ecris ta date de naissance");
        Scanner sc = new Scanner(System.in);

        boolean isAdult;
        int birthYear = 2007;
        int annee = sc.nextInt();
        System.out.println("Vous avez saisi l'année : " + annee);

        if (annee < birthYear) {
            isAdult = true;
            System.out.println("Tu es majeur !");
        } else {
            System.out.println("Tu es mineur !");
            isAdult = false;
        }
        sc.close();
        return isAdult;

    }

}
