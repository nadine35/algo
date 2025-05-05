package fr.afpa;

public class DiagonaleTablo2d {

    public static void main(String[] args) {

        // initalisation d'un tableau 2D

        int[][] tableau = {
                { 4, 6, 5, 2 },
                { 7, 11, 34, 1 },
                { 28, 6, 2, 15 },
                { 1, 2, 3, 19 }
        };

        diagonaleTablo2d(tableau, 4, 4, 1);

    }

    // ✅ 👍
    /**
     * somme des val des diagos haut gauche bas droit et droite bas gauche
     * 
     * @param tableau      le tableau 2D (carré)
     * @param width        la largeur (et hauteur) du tableau
     * @param height       la hauteur du tableau (non utilisé ici, car width =
     *                     height)
     * @param diagonalType 1 pour la diagonale principale, 2 pour la diagonale
     *                     secondaire
     * @return la somme des éléments de la diagonale choisie
     */
    public static int diagonaleTablo2d(int[][] tableau, int width, int height, int diagonalType) {

        int sommeDiagonalType1 = 0;
        int sommeDiagonalType2 = 0;

        for (int index = 0; index < width; index++) {

            if (diagonalType == 1) {

                sommeDiagonalType1 += tableau[index][index];
            }

        }
        for (int index = 0; index < width; index++) {
            sommeDiagonalType2 += tableau[index][width - 1 - index];// a chaque valeur à partir de l'indice de j=0,
            // on ajoute la taille du tablo -1 - indice (i=j)

        }

        System.out.println("La valeur de la diagonale haut gauche bas droit est de : " + sommeDiagonalType1);
        System.out.println("La valeur de la diagonale droite bas gauche est de : " + sommeDiagonalType2);
        return sommeDiagonalType1;

    }

}
