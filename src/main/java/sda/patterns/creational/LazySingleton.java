package sda.patterns.creational;

public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton() {
        System.out.println("Lazy singleton initialisation");
    }

    public static LazySingleton getInstance() {
        System.out.println("get insatance called");
        if (instance == null){
            System.out.println("first call");
            instance = new LazySingleton();
        }
        System.out.println("any call");
        return instance;
    }

}
