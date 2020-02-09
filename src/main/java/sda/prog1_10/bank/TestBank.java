package sda.prog1_10.bank;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank ("SDA BANK");
        Customer customer1 = new Customer("Jan", "Kowalski");
        Customer customer2 = new Customer("Maria", "Wróbel");
        Customer customer3 = new Customer("Danuta", "Więcek");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        bank.addAccount(customer1, AccountKind.CURRENT);
        bank.addAccount(customer1, AccountKind.SAVINGS);
        bank.addAccount(customer2, AccountKind.CURRENT);
        bank.addAccount(customer2, AccountKind.SAVINGS);
        bank.addAccount(customer3, AccountKind.CURRENT);
        bank.addAccount(customer3, AccountKind.SAVINGS);

        bank.printCustomerOnList(true);

    }
}
