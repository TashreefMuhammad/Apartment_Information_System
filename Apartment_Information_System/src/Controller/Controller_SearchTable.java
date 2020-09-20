
package Controller;

import Model.*;
import java.util.ArrayList;

public class Controller_SearchTable {
    Model_TableValues val = new Model_TableValues();
    
    //Show Data Security 
    public ArrayList<Controller_SecurityInfo> securityInfoTable(String contact, String name, String present, String perma, String email, int stat){
        return val.securityInfoExtractTable(contact, name, present, perma, email, stat);
    }
    
    //Show Data Resident 
    public ArrayList<Controller_ResidentInfo> residentInfoTable(String contact, String name,  String nid,String profession,String jobAddress,String email, int stat,int citi_Min){
        return val.residentInfoExtractTable(contact, name, nid, profession,jobAddress, email, stat,citi_Min);
    }
    
    //Show Data Manager
    public ArrayList<Controller_ManagerInfo> managerInfoTable(String contact, String name, String email, String Address,int stat){
        return val.managerInfoExtractTable(contact, name, email,Address, stat);
    }
    
    //Show Data Service Provider
    public ArrayList<Controller_ServiceProviderInfo> ServicePersonalInfoTable(String contact,  String present_Address,String designation){
        return val.servicePersonalInfoExtractTable(contact, present_Address, designation);
    }
    
    //Show Data Guest
    public ArrayList<Controller_GuestInfo> GuestInfoTable(String Name,String Contact){
        return val.guestInfoExtractTable(Name,Contact);
    }
    
    //Show Data Resident For Guest Entry
    public ArrayList<Controller_ResidentInfo> WhomtoVisit(String Name,String Flatno){
        return val.whomtovisitExtractTable(Name,Flatno);
    }
    
    //Show Data Service Provider for SP_Entry
    public ArrayList<Controller_ServiceProviderInfo> SPV_Entry(String Name,String Contact){
        return val.spVisitExtractTable(Name,Contact);
    }
    public ArrayList<Controller_ResidentTransaction> fundhistoryTable(int resID){
        return val.fundhistoryTable(resID);
    }
    public ArrayList<Controller_RequestHandle> res_reqHisTable(String rid,String isCom){
        return val.res_req_history(rid,isCom);
    }
    public int retrieve_amount(String Flat_No){
        return val.retrieveAmountinFlat(Flat_No);
    }
}
