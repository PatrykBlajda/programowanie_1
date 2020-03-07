package sda.patterns.creational;

import sda.patterns.creational.abstractFactory.*;
import sda.patterns.creational.builder.BObject;
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
        System.out.println("===============================");
        abstractFactoryTest();
        System.out.println("===============================");


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
        System.out.println(object1);
        AFObjectType object2 = AFObjectFactory.getObject(
                new AFObject2Factory("Object2", "param11", 22)

        );
        System.out.println(object2);

        }

        private static void builderTest(){
            BObject object = new BObject.ObjectBuilder ("Object 1", "Param 1" ).setPar3(true).build();
            System.out.println(object);
            BObject object2 = new BObject.ObjectBuilder ("Object 2", "Param 1" ).build();
            BObject object3 = new BObject.ObjectBuilder ("Object 3", "Param 1" ).setPar2(10).build();
            BObject object4 = new BObject.ObjectBuilder ("Object 4", "Param 1" ).setPar3(true).setPar2(40).build();

        }

}


