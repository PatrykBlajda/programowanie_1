package sda.patterns.creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Prywatny konstruktor eager singletona");
    }

    public static EagerSingleton getInstance() {
        System.out.println("Get instance called");
        return instance;
    }
}
