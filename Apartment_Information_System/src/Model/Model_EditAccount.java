package Model;

import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model_EditAccount {
    public boolean returnvalue(int id_to_edit,String ContactNo,String Name,String Email,String PresentAddress,String PermanentAddress,int active){
        try {      
            
            PreparedStatement stmt = connection.prepareStatement("UPDATE SecurityGuard Set Name=?, Contact_No=?,Present_Address = ?,Permanent_Address = ?,Email=?,Stat=? where  SecurityID='"+id_to_edit+"SID'");

            //  stmt.setString(1, role);
            stmt.setString(1, Name);
            stmt.setString(2, ContactNo);
            stmt.setString(3, PresentAddress);
            stmt.setString(4, PermanentAddress);
            stmt.setString(5, Email);
            stmt.setInt(6, active);

            stmt.executeQuery();
            

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean returnvalue(int id_to_edit,String Contact,String Name,String NID,String Email,String Profession,String Job_Address,int Staying){
        try {      
            
            int sta = 0;
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT Current_Living from Resident WHERE ResidentID='"+id_to_edit+"RID'");
            
            while(rs.next()){
                sta = rs.getInt(1);
            }
            
            PreparedStatement stmt = connection.prepareStatement("UPDATE Resident Set Name=?, Contact_No=?,NID_BID=?,Email=?,Profession = ?,Job_Address = ?,Current_Living=? where  ResidentID='"+id_to_edit+"RID'");

            //  stmt.setString(1, role);
            stmt.setString(1, Name);
            stmt.setString(2, Contact);
            stmt.setString(3, NID);
            stmt.setString(4, Email);
            stmt.setString(5, Profession);
            stmt.setString(6, Job_Address);
            stmt.setInt(7, Staying);

            stmt.execute();
            
            //Edit needed for work also for above related to flat no
            if(Staying != sta){
                if(Staying == 1){
                    stmt = connection.prepareStatement("INSERT into Flat (DTID, DTIN, DTOUT, Flat_No, ResidentID) VALUES () ");
                }else{
                    stmt = connection.prepareStatement("UPDATE Flat set DTOUT = '"+NID+"'WHERE ResidentID = '"+id_to_edit+"RID' AND DTOUT = 'NULL'");
                }
                stmt.execute();
            }
            

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean returnvalue(int id_to_edit,String Contact,String Name,String Email,String Address,int Active){
        try {      
            if(Active==1){
                Statement quw= connection.createStatement();
                quw.execute("Update Manager Set Stat=0");
            }

            PreparedStatement stmt = connection.prepareStatement("UPDATE Manager Set Name=?, Contact_No=?,Permanent_Address = ?,Email=?,Stat=? where ManagerID='"+id_to_edit+"MID'");
            //  stmt.setString(1, role);
            stmt.setString(1, Name);
            stmt.setString(2, Contact);
            stmt.setString(3, Address);
            stmt.setString(4, Email);
            stmt.setInt(5, Active);

            stmt.execute();
            

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean returnvalue(int id_to_edit,String Contact,String Address,String Designation,String FlatNo, String tme){
        try {      
            
            PreparedStatement stmt = connection.prepareStatement("UPDATE ServiceProvider Set Contact_No=?,Present_Address = ?,Designation=? where  SPID='"+id_to_edit+"SPID'");

            //  stmt.setString(1, role);
            stmt.setString(1, Contact);
            stmt.setString(2, Address);
            stmt.setString(3, Designation);
            

            stmt.execute();
            
            // Checking ServiceDuration table
            if(!FlatNo.equals("--")){
                stmt = connection.prepareStatement("UPDATE ServiceDuration Set DTOUT= '"+tme+"' where SPID='"+id_to_edit+"SPID' AND Flat_No = '" + FlatNo+"' AND DTOUT IS NULL");
                stmt.execute();
            }

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
