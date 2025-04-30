package fr.afpa;

import java.util.Scanner;

public class SommeEntier {
    public static void main(String[] args) {
        sommeE();

    }

    // TODO JavaDoc
    // ✅ Nickel
    /**
     * Calcule et affiche la somme des entiers de 1 à un entier donné.
     * Cette méthode demande à l'utilisateur de saisir un entier. Elle calcule
     * ensuite
     * la somme des entiers allant de 1 jusqu'à ce nombre donné (exclus), puis
     * affiche
     * la somme. Par exemple, si l'utilisateur entre 5, la méthode calcule 1 + 2 + 3
     * + 4.
     * 
     * 
     */
    public static void sommeE() {
        System.out.println("Ecris ton entier");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int somme = 0;
        int index = 1;

        System.out.println("Vous avez saisi l'entier : " + n);

        for (int i = 0; i < n; i++) {
            somme = somme + index;
            index++;
        }
        System.out.println(somme);
        sc.close();

    }

}
