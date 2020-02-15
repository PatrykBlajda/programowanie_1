package sda.patterns.creational.abstractFactory;

public class AFObjectFactory {

    public static AFObjectType getObject(AFObjectAbstractFactory abstractFactory) {
        return abstractFactory.createObject();
    }
}
