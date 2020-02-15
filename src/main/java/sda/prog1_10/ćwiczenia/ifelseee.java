package sda.prog1_10.ćwiczenia;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class ifelseee {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        Scanner wejscie2 = new Scanner(System.in);
        System.out.println("podaj długość boku kwadratu");
        double a = wejscie.nextDouble()* sqrt(2);
        System.out.println("podaj długość promienia okręgu");
        double b = wejscie2.nextDouble();

        if (b == (a * 0.5)) {
        System.out.println("kwadrat może być wpisany w okrąg");
    }
        else if (b != (a * 0.5))
            System.out.println("kwadrat nie może być wpisany w okrąg");

    }
}
