package sda.patterns.creational.decorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println("================");
        Car sportCar = new SportPackage(new BasicCar(), true);
        sportCar.assemble();
        System.out.println("================");
        Car winterCar = new WinterPackage(new BasicCar(), true);
        winterCar.assemble();
        System.out.println("================");
        Car sportwinterCar = new SportPackage(new WinterPackage (new BasicCar(), true), true);
        sportwinterCar.assemble();
        System.out.println("================");

    }
}
