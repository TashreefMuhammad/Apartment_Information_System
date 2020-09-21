
package Controller;

public class Controller_Transaction {
    String Flat,SPID,Report,Amount,Name,Contact,dtid;
    
    public Controller_Transaction(String Flat,String SPID,String Report, String Amount,String Name,String Contact,String dtid){
        this.Flat= Flat;
        this.dtid = dtid;
        this.SPID= SPID;
        this.Report = Report;
        this.Amount = Amount;
        this.Name = Name;
        this.Contact = Contact;
    }
    
    public String getFlat(){
        return this.Flat;
    }
    
    public String getDTID(){
        return this.dtid;
    }
    
    public String getSPID(){
        return this.SPID;
    }
    
    public String getReport(){
        return this.Report;
    }
    
    public String getAmount(){
        return this.Amount;
    }
    
    public String getName(){
        return this.Name;
    }
    public String getContact(){
        return this.Contact;
    }
}
