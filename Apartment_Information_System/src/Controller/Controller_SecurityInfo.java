
package Controller;


public class Controller_SecurityInfo {
    int id, stat;
    String name, contact, present, perma, email;
    
    public Controller_SecurityInfo(int id, String name, String contact, String present, String perma, String email, int stat){
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.present = present;
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
    public String getPresnt(){
        return this.present;
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
