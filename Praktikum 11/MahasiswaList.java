/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pkg11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO LEGION
 */
public class MahasiswaList {
     public static void main(String[] args){
        Map<String, String> mahasiswaMap = new HashMap<>();
            mahasiswaMap.put("24060122140123", "Adi");
            mahasiswaMap.put("24060122140124", "Bambang");
            mahasiswaMap.put("24060122120018", "nopal");
            mahasiswaMap.put("24060122140165", "Parel");
        
            // Menampilkan key dan value menggunakan ekspresi lambda
            mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
     }
}
