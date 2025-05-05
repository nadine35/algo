package fr.afpa;

public class ChaineInverseCarac {
    public static void main(String[] args) {

        String chaine = "Bonjour le Monde!";
        String chaineInversee = chaineInverseCarac(chaine);
        System.out.println(chaineInversee);

    }

    // L'idée était de ne pas utiliser les fonctions prédéfinies java
    /**
     * 
     * @param chaine
     * @return
     */
    public static String chaineInverseCarac(String chaine) {

        StringBuilder sb = new StringBuilder(chaine);// la méthode StringBuilder respecte la casse
        return sb.reverse().toString();

    }
}
