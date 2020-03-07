package sda.patterns.creational.adapter;

public class Main {
    public static void main(String[] args) {
        Volvo volvo = new Volvo ("S40", 240);
        Jeep jeep = new Jeep("Renegade", 170);
        System.out.println(jeep.getName() + "max speed= " + jeep.getSpeed());
        System.out.println(volvo.getName() + "max speed= " + volvo.getSpeed());
        System.out.println(volvo.getName() + "max speed MPH= " + volvo.getSpeedMPH());
    }
    public enum SpeedConverter {
        MILES_TO_KILOMETERS (1.609344),
        KILOMETERS_TO_MILES(0.6213712);
        private double converter;
        SpeedConverter(double converter) {
            this.converter = converter;
        }
        public double getConverter() {
            return converter;
        }
    }
}