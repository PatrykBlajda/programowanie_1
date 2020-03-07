package sda.patterns.creational.facade;

import java.sql.Connection;

public class ReportGenerationFacade {
    public enum DBType{
        MySQL, ORACLE;
    }

    public enum ReportType {
        HTML, PDF;
}

    public static void generateReport(DBType dbType, ReportType reportType, String table) {
        Connection conn = null;
        switch (dbType) {
            case MySQL:
                conn = MySQLReportGenerator.getMySQLDBConnection();
                MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
                switch(reportType) {
                    case HTML:
                        mySQLReportGenerator.generateMySQLReportHTML(table, conn);
                        break;

                    case PDF:
                        mySQLReportGenerator.generateMySQLReportHTML(table, conn);
                        break;
                }
            case ORACLE:
                conn = OracleReportGenerator.getOracleDBConnection();
                OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
                switch (reportType){
                    case HTML:
                        oracleReportGenerator.generateOracleReportPDF(table, conn);
                        break;
                    case PDF:
                        oracleReportGenerator.generateOracleReportPDF(table, conn);
                        break;
                }
                break;
        }
    }
}
