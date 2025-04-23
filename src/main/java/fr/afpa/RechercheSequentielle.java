package fr.afpa;

public class RechercheSequentielle {
    public static void main(String[] args) {
        // sequentiel();
        // sequentielWhile();
        sequentielDoWhile();
    }

    // TODO Respecter le cahier des charges au niveau des valeurs d'entrées et de
    // sortie
    // Comme tu as mis l'instruction System.out.println("Le nombre n'est pas dans le
    // tableau !"); dans la boucle FOR, le message va s'afficher même si le nombre
    // est dans le tableau
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

    // Quand tu es dans une boucle while, il faut gérer la progression de l'indice,
    // sinon tu ne sors jamais de ta boucle
    // TODO Respecter le cahier des charges au niveau des valeurs d'entrées et de
    // sortie
    public static void sequentielWhile() {
        // déclaration d'un tableau
        int[] array = { 5, 10, 15, 20, 30, 40, 50 };

        int i = 4;
        // on recherche l'index du nombre recherché, ici le nombre entier 30 du tableau
        while (i < array.length) {
            System.out.println("Element à l'index" + i + ":" + array[i]);
        }
    }

    // TODO Respecter le cahier des charges au niveau des valeurs d'entrées et de
    // sortie
    // commencer à i = 0 et faire le tests pour savoir si tu as trouver le nombre
    // demandé
    public static void sequentielDoWhile() {
        int[] array = { 5, 10, 15, 20, 30, 40, 50 };
        int i = 4;
        do {
            System.out.println("element à l'index" + i + ":" + array[i]);
            i++;
        } while (i < array.length);

    }
}
