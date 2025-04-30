package fr.afpa;

public class MethodeRecursive {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 }; // Exemple de tableau

        int somme = recursive(array, 0);
        System.out.println("La somme des éléments du tableau est : " + somme);

    }

    /**
     * Fonction récursive
     * La fonction s'appelle elle même
     * @param array tableau d'entiers
     * @param index index actuel de l'élément à additionner
     * @return somme des éléments du tableau
     */
    public static int recursive(int[] array, int index) {
        if (index >= array.length) {
            return 0; // Cas de base : fin du tableau
        }

        // Cas récursif : ajouter l'élément courant à la somme du reste
        return array[index] + recursive(array, index + 1);
    }

    /*
     * sommeTableau(array, 3) → retourne 0
     * sommeTableau(array, 2) → 3 + 0 = 3
     * sommeTableau(array, 1) → 2 + 3 = 5
     * sommeTableau(array, 0) → 1 + 5 = 6
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * * /* méthode classique
     * int somme = 0;
     * 
     * for (int i = 0; i < array.length; i++) {
     * somme += array[i];
     * 
     * }
     * System.out.println("La somme des éléments du tableau est : " + somme);
     * return somme;
     * }
     */
}
