package fr.afpa;

public class IterationTableau {
    public static void main(String[] args) {
        iterationTableau();
    }

    // JavaDoc
    // ✅ Nickel
    public static void iterationTableau() {

        // déclaration d'un tableau de réèl
        double[] tableau = { 12.2, 11.3, 4.4, 2.0 };
        // Boucle pour parcourir et afficher chaque élément du tableau
        for (double nombre : tableau) {
            System.out.println(nombre);
        }
    }
}
