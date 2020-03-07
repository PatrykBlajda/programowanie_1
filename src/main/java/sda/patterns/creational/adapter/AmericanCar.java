package sda.patterns.creational.adapter;

public abstract class AmericanCar implements AmericanMovable {
    double speed;

    public double getSpeedKMH() {
        return speed * SpeedConverter.MILES_TO_KILOMETERS.getConverter();
    }

}