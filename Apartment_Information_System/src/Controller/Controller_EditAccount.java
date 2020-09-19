
package Controller;
import Model.*;

public class Controller_EditAccount {
    Model_EditAccount givendata = new Model_EditAccount();
    public boolean editinfo(int id_to_Edit,String ContactNo,String Name,String Email,String PresentAddress,String PermanentAddress,int active){
        return givendata.returnvalue(id_to_Edit,ContactNo, Name, Email, PresentAddress, PermanentAddress, active);
    }
    
    public boolean editinfo(int id_to_edit,String Contact,String Name,String NID,String Email,String Profession,String Job_Address,int Staying){
        return givendata.returnvalue(id_to_edit,Contact, Name, NID, Email, Profession, Job_Address, Staying);
    }
    
    public boolean editinfo(int id_to_edit,String Contact,String Name, String Email,String Address,int Active){
        return givendata.returnvalue(id_to_edit,Contact, Name, Email, Address, Active);
    }
    
    public boolean editinfo(String Contact,String Address,String Designation,String FlatNo){
        return givendata.returnvalue(Contact, Address, Designation, FlatNo);
    }
}
