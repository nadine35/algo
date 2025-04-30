package fr.afpa;

import java.util.Arrays;

public class EchangeDeValeur {
    public static void main(String[] args) {
        int[] array = { 4, 6, 2, 155 };
        echangeDeValeur(array, 1, 3);
        System.out.println(Arrays.toString(array));

    }

    /**
     * Echange de valeur d'un tableau à un autre
     * 
     * @param array
     * @param i
     * @param j
     * @return
     */
    public static boolean echangeDeValeur(int[] array, int i, int j) {
        // Programmation défensive : vérifier en début de fonction la validité des
        // paramètres
        if (i >= array.length && i < 0 && j >= array.length && j < 0) {
            return false;
        }

        int temp = array[i];// je mets l'indice 1 du tableau dans temp
        array[i] = array[j];// je mets l'indice 3 du tableau à la place de l'indice 1
        array[j] = temp;

        return true;
    }
}
