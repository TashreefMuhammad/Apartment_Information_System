package Controller;

import Model.*;

public class Controller_AddNewAccount {

    Model_AddNewAccountData givedata = new Model_AddNewAccountData();

    public boolean checkdata(String name, String nid, String contact, String permanenetadress, String email, String presentadress,String role) {
        return givedata.returnval(name, nid, contact, permanenetadress, email, presentadress,role);
    }
    public boolean checkdata(String dtid,String tme,String name, String id, int citizenship,String flatno, String contactno, String email, String permanenetadress, String profession,String jobaddress,String role) {
        return givedata.returnval(dtid,tme,name, id, citizenship, flatno,contactno, email,permanenetadress,profession,jobaddress,role);
    }
    public boolean checkdata(String name, String nid,String contactno,  String email, String permanenetadress,String role) {
        return givedata.returnval(name, nid, contactno, email,permanenetadress,role);
    }
    public boolean checkdata(String dtid,String tme,String name, String nid,String contactno, String presentaddress, String permanenetaddress,String designation,String flatno, String explainationofservice,String role) {
        return givedata.returnval(dtid,tme,name, nid, contactno, presentaddress,permanenetaddress,designation,flatno,explainationofservice,role);
    }
    public boolean checkdata(String dtid,int id,String namoforg, String reasonofvis,String nid,String count_people, String name, String contact,String prof,String namofinst,String role) {
        return givedata.returnval(dtid,id,namoforg, reasonofvis,nid,count_people,name,contact, prof,namofinst,role);
    }
}
