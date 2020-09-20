/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author USER
 */
public class Controller_ResidentTransaction {
    
    String transID,dateoftime,typeofpay,amount,resID;
    
    public Controller_ResidentTransaction(String transID,String dateoftime,String typeofpay,String amount){
        this.transID=transID;
        this.dateoftime=dateoftime;
        this.typeofpay=typeofpay;
        this.amount=amount;
       
    }
     public String gettransId(){
        return this.transID;
    }
    public String getdateoftime(){
        return this.dateoftime;
    }
    public String gettypeofpay(){
        return this.typeofpay;
    }
    public String getamount(){
        return this.amount;
    }
    
}
