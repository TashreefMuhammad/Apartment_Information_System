/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.util.ArrayList;
/**
 *
 * @author Dragneel
 */
public class Controller_SearchTable {
    Model_TableValues val = new Model_TableValues();
    
    public ArrayList<Controller_SecurityInfo> securityInfoTable(String contact, String name, String present, String perma, String email, int stat){
        return val.securityInfoExtractTable(contact, name, present, perma, email, stat);
    }
}
