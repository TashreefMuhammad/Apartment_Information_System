/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


public class Controller_ResidentInfo {


    int id, stat,citi_Min;
    String name, contact, nid, email,profession,jobAddress,Flatno;
    
    public Controller_ResidentInfo(int id, String name, String contact, String nid, String email, String profession,String jobAddress, int stat,int citi_Min,String Flatno){
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.nid = nid;
        this.profession = profession;
        this.jobAddress = jobAddress;
        this.email = email;
        this.stat = stat;
        this.citi_Min= citi_Min;
        this.Flatno = Flatno;
    }
    
    public String getName(){
        return this.name;
    }
    public String getContact(){
        return this.contact;
    }
    public String getProfession(){
        return this.profession;
    }
    public String getNID(){
        return this.nid;
    }
    public String getjobAddress(){
        return this.jobAddress;
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
    public int getCitizen(){
        return this.citi_Min;
    }
    public String getFlatNo(){
        return this.Flatno;
    }
}


