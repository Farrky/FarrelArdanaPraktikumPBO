/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author LENOVO LEGION
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if(koneksi == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                //Sesuaikan host, port, nama db
                String url = "jdbc:mysql//localhost:3306/jdbc_pertemuan_15";
                //sesuaikan username dan password
                String user = "student";
                String password ="rahasia";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("Koneksi Berhasil");
                }
            }catch(ClassNotFoundException one){
                System.out.println("Gagal load Driver: "+one.getMessage());
            }catch(SQLException sqle){
                System.out.println("Gagal Koneksi : "+sqle.getMessage());
            }
        }
        return koneksi;
    }
}   
