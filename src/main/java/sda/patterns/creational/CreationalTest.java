package sda.patterns.creational;

import sda.patterns.creational.abstractFactory.*;
import sda.patterns.creational.factory.ObjectFactory;
import sda.patterns.creational.factory.ObjectType;
import sda.patterns.creational.singleton.EagerSingleton;

public class CreationalTest {

    public static void main(String[] args) {
        eagerSingletonTest();
        System.out.println("===============================");
        LazySingletonTest();
        System.out.println("===============================");
        bPughSingletonTest();
        System.out.println("===============================");
        factoryTest();
    }

    public static void eagerSingletonTest (){
        EagerSingleton.getInstance();
        System.out.println("Second call");
        EagerSingleton.getInstance().toString();
    }

    private static void LazySingletonTest() {
        LazySingleton.getInstance();
        System.out.println("Second call");
        LazySingleton.getInstance().toString();
    }

    private static void bPughSingletonTest() {
        BillPughSingleton.getInstance();
        System.out.println("Second call");
        BillPughSingleton.getInstance().toString();
    }

    private static void factoryTest() {
        ObjectType object1 = ObjectFactory .getObject("type1", "Obj1Name", "parameter1", 10);
        ObjectType object2 = ObjectFactory .getObject("type2", "Obj2Name", "parameter2", 10);
        ObjectType object3 = ObjectFactory .getObject("type3", "Obj3Name", "parameter3", 10);
        System.out.println("Print o1:");
        System.out.println(object1);
        System.out.println("Print o2:");
        System.out.println(object2);
        System.out.println("Print o3:");
        System.out.println(object3);
        System.out.println("END");

    }

    private static void abstractFactoryTest () {
        AFObjectType object1 = AFObjectFactory.getObject(
                new AFObject1Factory("Object1", "param1", 2)
        );

        AFObjectType object2 = AFObjectFactory.getObject(
                new AFObject2Factory("Object2", "param11", 22)

        );


}

}


