
package Controller;


public class Controller_ManagerInfo {
    int id, stat;
    String name, contact, present, perma, email;
    
    public Controller_ManagerInfo(int id, String name, String contact, String perma, String email, int stat){
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.perma = perma;
        this.email = email;
        this.stat = stat;
    }
    
    public String getName(){
        return this.name;
    }
    public String getContact(){
        return this.contact;
    }
    public String getPerma(){
        return this.perma;
    }
    public String getEmail(){
        return this.email;
    }
    public int getStat(){
        return this.stat;
    }
    public int getID(){
        return this.id;
    }
}
