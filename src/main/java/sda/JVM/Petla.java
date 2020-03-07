package sda.JVM;

public class Petla {
    public static void main(String[] args) {
        int x = 5;

        // pętla nieskończona - ponieważ wartość 'x' się nie zmienia
        // warunek x < 10 zawsze jest spełniony
        while (x < 10) {
            System.out.println("X jest mniejsze od 10 ");
        }
    }
}