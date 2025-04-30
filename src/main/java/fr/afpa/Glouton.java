package fr.afpa;

import java.util.Arrays;

public class Glouton {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] array = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int sommeMax = 464;
        int[] result = glouton(array, sommeMax);
        // Affichage du résultat
        System.out.println("Pièces utilisées : " + Arrays.toString(result));
    }

    /**
     * Rendre la monnaie en utilisant les valeurs maxi du tableau array
     * 
     * @param array    tableau des valeur des centimes
     * @param sommeMax somme maxi à rendre
     * @return un tableau du nombre de valeurs utilisées
     */
    public static int[] glouton(int[] array, int sommeMax) {

        int[] result = new int[array.length];// le tableau de résultat même taille que le
        // nouveau tableau où on va stocker le nbre de pièce

        for (int i = 0; i < array.length; i++) {// on parcours dans le tableau array
            while (sommeMax >= array[i]) {// tant que 464>=valeur des centimes dans array
                sommeMax -= array[i];// nouvelle somme= 464-valeur
                result[i]++; // A chaque valeur utilisée dans array on augmente le nombre de cette pièce
            } // et on le met dans le tableau result; a chaque fois que l'algo utilise une
              // pièce

        }
        if (sommeMax == 0) {
            System.out.println("somme atteinte");
        } else {
            // Sinon, on affiche que la somme exacte ne peut pas être atteinte
            System.out.println("Impossible de faire le montant exact avec les pièces disponibles.");
        }

        return result;
    }
}
