package sda.patterns.creational.adapter;

public class Volvo extends EuropeanCar {
    String name;
    public Volvo(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    @Override
    public double getSpeed() {
        return speed;
    }
}