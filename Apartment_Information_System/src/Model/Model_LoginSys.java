package Model;

import Controller.*;
import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model_LoginSys {

    public Controller_LoggerInfo verifyInfo(String choice, String contact, String pass) {
        String id;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + choice + " Where Contact_No = '" + contact + "' AND Pass = HASHBYTES('MD5','" + pass + "')");

            if (choice.equals("Resident")) {
                if (resultSet.next()) {
                    id = resultSet.getString("ResidentID");
                    id = id.substring(0, id.length() - 3);

                    return new Controller_LoggerInfo(resultSet.getString("Name"), resultSet.getString("Contact_No"), resultSet.getString("Email"), resultSet.getString("Flat_No"), resultSet.getInt("Current_Living"), Integer.parseInt(id));
                } else {
                    return new Controller_LoggerInfo("-1", null, null, null, 0, 0);
                }
            } else if (choice.equals("SecurityGuard") || choice.equals("Manager")) {

                if (resultSet.next()) {
                    if (choice.equals("SecurityGuard")) {
                        id = resultSet.getString("SecurityID");
                    } else {
                        id = resultSet.getString("ManagerID");

                    }

                    id = id.substring(0, id.length() - 3);
                    return new Controller_LoggerInfo(resultSet.getString("Name"), resultSet.getString("Contact_No"), resultSet.getString("Email"), null, resultSet.getInt("Stat"), Integer.parseInt(id));
                } else {
                    return new Controller_LoggerInfo("-1", null, null, null, 0, 0);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Controller_LoggerInfo(null, null, null, null, 0, 0);
    }

    public boolean chngPass(String email, String choice, String pass) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE " + choice + " set Pass = HASHBYTES('MD5','" + pass + "') where Email = '" + email + "'");
            statement.execute();
            
            connection.close();
            Model_ConnectMSSQL.connectDB();
        } catch (SQLException e) {
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
