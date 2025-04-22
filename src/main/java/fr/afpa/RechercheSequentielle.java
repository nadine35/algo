package fr.afpa;

public class RechercheSequentielle {
    public static void main(String[] args) {
        sequentiel();
        sequentielWhile();
        sequentielDoWhile();
    }

    public static void sequentiel() {

        // déclaration d'un tableau
        int[] array = { 5, 10, 15, 20, 30, 40, 50 };
        int nombre = 30;

        // on recherche l'index du nombre recherché, ici le nombre entier 30 du tableau
        // array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nombre) {
                System.out.println(array[i]);
            } else {
                System.out.println("Le nombre n'est pas dans le tableau !");
            }
        }

    }

    public static void sequentielWhile() {
        // déclaration d'un tableau
        int[] array = { 5, 10, 15, 20, 30, 40, 50 };

        int i = 4;
        // on recherche l'index du nombre recherché, ici le nombre entier 30 du tableau
        while (i < array.length) {
            System.out.println("Element à l'index" + i + ":" + array[i]);
        }
    }

    public static void sequentielDoWhile() {
        int[] array = { 5, 10, 15, 20, 30, 40, 50 };
        int i = 4;
        do {
            System.out.println("element à l'index" + i + ":" + array[i]);
            i++;
        } while (i < array.length);

    }
}
