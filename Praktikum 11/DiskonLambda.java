///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package praktikum.pkg11;
//
///**
// *
// * @author LENOVO LEGION
// */
//public class DiskonLambda {
//    public static void main(String[] args){
//        IDiskon diskonMerdeka = new IDiskon(){
//            public double hitungDiskon(int harga){
//                return harga - (harga * 0.3);
//            }
//        };
//        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
//        IDiskon diskonBiasa = (harga) -> {
//            return harga - harga-(harga*0.1);
//        };
//        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
//        System.out.println("Diskon Merdeka: "+diskonLebaran.hitungDiskon(45000));
//        System.out.println("Diskon Merdeka: "+diskonBiasa.hitungDiskon(45000));
//        
//    }
//    
//}
