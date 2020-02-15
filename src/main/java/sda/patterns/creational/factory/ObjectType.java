package sda.patterns.creational.factory;

public abstract class ObjectType {
    public abstract String getName();
    public abstract String getPar1();
    public abstract int getPar2();
    @Override
    public String toString() {
        return "ObjectType{" + this.getName() + "}";
    }
}
