package Controller;

import Model.*;
import View.*;

public class Controller_LoginHandling {
    Model_LoginSys checker = new Model_LoginSys();
    public boolean verifyLogin(String choice, String contact, String pass){
        return checker.verifyInfo(choice, contact, pass);
    }
    
    public boolean resetPass(String email){
        return checker.resetPass(email);
    }
}
