package sda.prog1_10.bank;

import java.util.Objects;

public class Account {

    private AccountKind accountKind;
    private int balance;
    private String accountNumber;

    public Account(AccountKind accountKind, int balance, String accountNumber) {
        this.accountKind = accountKind;
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public Account(String AccountNumber){
        this.accountNumber = accountNumber;
}

    public void setAccountKind(AccountKind accountKind) {
        this.accountKind = accountKind;
    }

    public AccountKind getAccountKind() {
        return accountKind;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

    }

    public void deposit(int amount){
       this.balance += amount;
        System.out.println("wpłata na rachunek " + this.accountNumber + "zaksięgowana");
    }

    public boolean withdraw(int amount){
        if(this.balance < amount) {
            System.out.println("Stan konta " + this.accountNumber + " mniejszy niż żądana kwota : " + amount);
            return false;
        }
        this.balance -= amount;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getAccountNumber(), account.getAccountNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber());
    }
}

