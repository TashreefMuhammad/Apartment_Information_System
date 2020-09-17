package Model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectMSSQL {
    protected Connection connection;
            
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ApartmentInformationSystem;selectMethod=cursor", "sa", "ISD_AIS_A1_G1");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Email FROM Resident");
            
            
            while (resultSet.next()) {
                
                System.out.println("Customer Email:" + 
                        resultSet.getString("Email"));
                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        ConnectMSSQL cnObj = new ConnectMSSQL();
        cnObj.connectDB();
    }
}
