package fr.afpa;

public class LocalisationSousChaine {
    public static void main(String[] args) {
        localisationSousChaine();
    }
/** */
    public static void localisationSousChaine() {
        String str = "Welcome to WayToLearnX";

        int index = str.indexOf("WayToLearnX");// renvoie la première occurrence des caractères de la chaine

        if (index == -1) {// pour tester, à l'indice -1 le mot n'existe pas

            System.out.println("Le mot WayToLearnX n'existe pas");
        } else {
            System.out.println("Le mot WayToLearnX se trouve à l'index : " + index);
        }

    }

}
