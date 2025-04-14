package fr.afpa;

import java.util.Scanner;

public class SoldeCompte {
    public static void main(String[] args) {
        soldeCompte();

    }

    public static void soldeCompte() {
        System.out.println("Ecris ton prix");
        Scanner sc = new Scanner(System.in);
// je déclare les variables
        int solde = 100;
        int prixProduit = sc.nextInt();
        int sum = solde - prixProduit;
        System.out.println("Vous avez saisi le prix : " + prixProduit);
        
// je déclare la condition
        if (prixProduit < solde) {
            System.out.println("Il vous reste " + sum);
            System.out.println("Tu peux acheter !");

        } else {
            System.out.println("Le solde est négatif " + sum);
            System.out.println("Tu ne peux pas acheter !");

        }
        sc.close();

    }

}
