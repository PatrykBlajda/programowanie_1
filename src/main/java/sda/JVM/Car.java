package sda.JVM;

public final class Car {

    private final String engine;
    private final String steringwheel;
    private final String wheels;

    public String getEngine() {
        return engine;
    }

    public String getSteringwheel() {
        return steringwheel;
    }

    public String getWheels() {
        return wheels;
    }

    public Car(String engine, String steringwheel, String wheels) {
        this.engine = engine;
        this.steringwheel = steringwheel;
        this.wheels = wheels;

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", steringwheel='" + steringwheel + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }

    public Car replaceEngine(String NewEngine) {
        return new Car (NewEngine, this.steringwheel, this.wheels);

    }
}
