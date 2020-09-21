
package Model;

import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Model_AddNewAccountData {

    int guestID_GE;

    //Adding New Entry to Security Table
    
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

    //Adding New Entry to Resident Table By Manager
    
    public boolean returnval(String dtid, String tme, String name, String nid_bid, int citizenship, String flatno, String contactno, String email, String permanentaddress, String profession, String jobaddress, String role) {
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

            stmt = connection.prepareStatement("INSERT into Flat(DTID,DTIN,DTOUT,Flat_No,ResidentID)VALUES(?,?,?,?,?)");

            stmt.setString(1, dtid + "FL");
            stmt.setString(2, tme);
            stmt.setString(3, "NULL");
            stmt.setString(4, flatno);
            stmt.setString(5, sid);

            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");
        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
    //Adding New Entry to Manager Table by Manager
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
    
    //Adding New Entry to Service Provider Table by Manager
    
    public boolean returnval(String dtid, String tme, String name, String nid, String contactno, String presentaddress, String permanenetaddress, String designation, String flatno, String explainationofservice, String role) {
        try {
            int id = 0;
            String sid = "SPID";
            PreparedStatement stmt;
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("Select * from ServiceProvider where Contact_No = '" + contactno + "SPID'");

            if (res.next()) {
                sid = res.getString("SPID");
            }

            if (sid.equals("SPID")) {
                res = statement.executeQuery("SELECT COUNT(*) FROM " + role);

                if (res.next()) {
                    id = res.getInt(1);
                }
                id++;
                sid = id + sid;
                System.out.println(role);
                stmt = connection.prepareStatement("INSERT INTO " + role + " (SPID,Contact_No,Name,Present_Address,Permanent_Address,Designation) VALUES (?, ?, ?, ?, ?, ? )");

                //  stmt.setString(1, role);
                stmt.setString(1, sid);
                stmt.setString(2, contactno);
                stmt.setString(3, name);
                stmt.setString(4, presentaddress);
                stmt.setString(5, permanenetaddress);
                stmt.setString(6, designation);

                stmt.execute();
            }
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

            stmt = connection.prepareStatement("INSERT into ServiceDuration(DTID,DTIN,Flat_No,SPID,DTOUT)VALUES(?,?,?,?,?)");
            stmt.setString(1, dtid + "SD");
            stmt.setString(2, tme);
            stmt.setString(3, flatno);
            stmt.setString(4, sid);
            stmt.setString(5, "NULL");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
    //Adding New Entry to Official Personnel Table By Manager

    public boolean returnval(String dtid, int mid, String namoforg, String reasonofvis, String nid, String count, String name, String contact, String prof, String namofinst, String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT COUNT(*) FROM " + role);
            int id = 0;
            String sid = "OP";

            if (res.next()) {
                id = res.getInt(1);
            }
            id++;
            sid = dtid + sid;
            System.out.println(role);
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (DTID,ManagerID,Organization_Name,Reason,CountPeople,NID,Name,Contact_No,Profession,WorkInstitute) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )");

            //  stmt.setString(1, role);
            stmt.setString(1, sid);
            stmt.setString(2, mid + "MID");
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
    
    //Adding New Entry to Guest Table by Security

    public boolean returnval(String Name, String Contact, String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT COUNT(*) FROM " + role);
            int id = 0;
            String sid = "GID";

            if (res.next()) {
                id = res.getInt(1);
            }
            id++;

            ///Keeping the ID of the New Guest
            guestID_GE = id;
            sid = id + sid;
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (GuestID,Name,Contact_No) VALUES (?, ?, ?)");

            //  stmt.setString(1, role);
            stmt.setString(1, sid);
            stmt.setString(2, Name);
            stmt.setString(3, Contact);

            stmt.execute();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }

    //Adding New Entry to Guest Entry Table By Security
    
    public boolean returnval(String Dtid, String sec, int resi, int gues, String role) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT SecurityID FROM SecurityGuard where Contact_No='" + sec + "'");
            String id = "NULL";

            if (res.next()) {
                id = res.getString(1);
            }

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + role + " (DTID,SecurityID,ResidentID,GuestID) VALUES (?, ?, ?, ?)");

            //  stmt.setString(1, role);
            stmt.setString(1, Dtid + "GE");
            stmt.setString(2, id);
            stmt.setString(3, resi + "RID");
            stmt.setString(4, gues + "GID");

            stmt.execute();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
    //Adding New Entry to Service Provider Entry Table by Security
    
    public boolean sp_returnval(String Dtid, int id, String Name, String Contact, String Sec_Contact) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT SecurityID FROM SecurityGuard where Contact_No='" + Sec_Contact + "'");
            String Security_id = "NULL";

            if (res.next()) {
                Security_id = res.getString(1);
            }

            ResultSet res1 = statement.executeQuery("SELECT Flat_No FROM ServiceDuration where SPID='" + id + "SPID'");
            String sp_flat = "NULL";
            if (res1.next()) {
                sp_flat = res1.getString(1);
            }

            PreparedStatement stmt = connection.prepareStatement("INSERT INTO ServiceProviderEntry (DTID,SPID,SecurityID,Flat_No) VALUES (?, ?, ?, ?)");

            //  stmt.setString(1, role);
            stmt.setString(1, Dtid + "SPE");
            stmt.setString(2, id + "SPID");
            stmt.setString(3, Security_id);
            stmt.setString(4, sp_flat);

            stmt.execute();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
    //Adding New Entry to Transactiuon Table By  Resident
    
    public boolean trans_returnval(String transID, String time,String payType, String amount, String contact) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT ResidentID FROM Resident where Contact_No='" + contact + "'");
            String res_id = "NULL";

            if (res.next()) {
                res_id = res.getString(1);
            }
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO Fund (TransactionID,DateAndTime,TypeOfPayment,Amount_Paid,ResidentID) VALUES (?, ?, ?, ?, ?)");

            //  stmt.setString(1, role);
            stmt.setString(1, transID);
            stmt.setString(2, time);
            stmt.setString(3, payType);
            stmt.setFloat(4, Float.parseFloat(amount));
            stmt.setString(5, res_id);

            stmt.execute();
            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
    //Adding New Request to Request  Table By Resident
    public boolean req_returnval(String Dtid, String rid,String mid, String req, String explain,String urgency) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT ResidentID FROM Resident where Contact_No='" + rid + "'");
            String res_id = "NULL";

            if (res.next()) {
                res_id = res.getString(1);
            }
            Statement stmt = connection.createStatement();
            stmt.execute("INSERT into Requests(DTID,ResidentID,ManagerID,Main_Request,Descrip,Urgency)VALUES('"+Dtid+"RQ','"+res_id+"',NULL,'"+req+"','"+explain+"',"+Integer.parseInt(urgency)+")");
           

            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
    //Adding New Data to Transaction Table By Manager
    public boolean add_trans(int id,String dtid,String Name, String Desig,String Contact, String Amount, String Flat) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT SPID FROM ServiceProvider where Contact_No='" + Contact + "'");
            String res_id = "NULL";

            if (res.next()) {
                res_id = res.getString(1);
            }
            Statement stmt = connection.createStatement();
            stmt.execute("INSERT into Transactions(DTID,Flat_No,Paid_Amount,SPID,Report,ManagerID)VALUES('"+dtid+"TR','"+Flat+"',"+Float.parseFloat(Amount)+",'"+res_id+"',NULL,'"+id+"MID')");
           

            //ResultSet resultSet = statement.executeQuery("INSERT INTO "+role+"(NID,Name, Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass) VALUES ("+nid+","+name+","+contact","+presentadress+","+permanenetadress+","+email+",0,HASHBYTES('MD5','"+ contact +"') )");

        } catch (SQLException e) {
            System.out.println(e);
        }

        return true;
    }
    
    //Passing the New Guest's ID
    public int returnGuestID() {
        return guestID_GE;
    }
}
