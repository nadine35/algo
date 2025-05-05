package fr.afpa;

import java.util.Arrays;

public class CalculDeLaMoyenne {
    public static void main(String[] args) {
        int[] array = { 4, 6, 2, 155 };
        int moyenne = calculDeLaMoyenne(array);
        System.out.println("La moyenne est : " + moyenne);
        System.out.println(Arrays.toString(array));
    }

    // ✅ Checked
    /**
     * 
     * @param array
     * @return
     */
    public static int calculDeLaMoyenne(int[] array) {

        if (array == null || array.length == 0) {

            // le tableau ne doit pas être vide
        }

        int somme = 0;
        for (int valeur : array) {
            somme += valeur;

        }
        // return moyenne;
        return (int) somme / array.length;
    }

}
