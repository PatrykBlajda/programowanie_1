package sda.patterns.creational.decorator;

public class SportPackage extends CarDecorator{
    boolean sportSeats;
    boolean sportWheel;

    public SportPackage(Car car, boolean sportSeats) {
        super(car);
        this.sportSeats = sportSeats;
        this.sportWheel = false;
    }
        public void addSportWheel(){
            System.out.println("Adding sport wheel");
            this.sportWheel = true;
        }

        @Override
        public void assemble(){
            super.assemble();
            System.out.println("Adding features of Sport");

        }
    }

