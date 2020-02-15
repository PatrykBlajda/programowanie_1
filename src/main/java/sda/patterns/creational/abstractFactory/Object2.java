package sda.patterns.creational.abstractFactory;

public class Object2 extends ObjectType {

    private String o2Name;
    private String o2Par1;
    private int o2Par2;

    public Object2(String o2Name, String o2Par1, int o2Par2) {
        this.o2Name = o2Name;
        this.o2Par1 = o2Par1;
        this.o2Par2 = o2Par2;
    }

    @Override
    public String getName() {
        return o2Name;
    }

    @Override
    public String getPar1() {
        return o2Par1;
    }

    @Override
    public int getPar2() {
        return o2Par2;
    }
}
