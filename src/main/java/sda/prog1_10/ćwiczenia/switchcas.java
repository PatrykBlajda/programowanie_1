package sda.prog1_10.ćwiczenia;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class switchcas {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int a = wejscie.nextInt();
        switch (a){
            case 4:
                System.out.println("Twoja liczba to 1 lub 4 lub 8");
                break;
            case 1:
                System.out.println("Twoja liczba to 1 lub 4 lub 8");
                break;
            case 8:
                System.out.println("Twoja liczba to 1 lub 4 lub 8");
                break;
            case 2:
                System.out.println("Twoja liczba to 2 lub 3 lub 7");
                break;
            case 7:
                System.out.println("Twoja liczba to 2 lub 3 lub 7");
                break;
            case 3:
                System.out.println("Twoja liczba to 2 lub 3 lub 7");
                break;
            default:
                System.out.println("podałeś liczbę z poza zakresu");
break;

        }
    }
}
