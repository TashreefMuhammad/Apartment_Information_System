
package Controller;


public class Controller_RequestHandle {
    String mid,rid,req,descrip,dtid;
    int urgency;
    public Controller_RequestHandle(String mid,String rid,String req,String descrip,int urgency,String dtid){
        this.mid = mid;
        this.rid=rid;
        this.req=req;
        this.descrip=descrip;
        this.urgency= urgency;
        this.dtid=dtid;
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
    
    public String getDTID(){
        return this.dtid;
    }
}
