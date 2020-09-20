
package Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller_DataValidation {
    public boolean validateContact(String contact){
        int l = contact.length();
        
        if(l == 11 && contact.substring(0, 2).equals("01"))
            return true;
        else
            return false;
    }
    
    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);
        
        return mat.matches();
    }
}
