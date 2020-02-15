package sda.patterns.creational.factory;

public class ObjectFactory {

    public static ObjectType getObject(String type, String name, String par1, int par2) {
        if ("type1".equalsIgnoreCase(type)) {
            return new Object1(name, par1, par2);
        }
        else if ("type2".equalsIgnoreCase(type)) {
            return new Object2(name, par1, par2);
    }
        return null;
    }

}
