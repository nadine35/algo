package fr.afpa;

public class Luhn {
    public static void main(String[] args) {

        luhn(79927398713l);
    }

    public static void luhn(long nombre) {
        int[] resultats = new int[20];
        int index = 0;
        // long nombre = 79927398713l;
        // Traitement des chiffres de droite à gauche
        while (nombre > 0) {
            int chiffre = (int) (nombre % 10);// on récupère le dernier chiffre du nombre
            System.out.println(chiffre);
            if (index % 2 == 1) {// si l'index est impair
                chiffre *= 2;// on multiplie le chiffre par 2
            }
            resultats[index] = chiffre;
      
            System.out.println("hihi, le chiffre est = " + chiffre);

            System.out.println("Voici les" + resultats);
       
            nombre /= 10;// on divise par 10 pour traiter le dernier chiffre à chaque fois
            // on supprime le dernier chiffre
            System.out.println("Hello nnnnnn" + nombre);
            index++;
        }

        // Affichage dans l'ordre d'origine (de gauche à droite)
        System.out.print("Résultat : ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(resultats[i] + " ");
        }
        System.out.println();
    }
}
