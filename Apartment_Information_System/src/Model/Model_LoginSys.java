package Model;

import Controller.*;
import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model_LoginSys {

    public boolean verifyInfo(String choice, String contact, String pass) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + choice + " Where Contact_No = '" + contact + "' AND Pass = HASHBYTES('MD5','" + pass + "')");

            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return true;
    }

    public String resetPass(String email,String pass) {
     
        String flag = "-1";
        String useremail = "-1";

        try {

            Statement statement = connection.createStatement();
            String queory = "SELECT * FROM Resident Where Email = '" + email + "'";
            System.out.println(queory);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Resident Where Email ='"+email+"'");
        System.out.println(email);
        System.out.println(resultSet.next());
            if (flag.equals("-1") && resultSet.next()) {
                
                flag = "Resident";
                useremail = resultSet.getString("Email");
                System.out.println("me madarchod hu");
            }

            resultSet = statement.executeQuery("SELECT * FROM SecurityGuard Where Email = '" + email + "'");
            if (flag.equals("-1") && resultSet.next()) {
                flag = "SecurityGuard";
                useremail = resultSet.getString("Email");
            }

            resultSet = statement.executeQuery("SELECT * FROM Manager Where Email = '" + email + "'");
            if (flag.equals("-1") && resultSet.next()) {
                flag = "Manager";
                useremail = resultSet.getString("Email");
            }

            if (flag.equals("-1")) {
                return useremail;
            }

            resultSet = statement.executeQuery("UPDATE " + flag + " set Pass = HASHBYTES('MD5','" + pass + "') where Email = '" + email + "'");
            /*String query = "UPDATE ? set Pass = HASHBYTES('MD5','?') where Email = ?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, flag);
            preparedStmt.setString(2, sb.toString());
            preparedStmt.setString(3, email);
            preparedStmt.executeQuery();*/
            connection.close();
            Model_ConnectMSSQL.connectDB();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return useremail;
    }
}
