/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author LENOVO LEGION
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
    public boolean cekPeluru() {
        return (senjata.getPeluru() > 0); 
    }
    
    public void isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(jumlahPeluru); 
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru); 
    }
            
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        int tembakanBerhasil = 0;
        if (!cekPeluru()) {
            System.out.println("Peluru Habis");
        } else {
            for (int i = 0; i < jumlah; i++) {
                if (cekPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                    tembakanBerhasil++;
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                    break;
                }
            }
       
            if (tembakanBerhasil < jumlah) {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }    
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void tampilkanSisaPeluru() {
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
}
