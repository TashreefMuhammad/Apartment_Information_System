package Controller;

import Model.*;
import View.*;

public class Controller_LoggerInfo {
    public String name, contact, email, apartment;
    public int stat,id;
    public Controller_LoggerInfo(String name, String contact, String email, String apartment, int stat,int id){
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.apartment = apartment;
        this.stat = stat;
        this.id = id;
        
    }
    
    public void evaluate(){
        if(stat == 0 && !name.equals("-1"))
            stat = 2;
        else if(stat == 0)
            stat = 3;
    }
}
