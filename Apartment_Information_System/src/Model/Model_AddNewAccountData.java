/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tasin
 */
public class Model_AddNewAccountData {

    public boolean returnval(String name, String nid, String contact, String permanenetadress, String email, String presentadress, String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT COUNT(*) FROM " + role);
            int id = 0;
            String sid = "SID";

            if (res.next()) {
                id = res.getInt(1);
            }
            id++;
            sid = id + sid;
            System.out.println(role);
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (SecurityID, NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES (?, ?, ?, ?, ?, ?, ?, ?,HASHBYTES('MD5', ?) )");

            //  stmt.setString(1, role);
            stmt.setString(1, sid);
            stmt.setString(2, nid);
            stmt.setString(3, name);
            stmt.setString(4, contact);
            stmt.setString(5, presentadress);
            stmt.setString(6, permanenetadress);
            stmt.setString(7, email);
            stmt.setInt(8, 0);
            stmt.setString(9, contact);

            stmt.executeQuery();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }

    public boolean returnval(String name, String nid_bid, int citizenship, String flatno, String contactno, String email, String permanentaddress, String profession, String jobaddress, String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT COUNT(*) FROM " + role);
            int id = 0;
            String sid = "RID";

            if (res.next()) {
                id = res.getInt(1);
            }
            id++;
            sid = id + sid;
            System.out.println(role);
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (ResidentID, NID_BID,Name,Citizenship, Flat_No,Contact_No,Email,Permanent_Address,Profession,Job_Address,Current_Living,Pass) VALUES (?, ?, ?, ?, ?, ?, ?, ? , ? , ? , ? , HASHBYTES('MD5', ?) )");

            //  stmt.setString(1, role);
            stmt.setString(1, sid);
            stmt.setString(2, nid_bid);
            stmt.setString(3, name);
            stmt.setInt(4, citizenship);
            stmt.setString(5, flatno);
            stmt.setString(6, contactno);
            stmt.setString(7, email);
            stmt.setString(8, permanentaddress);
            stmt.setString(9, profession);
            stmt.setString(10, jobaddress);
            stmt.setInt(11, 1);
            stmt.setString(12, contactno);

            stmt.executeQuery();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }

    public boolean returnval(String name, String nid, String contactno, String email, String permanentaddress, String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT COUNT(*) FROM " + role);
            int id = 0;
            String sid = "MID";

            if (res.next()) {
                id = res.getInt(1);
            }
            id++;
            sid = id + sid;
            System.out.println(role);
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (ManagerID,NID,Name,Contact_No,Permanent_Address,Email,Stat,Pass) VALUES (?, ?, ?, ?, ?, ?, ?, HASHBYTES('MD5', ?) )");

            //  stmt.setString(1, role);
            stmt.setString(1, sid);
            stmt.setString(2, nid);
            stmt.setString(3, name);
            stmt.setString(4, contactno);
            stmt.setString(5, permanentaddress);
            stmt.setString(6, email);
            stmt.setInt(7, 0);
            stmt.setString(8, contactno);

            stmt.executeQuery();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
     public boolean returnval(String name, String nid,String contactno, String presentaddress, String permanenetaddress,String designation,String flatno, String explainationofservice,String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT COUNT(*) FROM " + role);
            int id = 0;
            String sid = "SPID";

            if (res.next()) {
                id = res.getInt(1);
            }
            id++;
            sid = id + sid;
            System.out.println(role);
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (SPID,Contact_No,Name,Present_Address,Permanent_Address,Designation) VALUES (?, ?, ?, ?, ?, ? )");

            //  stmt.setString(1, role);
            stmt.setString(1, sid);
            stmt.setString(2, contactno);
            stmt.setString(3, name);
            stmt.setString(4, presentaddress);
            stmt.setString(5, permanenetaddress);
            stmt.setString(6, designation);
         

            stmt.executeQuery();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
     
     public boolean returnval(String namoforg, String reasonofvis,String nid, String name, String contact,String prof,String namofinst,String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT COUNT(*) FROM " + role);
            int id = 0;
            String sid = "OP";

            if (res.next()) {
                id = res.getInt(1);
            }
            id++;
            sid = id + sid;
            System.out.println(role);
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (DTID,ManagerID,Organization_Name,Reason,CountPeople,NID,Name,Contact_No,Profession,WorkInstitute) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )");

            //  stmt.setString(1, role);
            stmt.setString(1, sid);
            stmt.setString(2, mid);
            stmt.setString(3, namoforg);
            stmt.setString(4, reasonofvis);
            stmt.setString(5, count);
            stmt.setString(6, nid);
            stmt.setString(7, name);
            stmt.setString(8, contact);
            stmt.setString(9, prof);
            stmt.setString(10, namofinst);
            
         

            stmt.executeQuery();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
}
