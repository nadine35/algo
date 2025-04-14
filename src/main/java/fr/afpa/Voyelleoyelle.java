package fr.afpa;

public class Voyelleoyelle {
    public static void main(String[] args) {

        // déclaration "en dur" d'un caractère
        char charToCheck = 'z';

        voyelle(charToCheck);

    }

    public static char voyelle(char charToCheck) {

        // ==
        // opérateur logiques : ET && OU ||
        switch (charToCheck) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(charToCheck
                        + " est une voyelle");
                break;
            default:
                System.out.println(charToCheck + " est une consonne");

        }
        return charToCheck;

    }
}
