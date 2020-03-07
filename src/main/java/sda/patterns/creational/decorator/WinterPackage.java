package sda.patterns.creational.decorator;

public class WinterPackage extends CarDecorator {
    boolean seatHeated;

    public WinterPackage(Car car, boolean seatHeated) {
        super(car);
        this.seatHeated = seatHeated;
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding winter package");
    }
}