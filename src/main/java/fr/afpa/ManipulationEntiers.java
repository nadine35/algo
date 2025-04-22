package fr.afpa;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulationEntiers {
    public static void main(String[] args) {
        manipulationEntiers();

    }

    public static void manipulationEntiers() {

        Scanner scanner = new Scanner(System.in);

        int index = 0;
        int nombre;
        int total = 0;

        System.out.print("Entrez taille du tableau souaitée : ");
        int tailleTableau = scanner.nextInt();

        // création d'un nouveau tableau avec la taille attendue par l'utilisateur
        int[] tableau = new int[tailleTableau];

        // boucle de remplissage du tableau avec les nombres saisis par l'utilisateur
        do {
            System.out.print("Entrez un entier (ou -1 pour terminer): ");
            nombre = scanner.nextInt();
            if (nombre != -1) {
                tableau[index] = nombre;
                index++;
            }
        } while (nombre != -1 && index < tableau.length);

        scanner.close();
        System.out.println("Les entiers saisis sont :");

        // boucle permettant d'afficher les valeurs contenues dans le tableau
        for (int i = 0; i < index; i++) {
            System.out.println(tableau + "");
            System.out.println(Arrays.toString(tableau));
        }

        // recherche du minimum et du maximum du tableau
        int[] minMaxIndices = IndiceMinMaxTab.findMinMax(tableau);
        int minIndex = minMaxIndices[0];
        int maxIndex = minMaxIndices[1];

        System.out.println("Minimum : " + tableau[minIndex]);
        System.out.println("Maximum : " + tableau[maxIndex]);

        // début du calcul de la moyenne
        for (index = 0; index < tableau.length; index++) {
            total = total + tableau[index];
        }

        int moyenne = total / tableau.length;
        System.out.println("La moyenne est: " + moyenne);

    } // fin de la fonction "manipulationEntiers"

}