package Model;

import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model_EditAccount {
    public boolean returnvalue(String ContactNo,String Name,String Email,String PresentAddress,String PermanentAddress,int active){
        try {      
            
            PreparedStatement stmt = connection.prepareStatement("UPDATE SecurityGuard Set Name=?, Contact_No=?,Present_Address = ?,Permanent_Address = ?,Email=?,Stat=? where  ContactNo=?");

            //  stmt.setString(1, role);
            stmt.setString(1, Name);
            stmt.setString(2, ContactNo);
            stmt.setString(3, PresentAddress);
            stmt.setString(4, PermanentAddress);
            stmt.setString(5, Email);
            stmt.setInt(6, active);
            stmt.setString(7, ContactNo);

            stmt.executeQuery();
            

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean returnvalue(String Contact,String Name,String NID,String Email,String Profession,String Job_Address,int Staying){
        try {      
            
            PreparedStatement stmt = connection.prepareStatement("UPDATE Resident Set Name=?, Contact_No=?,NID_BID=?,Email=?,Profession = ?,Job_Address = ?,Current_Living=? where  ContactNo=?");

            //  stmt.setString(1, role);
            stmt.setString(1, Name);
            stmt.setString(2, Contact);
            stmt.setString(3, NID);
            stmt.setString(4, Email);
            stmt.setString(5, Profession);
            stmt.setString(6, Job_Address);
            stmt.setInt(7, Staying);

            stmt.executeQuery();
            

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean returnvalue(String Contact,String Name,String Email,String Address,int Active){
        try {      
            
            PreparedStatement stmt = connection.prepareStatement("UPDATE Manger Set Name=?, Contact_No=?,Permanent_Address = ?,Email=?,Stat=? where  ContactNo=?");

            //  stmt.setString(1, role);
            stmt.setString(1, Name);
            stmt.setString(2, Contact);
            stmt.setString(3, Address);
            stmt.setString(4, Email);
            stmt.setInt(5, Active);

            stmt.executeQuery();
            

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean returnvalue(String Contact,String Address,String Designation,String FlatNo){
        try {      
            
            PreparedStatement stmt = connection.prepareStatement("UPDATE ServiceProvider Set Contact_No=?,Present_Address = ?,Designation=? where  ContactNo=?");

            //  stmt.setString(1, role);
            stmt.setString(1, Contact);
            stmt.setString(2, Address);
            stmt.setString(3, Designation);

            stmt.executeQuery();
            

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
