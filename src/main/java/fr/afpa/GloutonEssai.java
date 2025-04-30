package fr.afpa;

import java.util.Arrays;

public class GloutonEssai {
    public static void main(String[] args) {

        glouton();

    }

    public static void glouton() {
        int[] array = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int sommeMax = 464;
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            while (sommeMax >= array[i]) {//le >= fait qu'il prend en prio la valeur max
                sommeMax -= array[i];
                result[i]++;// incrémente le tableau de résultat du nombre de fois
                // que la valeur des centimes dans le tableau array est utilisé
            }
        }
        if (sommeMax == 0) {
            System.out.println("somme atteinte");
        } else {
            // Sinon, on affiche que la somme exacte ne peut pas être atteinte
            System.out.println("Impossible de faire le montant exact avec les pièces disponibles.");
        }
        System.out.println("Pièces utilisées : " + Arrays.toString(result));
    }
}
