/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author D.Maciver
 */
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
