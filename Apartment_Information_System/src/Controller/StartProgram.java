package Controller;

import Model.*;
import View.*;

public class StartProgram {
    public static void main(String args[]){
        ConnectMSSQL connect = new ConnectMSSQL();
        connect.connectDB();
        
        LoginPage.main(null);
        
    }
}
