
package Controller;

public class Controller_GuestInfo {
    int id;
    String name, contact;
    
    public Controller_GuestInfo(int id, String contact, String name){
        this.id = id;
        this.name = name;
        this.contact = contact;        
    }
    
    public String getName(){
        return this.name;
    }
    public String getContact(){
        return this.contact;
    }
    public int getID(){
        return this.id;
    }
}
