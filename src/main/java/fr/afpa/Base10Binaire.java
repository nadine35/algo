package fr.afpa;

public class Base10Binaire {

    public static void main(String[] args) {

        base10Binaire(12);
    }

    /**
     * Entier que l'on veut convertir en une chaine de caractère binaire
     * 
     * @param number
     * @return
     */
    public static String base10Binaire(int number) {
        if (number == 0) {
            return "0";
        }
        StringBuilder resultat = new StringBuilder();

        // String resultat = "";// on stocke le résultat dans un string
        while (number > 0) {// tant que le number est sup à 0

            int numberModulo = number % 2;
            resultat.insert(0, numberModulo);// on stocke le modulo de la division dans la variable numberModulo
            // resultat = String.valueOf(numberModulo) + resultat;// on transforme le modulo
            // en string + le résultat
            number = number / 2;
        }
        System.out.println("Voici le résultat :" + resultat);
        return resultat.toString();
    }

}
// public static String base10Binaire(int number) {
// if (number == 0) {
// return "0";
// }

// StringBuilder resultat = new StringBuilder();

// for (; number > 0; number = number / 2) {
// int numberModulo = number % 2;
// resultat.insert(0, numberModulo);
// }

// return resultat.toString();
// }