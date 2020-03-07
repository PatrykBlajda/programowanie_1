package sda.patterns.creational.facade;

import java.sql.Connection;

public class OracleReportGenerator {
    public static Connection getOracleDBConnection(){
        System.out.println("Retriving connection to Oracle");
        return null;
    }

    public void generateOracleReportPDF(String table, Connection connection) {
        System.out.println("Printing report form"
                + table + " to " + "PDF");
    }
    public void generateOracleReportHTML(String table, Connection connection) {
        System.out.println("Printing report form"
                + table + " to " + "HTML");
    }

}


