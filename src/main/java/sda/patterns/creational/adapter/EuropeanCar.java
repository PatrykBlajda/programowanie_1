package sda.patterns.creational.adapter;

public abstract class EuropeanCar implements EuropeanMovable {
    double speed;

    public double getSpeedMPH() {
        return speed * SpeedConverter.KILOMETERS_TO_MILES.getConverter();
    }
}