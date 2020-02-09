package sda.prog1_10.ćwiczenia;

public class ifelse {

    public static void main(String[] args) {

        int a = 15;
        int b = 3;

        double dzielenie = a % b;

        if (dzielenie==0) {
            System.out.println("Jest zajebiście! Podzieliło się bez reszty!");
        }
        else if (dzielenie != 0) {
            System.out.println("No nistety jest reszta...");

        }
    }
}
