package fr.afpa;

public class VowelOrConsonant {
    public static void main(String[] args) {

        // déclaration "en dur" d'un caractère
        char charToCheck = 'z';

        vowelOrConsonant(charToCheck);

    }

    // TODO ajouter le javadoc
    // y est une voyelle
    public static char vowelOrConsonant(char charToCheck) {
        // ==
        // opérateur logiques : ET && OU ||
        // déclaration "en dur" d'un caractère

        charToCheck = 'z';
        // Je vérifie par cette fonction si le paramètre est une voyelle
        if (charToCheck == 'a' || charToCheck == 'e' || charToCheck == 'i' || charToCheck == 'o'
                || charToCheck == 'u') {
            // si le paramètre est une voyelle alors la réponse est V, sinon c'est C
            System.out.println("Bonjour voyelle !Je t'attribue la réponse" + "V");
            return 'V';
        } else {
            System.out.println("Bonjour consonne !Je t'attribue la réponse " + "C");
            return 'C';
        }

    }

}
