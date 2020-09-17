package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Model_ConnectMSSQL {
    protected static Connection connection;
            
    public static void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ApartmentInformationSystem;selectMethod=cursor", "sa", "ISD_AIS_A1_G1");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}