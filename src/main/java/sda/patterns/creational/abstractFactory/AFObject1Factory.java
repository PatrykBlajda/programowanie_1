package sda.patterns.creational.abstractFactory;

public class AFObject1Factory implements AFObjectAbstractFactory {
    private String name;
    private String par1;
    private int par2;

    @Override
    public AFObjectType createObject() {
        return new AFObject1(name, par1, par2);
    }

    public AFObject1Factory(String name, String par1, int par2) {
        this.name = name;
        this.par1 = par1;
        this.par2 = par2;

    }
}
