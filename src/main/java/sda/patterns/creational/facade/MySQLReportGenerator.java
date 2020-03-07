package sda.patterns.creational.facade;

import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;

public class MySQLReportGenerator {
    public static Connection getMySQLDBConnection(){
        System.out.println("Retriving connection to MySQL");
        return null;
    }

    public void generateMySQLReportPDF(String table, Connection connection) {
        System.out.println("Printing report form"
    + table + " to " + "PDF");
    }
    public void generateMySQLReportHTML(String table, Connection connection) {
        System.out.println("Printing report form"
    + table + " to " + "HTML");
    }


}
