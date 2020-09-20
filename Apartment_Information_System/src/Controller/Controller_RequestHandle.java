
package Controller;


public class Controller_RequestHandle {
    String mid,rid,req,descrip;
    int urgency;
    public Controller_RequestHandle(String mid,String rid,String req,String descrip,int urgency){
        this.mid = mid;
        this.rid=rid;
        this.req=req;
        this.descrip=descrip;
        this.urgency= urgency;
    }
    
    public String getMID(){
        return this.mid;
    }
    
    public String getRID(){
        return this.rid;
    }
    
    public String getReq(){
        return this.req;
    }
    
    public String getDescrip(){
        return this.descrip;
    }
            
    public int getUrgency(){
        return this.urgency;
    }
}
