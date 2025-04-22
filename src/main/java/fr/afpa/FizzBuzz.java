package fr.afpa;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();

    }

    public static void fizzBuzz() {
        // je déclare mes variables
        int n = 100;
        for (int i = 1; i < n; i++) {
            if (n % 3 == 0) {// si le nombre est divisible par 3
                System.out.println("peut être divisé par 3");
            } else {// si le nombre n'est pas divisible par 3
                System.out.println("Ne peut pas être divisé par 3");
                System.out.println(n);
            }
            if (n % 5 == 0) {// si le nombre est divisible par 5
                System.out.println("Peut être divisé par 5,Buzz");
                System.out.println(n % i);
            } else {
                System.out.println("Ne peut pas être divisé par 5");
                System.out.println(n);
            }
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " est divisible par 3 et 5.");
                System.out.println(" Fizzbuzz");

            }
        }

    }

}
