package sda.patterns.creational.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
        testPrototype();
    }catch (CloneNotSupportedException e)

    {
        e.printStackTrace();
    }

    }

    private static void testPrototype() throws CloneNotSupportedException {
    ShoppingList shoppingListTemplate = new ShoppingList();
    shoppingListTemplate.loadData();
    ShoppingList listaZakupowa = (ShoppingList) shoppingListTemplate.clone();
    List<String> zakupy = listaZakupowa.getShoppingList();
    zakupy.add("ser");
        System.out.println("Lista zakupów:");
        zakupy.forEach(System.out::println);
    }
}
