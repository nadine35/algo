package fr.afpa;

import java.util.Arrays;

public class LuhnAutre {
    public static void main(String[] args) {

        luhn(79927398713l);
        // long nombre = 79927398713l;
    }
/**
 * luhn
 * @param nombre
 */
    public static void luhn(long nombre) {
        int[] resultats = new int[14];
        int index = 0;
        int sommeChiffres = 0;
        // long nombre = 79927398713l;
        // Traitement des chiffres de droite à gauche
        while (nombre > 0) {
            int chiffre = (int) (nombre % 10);// on récupère le dernier chiffre du nombre
            System.out.println(chiffre);
            if (index % 2 == 1) {// si l'index est impair(tous les deux chiffres)
                chiffre *= 2;// on multiplie le chiffre par 2
                if (chiffre > 9) {
                    chiffre = chiffre - 9; // ou somme des chiffres : chiffre = (chiffre / 10) + (chiffre % 10)
                }
            }
            resultats[index] = chiffre;
            System.out.println(Arrays.toString(resultats));

            System.out.println("hihi, le chiffre est = " + chiffre);
            nombre /= 10;
            index++;// incrémente le tableau
        }

        for (int i = 0; i < index; i++) {
            sommeChiffres += resultats[i];// somme de tous les
            // chiffres contenus dans le tableau
        }

        System.out.println("La somme de tous les chiffres est : " + sommeChiffres);
        System.out.println(Arrays.toString(resultats));// renvoie un tableau de taille 14(ici 11)
    }

}
