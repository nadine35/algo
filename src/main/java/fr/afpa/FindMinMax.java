package fr.afpa;

//import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
        System.out.println("Hello toi!");

        
        System.out.println("----------------");

        // appel de "findMinMax2"
        findMinMax2();
    }

    /**
     * Proposition 1 d'algorithme pour trouver le minimum et le maximum de trois
     * entiers
     */
    public static void findMinMax1() {
        // Je déclare mes variables
        int var1 = 4;
        int var2 = 7;
        int var3 = 10;

        // Je déclare mes fonctions pour obtenir le min et le max du groupe de chiffre
        int smallest = Math.min(var1, Math.min(var2, var3));
        int biggest = Math.max(var1, Math.max(var2, var3));

        if (var1 < var2 && var1 < var3) {
            smallest = var1;
        } else if (var2 < var3 && var2 < var1) {
            smallest = var2;
        } else {
            smallest = var3;
        }

        if (var1 > var2 && var1 > var3) {
            biggest = var1;
        } else if (var2 < var3 && var2 < var1) {
            biggest = var2;
        } else {
            biggest = var3;
        }

        System.out.println("Le plus petit chiffre est : " + smallest);
        System.out.println("Le plus grand chiffre est : " + biggest);
    }

    /**
     * Proposition 2 d'algorithme pour trouver le minimum et le maximum de trois
     * entiers
     */
    public static void findMinMax2() {

        int value1 = 345;
        int value2 = 3;
        int value3 = 100000000;

        int min = value1;
        int max = value1;

        // Recherche du minimum
        if (value2 < min) {
            min = value2;
        }

        if (value3 < min) {
            min = value3;
        }

        // Recherche du maximum
        if (value2 > max) {
            max = value2;
        }

        if (value3 > max) {
            max = value3;
        }
        System.out.println("Le plus petit chiffre est : " + min);
        System.out.println("Le plus grand chiffre est : " + max);
    }
}
