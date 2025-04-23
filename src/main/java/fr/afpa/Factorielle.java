package fr.afpa;

public class Factorielle {
    public static void main(String[] args) {
        factorielle();
    }

    // Il manque la donnée d'entréée qui permet de calculer la factorielle de
    // nombres différents
    // JavaDoc
    // ✅ Bon algo
    public static void factorielle() {
        int i, f = 1;
        // le nombre dont on veut calculer la factorielle
        int nbre = 6;
        //
        for (i = 1; i <= nbre; i++) {
            f = f * i;
        }
        System.out.println("Factorielle du nbre" + nbre + " est: " + f);
        System.out.println(+f);
    }

}
