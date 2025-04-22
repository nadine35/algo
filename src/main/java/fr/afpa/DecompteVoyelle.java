package fr.afpa;

public class DecompteVoyelle {
    public static void main(String[] args) {
        String str = "Il fait beau aujourd'hui !";
        int nombreDeVoyelles = decompteVoyelle(str);
        System.out.println("le nombre de voyelles dans la chaine \" " + str + "\":" + nombreDeVoyelles);

    }

    public static int decompteVoyelle(String str) {
        int compteur = 0;
        String voyelles = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (voyelles.indexOf(str.charAt(i)) != -1) {
                compteur++;
            }

        }

        return compteur;
    }

}
