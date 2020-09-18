package Controller;

import Model.*;

public class Controller_AddNewAccount {

    Model_AddNewAccountData givedata = new Model_AddNewAccountData();

    public boolean checkdata(String name, String nid, String contact, String permanenetadress, String email, String presentadress,String role) {
        return givedata.returnval(name, nid, contact, permanenetadress, email, presentadress,role);

    }
    
    public boolean checkdata(String name, String id, int citizenship,String flatno, String contactno, String email, String permanenetadress, String profession,String jobaddress,String role) {
        return givedata.returnval(name, id, citizenship, flatno,contactno, email,permanenetadress,profession,jobaddress,role);

    }
    public boolean checkdata(String name, String nid,String contactno,  String email, String permanenetadress,String role) {
        return givedata.returnval(name, nid, contactno, email,permanenetadress,role);

    }
    
}
