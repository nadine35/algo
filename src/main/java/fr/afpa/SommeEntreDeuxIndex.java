package fr.afpa;

public class SommeEntreDeuxIndex {
/**
 * somme entre deux indices ou index
 * @param args
 */
    public static void main(String[] args) {
        int[] array = { 4, 6, 2, 2 };
        int res = sumEntreDeuxIndex(array, 1, 3);
        System.out.println(res);
    }

    public static int sumEntreDeuxIndex(int[] array, int i, int j) {// les paramètres sont mis dans la fonction

        // affichage variable
        int res = 0;
        // Ajoute le nombre de l'index i avec celui de l'index j
        // res = array[i] + array[j];
        for (i = 1; i < j; i++) {
            res += i;
        }
        System.out.println(res);
        return res;

    }

}
