/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Controller_SecurityInfo;
import static Model.Model_ConnectMSSQL.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dragneel
 */
public class Model_TableValues {
    public ArrayList<Controller_SecurityInfo> securityInfoExtractTable(String contact, String name, String present, String perma, String email, int stat){
        ArrayList<Controller_SecurityInfo> data = new ArrayList<>();
        
        try {
            PreparedStatement statement;
            
            if(stat != 2){
                statement = connection.prepareStatement("SELECT * from SecurityGuard where Name Like '%"+name+"%' AND Contact_No Like '%"+contact+"%' AND Present_Address LIKE '%"+present+"%' AND Permanent_Address LIKE '%"+perma+"%' AND Email LIKE '%"+email+"%' AND Stat = "+stat);
            }else{
                statement = connection.prepareStatement("SELECT * from SecurityGuard where Name Like '%"+name+"%' AND Contact_No Like '%"+contact+"%' AND Present_Address LIKE '%"+present+"%' AND Permanent_Address LIKE '%"+perma+"%' AND Email LIKE '%"+email+"%'");
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
}
