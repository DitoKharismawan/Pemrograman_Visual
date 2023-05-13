/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Data.Nota;
import Data.Data_Kasir;

/**
 *
 * @author dito
 */
public class UserID {
    private static String kd;
    public static void setUserLogin(String kode){
        kd = kode;
    }
    
   public static String getUserLogin(){
       return kd;
   }
}


