package sda.prog1_10.bank.migration;

import sda.prog1_10.bank.Account;
import sda.prog1_10.bank.AccountKind;
import sda.prog1_10.bank.Bank;
import sda.prog1_10.bank.Customer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomersMigration {

    public List<Customer> migrate(String filename, String separator) {
        List<Customer> customers = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
            while(scanner.hasNextLine()){
                String[] lineSplit = scanner.nextLine().split(separator);
                Customer customer = new Customer(lineSplit[1], lineSplit[2]);
                List<Account> accounts = new ArrayList<>();
                for(int index = 3; index <lineSplit.length-1; index+=2) {
                    Account account = new Account (lineSplit[index]);
                    account.deposit(Integer.parseInt(lineSplit[index+1]));
                    accounts.add(account);
                }
                customer.setAccounts(accounts);
                customers.add(customer);
            }
        }
            catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public void addMigratedCustomers(Bank bank, List<Customer> migratedCustomers) {
        //dodajemy identyfikatory zmigrowanym klientom
        migratedCustomers.forEach(k -> {k.setId(bank.getNextCustomerNumber());
            k.getAccounts() .stream() .forEach( r -> {
                //ustawiamy rodzaje kont i pprawiamy numery Iban
                fixAccountKind(r);
                fixAccountNumber(r, bank.getNextAccountNumber());
            });
        });
        //dodajemy zmigrowanych klientów do aktualnych klientów banku
        List<Customer> bankCustomers = bank.getCustomers();
        bankCustomers.addAll(migratedCustomers);
        bank.setCustomers(bankCustomers);
    }
    private void fixAccountNumber(Account r, String nextAccountNumber) {
        r.setAccountNumber(nextAccountNumber);
    }
    private void fixAccountKind(Account account) {
        if ("O".equals(account.getAccountNumber())) {
            account.setAccountKind(AccountKind.SAVINGS);
        }
        account.setAccountKind(AccountKind.CURRENT);
    }
}