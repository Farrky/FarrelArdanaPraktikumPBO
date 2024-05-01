/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanveryeasy;

/**
 *
 * @author LENOVO LEGION
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = peluru;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    public void menembak(){
         System.out.println(getBunyi());
         setPeluru(getPeluru() - 1);
         System.out.println("Peluru sisa: " + getPeluru());
    }
    
    
    
    
    
}
