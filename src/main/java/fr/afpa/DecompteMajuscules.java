package fr.afpa;

public class DecompteMajuscules {
    public static void main(String[] args) {
        String chaine = "Bonjour, parlez-vous vietnamien ?";
        int nombreMajuscules = decompteMajuscules(chaine);
        System.out.println("Nombre de majuscules : " + nombreMajuscules);
    }
/**
 * 
 * @param chaine
 * @return
 */
    public static int decompteMajuscules(String chaine) {
        int compteur = 0;
        for (int i = 0; i < chaine.length(); i++) {
            if (Character.isUpperCase(chaine.charAt(i))) {
                compteur++;
            }
        }
        return compteur;
    }
}
