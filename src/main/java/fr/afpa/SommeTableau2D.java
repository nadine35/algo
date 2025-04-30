package fr.afpa;

public class SommeTableau2D {

    public static void main(String[] args) {

        // width = nombre de colonnes et height = nbre de lignes

        int[][] tableau2D = {
                { 4, 6, 5 },
                { 7, 11, 34 },
                { 28, 6, 2 },
                { 1, 2, 3 },
                { 4, 3, 10 }
        };

        calculerSomme(tableau2D);
    }
/**
 * calculer la somme d'un tableau
 * @param tableau2D
 * @return somme
 */
    public static int calculerSomme(int[][] tableau2D) {
        int somme = 0;
        for (int i = 0; i < tableau2D.length; i++) {
            for (int j = 0; j < tableau2D[i].length; j++) {// j parcours les colonnes de i
                somme += tableau2D[i][j];
            }
        }
        // System.out.println(Arrays.toString(somme));
        System.out.println("la somme des éléments du tableau est " + somme);
        return somme;
    }

}
