package fr.afpa;

import java.util.Scanner;

public class ParticipationEmployeur {
    public static void main(String[] args) {
        participationEmployeur();

    }

    public static void participationEmployeur() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer une lettre");
        // char etatMatrimonial = sc.next().charAt(0);
        String str = sc.nextLine();
        char etatMatrimonial = str.charAt(0);

        System.out.println("Veuillez entrer le nombre d'enfant");
        // je déclare les variables
        int nbreEnfants = sc.nextInt();
        // int nbreEnfants = 0;
        
        System.out.println("Veuillez entrer le salaire");
        // je déclare les variables
        int salaire = sc.nextInt();
      
        double taux = 20;

        if (etatMatrimonial == 'c' || etatMatrimonial == 'C') {

            taux = 20;
        } else { // etatMatrimonial = 'A';
            System.out.println("Votre taux est 25");
            taux = taux + 25;
        }

        if (salaire < 1800) {
            taux = taux + 10;

        }

        if (nbreEnfants > 0 && taux < 50) {
            taux = taux + 15 * nbreEnfants;
        }
        if (taux > 50) {
            taux = 50;

        }

        System.out.println("Votre taux est " + taux);
        sc.close();
    }

}
