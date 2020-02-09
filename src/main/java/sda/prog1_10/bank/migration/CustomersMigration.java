package sda.prog1_10.bank.migration;

import sda.prog1_10.bank.Account;
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
}
