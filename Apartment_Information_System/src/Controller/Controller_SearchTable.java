/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;
/**
 *
 * @author Dragneel
 */
public class Controller_SearchTable {
    Model_TableValues val = new Model_TableValues();
    
    public ArrayList<Controller_SecurityInfo> securityInfoTable(String contact, String name, String present, String perma, String email, int stat){
        return val.securityInfoExtractTable(contact, name, present, perma, email, stat);
    }
    
    public ArrayList<Controller_ResidentInfo> residentInfoTable(String contact, String name,  String nid,String profession,String jobAddress,String email, int stat,int citi_Min){
        return val.residentInfoExtractTable(contact, name, nid, profession,jobAddress, email, stat,citi_Min);
    }
    public ArrayList<Controller_ManagerInfo> managerInfoTable(String contact, String name, String email, String Address,int stat){
        return val.managerInfoExtractTable(contact, name, email,Address, stat);
    }
    
    public ArrayList<Controller_ServiceProviderInfo> ServicePersonalInfoTable(String contact,  String present_Address,String designation){
        return val.servicePersonalInfoExtractTable(contact, present_Address, designation);
    }
}
