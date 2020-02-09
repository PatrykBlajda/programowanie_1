package sda.prog1_10.ćwiczenia;

import java.util.Scanner;

public class ifelsee {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner (System.in);
        System.out.println("podaj długość pierwszego boku");
        double a = wejscie.nextDouble();
        System.out.println("podaj długość drugiego boku");
        double b = wejscie.nextDouble();

        if (a <= 0 | b<=0) {
            System.out.println("niestety to je amelinium tego nie policzysz!");
        }
        else{
            System.out.println("Pole prostokąta to: " + a*b);
        }

    }

}
