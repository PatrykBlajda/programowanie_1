package sda.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable {
    private List<String> shoppingList;

    public ShoppingList() {
        this.shoppingList = new ArrayList<>();
    }

    public ShoppingList(List<String> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public List<String> getShoppingList() {
        return shoppingList;
    }

    public void loadData(){
        shoppingList.add("chleb");
        shoppingList.add("mleko");
        shoppingList.add("mąka");

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>();
        for(String s : this.shoppingList){
            tempList.add(s);
        }
        return new ShoppingList(tempList);
    }
}
