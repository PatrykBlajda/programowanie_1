package sda.patterns.creational.proxy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompanyEmployees employees = new CompanyEmployees();
        List<String> emploeeList = Arrays.asList("Anna", "Maria", "Karol", "Jan");
        employees.setEmployees(emploeeList);

        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetAccess();
        internetNetwork.getAccess("Maria");
        internetNetwork.getAccess("Marek");
            }
        }


