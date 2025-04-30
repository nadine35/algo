package fr.afpa;

import java.util.Arrays;
/**
 * Fusion de 2 tableaux triés en un seul trié
 */
public class FusionTabloTries {
    public static void main(String[] args) {
        int[] array1 = { 1, 3, 4 };
        int[] array2 = { 2, 4 };
        fusionTabloTries(array1, array2);
    }

    public static int[] fusionTabloTries(int[] array1, int[] array2) {
        int longueur1 = array1.length;// longueur du array1
        int longueur2 = array2.length;// longueur du array2
        int[] fusionTableau = new int[longueur1 + longueur2];// fusion longueurs pour obtenir
        // la taille du nouveau tableau

        int i = 0;// indice tableau 1
        int j = 0;// indice tableau 2
        int k = 0;// indice tableau nouveau

        while (i < longueur1 && j < longueur2) {// tant que indices array1 <taille de array1 et de array2
            if (array1[i] <= array2[j]) {// si la valeur des indices du array1 <= valeur du array2
                fusionTableau[k++] = array1[i++];// alors chaque valeur de array1 vont dans le nouveau tableau

            } else {
                fusionTableau[k++] = array2[j++];// sinon les valeurs de array2 vont dans le nouveau tableau
            }
        }
        while (i < longueur1) {// on n'a pas fini de parcourir array1
            fusionTableau[k++] = array1[i++];
        }
        while (j < longueur2) {// on n'a pas fini de parcourir array2
            fusionTableau[k++] = array2[j++];
        }
        System.out.println("Voici le tableau fusionné :" + Arrays.toString(fusionTableau));
        return fusionTableau;
    }

}
