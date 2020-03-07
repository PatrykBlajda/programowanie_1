package sda.patterns.creational.facade;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        String table = "Employee";
        Connection connMySQL = MySQLReportGenerator.getMySQLDBConnection();
        MySQLReportGenerator sqlReportGenerator = new MySQLReportGenerator();
        sqlReportGenerator.generateMySQLReportHTML(table, connMySQL);

        System.out.println("====================================================");
        System.out.println("===================Calling by facade================");

        Connection connOracle = OracleReportGenerator.getOracleDBConnection();
        OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
        oracleReportGenerator.generateOracleReportPDF(table, connOracle);

        //CAll report by Facade
        ReportGenerationFacade.generateReport(ReportGenerationFacade.DBType.MySQL, ReportGenerationFacade.ReportType.HTML,table);
        ReportGenerationFacade.generateReport(ReportGenerationFacade.DBType.ORACLE, ReportGenerationFacade.ReportType.PDF,table);

    }
}
