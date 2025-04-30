package fr.afpa;

import java.util.Arrays;
/**
 * Inverser les valeurs d'un tableau
 * return le nouveau tableau
 */
public class InversionTableau {
    public static void main(String[] args) {
        int[] firstArray = { 4, 6, 2, 155 }; // tableau déclaré en "dur" pour l'exemple

        inverserTableau(firstArray);// j'appelle ma fonction

        // Affichage du tableau original
        for (int i : firstArray) {
            System.out.print(i + " ");
        }

    }

    public static int[] inverserTableau(int[] firstArray) {
        // int longueur = firstArray.length;
        int[] newArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {

            newArray[i] = firstArray[firstArray.length - 1 - i];

        }
        // System.out.println(newArray);

        System.out.println(Arrays.toString(newArray));

        return newArray;
    }
}
