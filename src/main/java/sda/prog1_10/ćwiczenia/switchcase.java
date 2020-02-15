package sda.prog1_10.ćwiczenia;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class switchcase {

    public static void main(String[] args) {

        System.out.println("podaj liczbę: ");
        Scanner wejscie = new Scanner(System.in);
        int a = wejscie.nextInt();

        switch (a){
            case 1:
                System.out.println("Twoja liczba to 1");
                break;
            case 2:
                System.out.println("Twoja liczba to 2");
                break;
            default:
                System.out.println("Podałeś jakąś inną liczbę :)");
                break;
        }
    }
}