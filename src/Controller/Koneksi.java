/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dito
 */
public class Koneksi {
    private static Connection koneksi;
    public static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil konek");
        }
        catch(ClassNotFoundException ex){
            System.out.println("gagal koneksi"+ex);
        }
        String url = "jdbc:mysql://localhost/penjualan";
        try{
            koneksi=DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil koneksi database");
        }
        catch(SQLException ex){
            System.out.println("gagal koneksi database"+ex);
        }
        return koneksi;
    }
}