package Controller;

/**
 *
 * @author USER
 */
public class Controller_ServiceProviderInfo {

    int id;
    String contact, present_Address, designation;

    public Controller_ServiceProviderInfo(int id, String contact, String present_Address, String designation) {
        this.id = id;
        this.contact = contact;
        this.present_Address = present_Address;
        this.designation = designation;
    }

    

    public String getContact() {
        return this.contact;
    }

    public String getpresent_Address() {
        return this.present_Address;
    }

    public String getdesignation() {
        return this.designation;
    }

    public int getID() {
        return this.id;
    }

   
}
