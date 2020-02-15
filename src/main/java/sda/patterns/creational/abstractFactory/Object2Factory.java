package sda.patterns.creational.abstractFactory;

public class Object2Factory implements ObjectAbstractFactory {
    private String o2name;
    private String o2par1;
    private int o2par2;

    @Override
    public ObjectType createObject() {
        return new Object1(o2name, o2par1, o2par2);
    }

    public Object2Factory(String name, String par1, int par2) {
        this.o2name = name;
        this.o2par1 = par1;
        this.o2par2 = par2;

    }
}
