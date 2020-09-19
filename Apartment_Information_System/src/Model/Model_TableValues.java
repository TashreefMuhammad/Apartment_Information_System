package Model;

import Controller.*;
import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Model_TableValues {

    public ArrayList<Controller_SecurityInfo> securityInfoExtractTable(String contact, String name, String present, String perma, String email, int stat) {
        ArrayList<Controller_SecurityInfo> data = new ArrayList<>();

        try {
            PreparedStatement statement;

            if (stat != 2) {
                statement = connection.prepareStatement("SELECT * from SecurityGuard where Name Like '%" + name + "%' AND Contact_No Like '%" + contact + "%' AND Present_Address LIKE '%" + present + "%' AND Permanent_Address LIKE '%" + perma + "%' AND Email LIKE '%" + email + "%' AND Stat = " + stat);
            } else {
                statement = connection.prepareStatement("SELECT * from SecurityGuard where Name Like '%" + name + "%' AND Contact_No Like '%" + contact + "%' AND Present_Address LIKE '%" + present + "%' AND Permanent_Address LIKE '%" + perma + "%' AND Email LIKE '%" + email + "%'");
            }
            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            int row6;
            String row0, row1, row2, row3, row4, row5;
            while (resultSet.next()) {
                row0 = resultSet.getString("SecurityID");
                row1 = resultSet.getString("Name");
                row2 = resultSet.getString("Contact_No");
                row3 = resultSet.getString("Present_Address");
                row4 = resultSet.getString("Permanent_Address");
                row5 = resultSet.getString("Email");
                row6 = resultSet.getInt("Stat");

                row0 = row0.substring(0, row0.length() - 3);
                data.add(new Controller_SecurityInfo(Integer.parseInt(row0), row1, row2, row3, row4, row5, row6));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public ArrayList<Controller_ResidentInfo> residentInfoExtractTable(String contact, String name, String nid, String email, String profession, String jobAddress, int stat, int citi_Min) {
        ArrayList<Controller_ResidentInfo> data = new ArrayList<>();

        try {
            PreparedStatement statement;

            if (stat != 2) {
                if (citi_Min != 2) {
                    statement = connection.prepareStatement("SELECT * from Resident where Name Like '%" + name + "%' AND Contact_No Like '%" + contact + "%' AND Profession LIKE '%" + profession + "%' AND Job_Address LIKE '%" + jobAddress + "%' AND Email LIKE '%" + email + "%' AND Current_Living = " + stat + " AND Citizenship=" + citi_Min);
                } else {
                    statement = connection.prepareStatement("SELECT * from Resident where Name Like '%" + name + "%' AND Contact_No Like '%" + contact + "%' AND Profession LIKE '%" + profession + "%' AND Job_Address LIKE '%" + jobAddress + "%' AND Email LIKE '%" + email + "%' AND Current_Living = " + stat);
                }
            } else {
                if (citi_Min != 2) {
                    statement = connection.prepareStatement("SELECT * from Resident where Name Like '%" + name + "%' AND Contact_No Like '%" + contact + "%' AND Profession LIKE '%" + profession + "%' AND Job_Address LIKE '%" + jobAddress + "%' AND Email LIKE '%" + email + "%' AND Citizenship=" + citi_Min);
                } else {
                    statement = connection.prepareStatement("SELECT * from Resident where Name Like '%" + name + "%' AND Contact_No Like '%" + contact + "%' AND Profession LIKE '%" + profession + "%' AND Job_Address LIKE '%" + jobAddress + "%' AND Email LIKE '%" + email + "%'");
                }
            }
            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            int row6, row7;
            String row0, row1, row2, row3, row4, row5, row8;
            while (resultSet.next()) {
                row0 = resultSet.getString("ResidentID");
                row1 = resultSet.getString("Name");
                row2 = resultSet.getString("Contact_No");
                row3 = resultSet.getString("Profession");
                row4 = resultSet.getString("Job_Address");
                row5 = resultSet.getString("Email");
                row6 = resultSet.getInt("Current_Living");
                row7 = resultSet.getInt("Citizenship");
                row8 = resultSet.getString("Flat_No");

                row0 = row0.substring(0, row0.length() - 3);
                data.add(new Controller_ResidentInfo(Integer.parseInt(row0), row1, row2, "NULL", row5, row3, row4, row6, row7, row8));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public ArrayList<Controller_ManagerInfo> managerInfoExtractTable(String contact, String name, String email, String Address, int stat) {
        ArrayList<Controller_ManagerInfo> data = new ArrayList<>();

        try {
            PreparedStatement statement;

            statement = connection.prepareStatement("SELECT * from Manager where Name Like '%" + name + "%' AND Contact_No Like '%" + contact + "%' AND Permanent_Address LIKE '%" + Address + "%' AND Email LIKE '%" + email + "%' AND Stat = " + 0);

            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            int row6;
            String row0, row1, row2, row3, row4;
            while (resultSet.next()) {
                row0 = resultSet.getString("ManagerID");
                row1 = resultSet.getString("Name");
                row2 = resultSet.getString("Contact_No");
                row3 = resultSet.getString("Permanent_Address");
                row4 = resultSet.getString("Email");
                row6 = resultSet.getInt("Stat");
                row0 = row0.substring(0, row0.length() - 3);
                data.add(new Controller_ManagerInfo(Integer.parseInt(row0), row1, row2, row3, row4, row6));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public ArrayList<Controller_ServiceProviderInfo> servicePersonalInfoExtractTable(String contact, String present_Address, String designation) {
        ArrayList<Controller_ServiceProviderInfo> data = new ArrayList<>();

        try {
            PreparedStatement statement;

            statement = connection.prepareStatement("SELECT * from ServiceProvider where Contact_No Like '%" + contact + "%' AND Present_Address LIKE '%" + present_Address + "%' AND Designation LIKE '%" + designation + "%'");

            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            int row6;
            String row0, row1, row2, row3, row4;
            while (resultSet.next()) {
                row0 = resultSet.getString("SPID");
                row1 = resultSet.getString("Contact_No");
                row2 = resultSet.getString("Name");
                row3 = resultSet.getString("Present_Address");
                row4 = resultSet.getString("Designation");
                row0 = row0.substring(0, row0.length() - 4);

                data.add(new Controller_ServiceProviderInfo(Integer.parseInt(row0), row1, row2, row3,row4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public ArrayList<Controller_GuestInfo> guestInfoExtractTable(String Name, String Contact) {
        ArrayList<Controller_GuestInfo> data = new ArrayList<>();

        try {
            PreparedStatement statement;

            statement = connection.prepareStatement("SELECT * from Guest where Contact_No Like '%" + Contact + "%' AND Name LIKE '%" + Name + "%'");

            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            int row6;
            String row0, row1, row2, row3, row4;
            while (resultSet.next()) {
                row0 = resultSet.getString("GuestID");
                row1 = resultSet.getString("Contact_No");
                row2 = resultSet.getString("Name");

                row0 = row0.substring(0, row0.length() - 3);

                data.add(new Controller_GuestInfo(Integer.parseInt(row0), row1, row2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public ArrayList<Controller_ResidentInfo> whomtovisitExtractTable(String Name, String Flatno) {
        ArrayList<Controller_ResidentInfo> data = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * from Resident where Name Like '%" + Name + "%' AND Flat_No Like '%" + Flatno + "%'");
            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            int row6, row7;
            String row0, row1, row2, row3, row4, row5, row8;
            while (resultSet.next()) {
                row0 = resultSet.getString("ResidentID");
                row1 = resultSet.getString("Name");
                row2 = resultSet.getString("Contact_No");
                row3 = resultSet.getString("Profession");
                row4 = resultSet.getString("Job_Address");
                row5 = resultSet.getString("Email");
                row6 = resultSet.getInt("Current_Living");
                row7 = resultSet.getInt("Citizenship");
                row8 = resultSet.getString("Flat_No");

                row0 = row0.substring(0, row0.length() - 3);
                data.add(new Controller_ResidentInfo(Integer.parseInt(row0), row1, row2, "NULL", row5, row3, row4, row6, row7, row8));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public ArrayList<Controller_ServiceProviderInfo> spVisitExtractTable(String Name, String Contact) {
        ArrayList<Controller_ServiceProviderInfo> data = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * from ServiceProvider where Name Like '%" + Name + "%' AND Contact_No Like '%" + Contact + "%'");
            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            int row6, row7;
            String row0, row1, row2, row3, row4, row5, row8;
            while (resultSet.next()) {
                row0 = resultSet.getString("SPID");
                row1 = resultSet.getString("Contact_No");
                row2 = resultSet.getString("Name");
                row3 = resultSet.getString("Present_Address");
                row4 = resultSet.getString("Designation");

                row0 = row0.substring(0, row0.length() - 4);
                data.add(new Controller_ServiceProviderInfo(Integer.parseInt(row0), row1, row2, row3, row4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

}
