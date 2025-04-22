package fr.afpa;

import java.util.Scanner;

public class SommeEntier {
    public static void main(String[] args) {
        sommeE();

    }

    public static void sommeE() {
        System.out.println("Ecris ton entier");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int somme = 0;
        int index = 1;

        System.out.println("Vous avez saisi l'entier : " + n);

        for (int i = 0; i < n; i++) {
            somme = somme + index;
            index++;
        }
        System.out.println(somme);
        sc.close();

    }

}
