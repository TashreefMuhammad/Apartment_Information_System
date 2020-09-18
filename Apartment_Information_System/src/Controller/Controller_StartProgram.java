package Controller;

import Model.*;
import View.*;

public class Controller_StartProgram {
    public static void main(String args[]){
        Model_ConnectMSSQL connect = new Model_ConnectMSSQL();
        connect.connectDB();
        
        View_LoginPage.main(null);
    }
}
