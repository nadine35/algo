package fr.afpa;

public class MinusculeMajuscule {
    public static void main(String[] args) {

        String lowerCaseString = "allez-vous faire du roller cet après-midi ?";
        String upperCaseString = minusculeMajuscule(lowerCaseString);
        System.out.println("Chaîne en majuscule : " + upperCaseString);

    }
/**
 * 
 * @param input
 * @return résultat en majuscule
 */
    public static String minusculeMajuscule(String input) {

        if (input == null) {//si l'entrée est nulle
            return null;
        }
        return input.toUpperCase();// sinon retourne en majuscule
    }

}
