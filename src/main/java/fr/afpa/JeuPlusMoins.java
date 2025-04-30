package fr.afpa;

import java.util.Random;
import java.util.Scanner;

public class JeuPlusMoins {

    public static void main(String[] args) {
        jeuPlusMoins();
    }
/** */
    public static void jeuPlusMoins() {
        // instanciation d'un objet de la classe Random
        // Random r = new Random();
        // génération d'un nombre >= 0 et < 5
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // int n = r.nextInt(5);
        int nombreMystere = random.nextInt(6);// nombre d'essai utilisateur limité à 5
        int tentative = 0;
        int maxTentative = 5;
        boolean reussi = false;
        int nombreDevine = 0;// variable qui stocke le nombre saisi par l'utilisateur

        System.out.println("Bienvenue au jeu du Plus ou Moins !");
        // System.out.println("Entrez un nombre entre 1 et 5.");

        while (nombreDevine != nombreMystere && tentative < maxTentative && !reussi) {
            System.out.print("Entrez votre nombre : ");// au bout de 5 tentatives c'est fini
            nombreDevine = scanner.nextInt();// on stocke le nbre saisi dans une variable
            tentative++;// on continue la boucle de saisie jusqu'à 5

            if (nombreDevine < nombreMystere) {
                System.out.println("C'est plus !");
            } else if (nombreDevine > nombreMystere) {
                System.out.println("C'est moins !");
            } else {
                System.out
                        .println("Félicitations ! Vous avez trouvé le nombre mystère en " + tentative
                                + " tentative(s).");

            }
        }

        scanner.close();
    }
}
