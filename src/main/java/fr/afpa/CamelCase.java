package fr.afpa;

public class CamelCase {
    public static void main(String[] args) {
        String phrase = "way to learn";
        String camelCase = camelCase(phrase);

        System.out.println(camelCase);// Affiche "wayToLearn"
    }
/**
 * 
 * @param phrase
 * @return
 */
    public static String camelCase(String phrase) {
        String[] words = phrase.split(" ");

        // Met le premier mot en minuscule
        StringBuilder camelCasePhrase = new StringBuilder(words[0].toLowerCase());
        // A partir du deuxième mot met la 1ère lettre en majuscule
        for (int i = 1; i < words.length; i++) {
            camelCasePhrase.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1).toLowerCase());

        }
        return camelCasePhrase.toString();

    }

}
