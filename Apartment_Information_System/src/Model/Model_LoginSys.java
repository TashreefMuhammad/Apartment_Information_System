package Model;

import Controller.*;
import static Model.Model_ConnectMSSQL.connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model_LoginSys {

    public Controller_LoggerInfo verifyInfo(String choice, String contact, String pass) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + choice + " Where Contact_No = '" + contact + "' AND Pass = HASHBYTES('MD5','" + pass + "')");

            if (choice.equals("Resident")) {
                if (resultSet.next()) {
                    return new Controller_LoggerInfo(resultSet.getString("Name"), resultSet.getString("Contact_No"), resultSet.getString("Email"), resultSet.getString("Flat_No"), resultSet.getInt("Current_Living"));
                } else {
                    return new Controller_LoggerInfo(null, null, null, null, 0);
                }
            } else if (choice.equals("SecurityGuard") || choice.equals("Manager")) {
                if (resultSet.next()) {
                    return new Controller_LoggerInfo(resultSet.getString("Name"), resultSet.getString("Contact_No"), resultSet.getString("Email"), null, resultSet.getInt("Stat"));
                } else {
                    return new Controller_LoggerInfo(null, null, null, null, 0);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Controller_LoggerInfo(null, null, null, null, 0);
    }
    
    public boolean chngPass(String email, String choice, String pass) {
        try{
            Statement statement = connection.createStatement();
            statement.executeQuery("UPDATE " + choice + " set Pass = HASHBYTES('MD5','" + pass + "') where Email = '" + email + "'");
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public String resetPass(String email, String pass) {
        String flag = "-1";
        String usermail = "-1";
        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Resident Where Email = '" + email + "'");
            if (flag.equals("-1") && resultSet.next()) {
                flag = "Resident";
                usermail = resultSet.getString("Email");

            }

            resultSet = statement.executeQuery("SELECT * FROM SecurityGuard Where Email = '" + email + "'");
            if (flag.equals("-1") && resultSet.next()) {
                flag = "SecurityGuard";
                usermail = resultSet.getString("Email");
            }

            resultSet = statement.executeQuery("SELECT * FROM Manager Where Email = '" + email + "'");
            if (flag.equals("-1") && resultSet.next()) {
                flag = "Manager";
                usermail = resultSet.getString("Email");
            }

            if (flag.equals("-1")) {
                return usermail;
            }

            statement.executeQuery("UPDATE " + flag + " set Pass = HASHBYTES('MD5','" + pass + "') where Email = '" + email + "'");

            connection.close();
            Model_ConnectMSSQL.connectDB();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return usermail;
    }
}
