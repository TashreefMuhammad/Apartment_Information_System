package Controller;

import Model.*;

public class Controller_AddNewAccount {

    Model_AddNewAccountData givedata = new Model_AddNewAccountData();

    // Adding Data To Security table
    public boolean checkdata(String name, String nid, String contact, String permanenetadress, String email, String presentadress,String role) {
        return givedata.returnval(name, nid, contact, permanenetadress, email, presentadress,role);
    }
    
    //Adding Data to Resident And Flat
    public boolean checkdata(String dtid,String tme,String name, String id, int citizenship,String flatno, String contactno, String email, String permanenetadress, String profession,String jobaddress,String role) {
        return givedata.returnval(dtid,tme,name, id, citizenship, flatno,contactno, email,permanenetadress,profession,jobaddress,role);
    }
    
    // Adding Data to Manager
    public boolean checkdata(String name, String nid,String contactno,  String email, String permanenetadress,String role) {
        return givedata.returnval(name, nid, contactno, email,permanenetadress,role);
    }
    
    //Adding Data to Service Provider
    public boolean checkdata(String dtid,String tme,String name, String nid,String contactno, String presentaddress, String permanenetaddress,String designation,String flatno, String explainationofservice,String role) {
        return givedata.returnval(dtid,tme,name, nid, contactno, presentaddress,permanenetaddress,designation,flatno,explainationofservice,role);
    }
    
    //Adding Data to Official Personnel
    public boolean checkdata(String dtid,int id,String namoforg, String reasonofvis,String nid,String count_people, String name, String contact,String prof,String namofinst,String role) {
        return givedata.returnval(dtid,id,namoforg, reasonofvis,nid,count_people,name,contact, prof,namofinst,role);
    }
    
    //Adding data to Guest
    public boolean checkdata(String name, String contact,String role) {
        return givedata.returnval(name,contact,role);
    }
    
    //Adding data to Guest Entry
    public boolean checkdata(String Dtid, String sec,int res,int gues,String role) {
        return givedata.returnval(Dtid,sec,res,gues,role);
    }
    
    //Adding data to Service Provider Entry 
    public boolean sp_checkdata(String dtid,int id,String Name,String Contact,String Sec_Contact){
        return givedata.sp_returnval(dtid,id,Name,Contact,Sec_Contact);
    }
    
    //Adding data to Transaction
    public boolean trans_checkdata(String transID,String time,String paymentType,String amount,String contact){
        return givedata.trans_returnval(transID,time,paymentType,amount,contact);
    }
    
    //Adding Data to Request Table
    public boolean req_checkdata(String Dtid,String rid,String mid,String req,String explain,String urgency){
        return givedata.req_returnval(Dtid,rid,mid,req,explain,urgency);
    }
    
    public boolean add_trans(int id,String dtid,String Name,String Desig,String Contact,String Amount,String Flat){
        return givedata.add_trans(id,dtid,Name,Desig,Contact,Amount,Flat);
    }
    //Method to get New Guest's ID
    public int getguestID(){
        return givedata.returnGuestID();
    }
}
