package fr.afpa;

import java.util.Scanner;

public class AffichagePyramide {
    public static void main(String[] args) {
        affichagePyramide();
    }

    // ✅ Checked
    // Utiliser le FOR quand on connait le nombre d'itération
    // JavaDoc
    public static void affichagePyramide() {
        // System.out.println("Combien de niveau ?");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille de la pyramide: ");
        int rows = scanner.nextInt();
        int i = 1;
        int j = 1;
        while (i <= rows) {

            while (j <= i) {
                System.out.print("*");
                j++;

            }
            System.out.print("\n");
            i++;
            j = 1;// réinitialiser j à 1 dans la boucle
            // interne garantit que chaque itération de la boucle externe
            // commence avec une boucle interne complète,
            // assurant ainsi que toutes les combinaisons de valeurs sont couvertes.

            scanner.close();

        }
    }
}
