package fr.afpa;

public class MinusculeMajuscule {
    public static void main(String[] args) {

        String lowerCaseString = "allez-vous faire du roller cet après-midi ?";
        String upperCaseString = minusculeMajuscule(lowerCaseString);
        System.out.println("Chaîne en majuscule : " + upperCaseString);
        

    }

    public static String minusculeMajuscule(String input) {

        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }
       
        
        
    }

