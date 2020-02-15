package sda.patterns.creational.abstractFactory;

public class AFObject2Factory implements AFObjectAbstractFactory {
    private String o2name;
    private String o2par1;
    private int o2par2;

    @Override
    public AFObjectType createObject() {
        return new AFObject1(o2name, o2par1, o2par2);
    }

    public AFObject2Factory(String name, String par1, int par2) {
        this.o2name = name;
        this.o2par1 = par1;
        this.o2par2 = par2;

    }
}
