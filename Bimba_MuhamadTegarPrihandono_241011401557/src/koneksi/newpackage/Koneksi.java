package koneksi.newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        try {
            // Sesuaikan 'db_bimba' dengan nama database MySQL yang kamu buat di phpMyAdmin
            String url = "jdbc:mysql://localhost:3306/db_bimba"; 
            String user = "root";
            String pass = ""; // Kosongkan jika default XAMPP, atau isi password MySQL-mu
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (Exception e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
            return null;
        }
    }
}