package sda.patterns.creational.singleton;



public class BillPughSingleton {
    private BillPughSingleton() {
        System.out.println("BP constructor called");
    }
    private static class SingletonCreator {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        System.out.println("BP get instance");
        return SingletonCreator.INSTANCE;
    }
}