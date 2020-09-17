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

    public boolean resetPass(String email) {
        try {
            String flag = "-1";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Resident Where Email = '" + email + "'");

            if (flag.equals("-1") && resultSet.next()) {
                flag = "Resident";
            }

            resultSet = statement.executeQuery("SELECT * FROM SecurityGuard Where Email = '" + email + "'");
            if (flag.equals("-1") && resultSet.next()) {
                flag = "SecurityGuard";
            }

            resultSet = statement.executeQuery("SELECT * FROM Manager Where Email = '" + email + "'");
            if (flag.equals("-1") && resultSet.next()) {
                flag = "Manager";
            }

            if (flag.equals("-1")) {
                return false;
            }

            String refString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
            StringBuilder sb = new StringBuilder(10);
            for (int i = 0; i < 10; i++) {
                int index
                        = (int) (refString.length()
                        * Math.random());

                sb.append(refString.charAt(index));
            }
            System.out.println(sb.toString());
            
            resultSet = statement.executeQuery("UPDATE " + flag + " set Pass = HASHBYTES('MD5','" + sb.toString() + "') where Email = '"+ email + "'");
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
        return true;
    }
}
