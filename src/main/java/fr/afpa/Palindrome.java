package fr.afpa;

import java.text.Normalizer;

public class Palindrome {
    public static void main(String[] args) {
        palindrome("Mon nom");
        String[] phrases = {
                "Mon nom",
                "Esope reste ici et se repose",
                "La mariée ira mal.",
                "Léon, émir cornu, d'un roc rime Noël",
                "Elu par cette crapule",
                "Bonjour"
        };

        for (String phrase : phrases) {
            System.out.println("\"" + phrase + "\" → " + palindrome(phrase));
        }
    }

    /**
     * Vérifie si une chaîne de caractères est un palindrome.
     * Un palindrome est un mot, une phrase, un nombre ou toute autre séquence de
     * symboles qui se lit de la même manière dans les deux sens (de gauche à droite
     * et de droite à gauche). La méthode ignore la casse, les accents, les espaces
     * et
     * les caractères non alphabétiques.
     * 
     * 
     * 
     * 
     * 
     * 
     * @param texte la chaine de caracters à vérifier
     * @return true si la chaîne est un palindrome, false sinon.
     */
    public static boolean palindrome(String texte) {

        // 1. Minuscules
        texte = texte.toLowerCase();

        // 2. Normalisation (enlever accents)
        texte = Normalizer.normalize(texte, Normalizer.Form.NFD);
        texte = texte.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        // 3. Supprimer tout sauf les lettres (pas d'espaces, ni tirets, ni
        // ponctuations)
        texte = texte.replaceAll("[^a-z]", "");

        // 4. Retirer le caractère du milieu si longueur impaire
        if (texte.length() % 2 != 0) {
            int milieu = texte.length() / 2;
            texte = texte.substring(0, milieu) + texte.substring(milieu + 1);
        }

        // 5. Vérifier palindrome
        String inverse = new StringBuilder(texte).reverse().toString();
        return texte.equals(inverse);
    }

}
