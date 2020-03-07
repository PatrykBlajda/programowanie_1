package sda.patterns.creational.proxy;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployees {
    private static List<String> employees;
    public CompanyEmployees() {
        this.employees = new ArrayList<>();
    }
    public static List<String> getEmployees() {
        return employees;
    }
    public static void setEmployees(List<String> employees) {
        CompanyEmployees.employees = employees;
    }
    public static boolean isActiveEmployee (String name) {
        return employees.contains(name);
    }
}