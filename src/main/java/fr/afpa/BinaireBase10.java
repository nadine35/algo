package fr.afpa;

public class BinaireBase10 {
    public static void main(String[] args) {
        // binaireBase10();

        String binaryString = "101010";
        String hexString = binaireBase10(binaryString);
        System.out.println("Hexadecimal Equivalent: " + hexString.toUpperCase());

    }

    // L'idée était de faire l'algo sans les fonctions prédéfinies java
    /**
     * 
     * @param binary
     * @return
     */
    public static String binaireBase10(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimal);
    }
}
