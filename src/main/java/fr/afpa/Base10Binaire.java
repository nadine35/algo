package fr.afpa;

public class Base10Binaire {

    public static void main(String[] args) {

        base10Binaire(12);
    }

    /**
     * Entier converti en une chaine de caractère binaire
     * 
     * @param number
     * @return
     */
    public static String base10Binaire(int number) {

        String resultat = "";// on stocke le résultat dans un string
        while (number > 0) {
            int numberModulo = number % 2;// on stocke le nombre divisé par 2 dans la variable numberModulo
            resultat = String.valueOf(numberModulo) + resultat;// on transforme le modulo en string + le résultat
            number = number / 2;// tant que le number est sup à 0, on le divise par 2
        }
        System.out.println("Voici le résultat :" + resultat);
        return resultat;
    }

}
