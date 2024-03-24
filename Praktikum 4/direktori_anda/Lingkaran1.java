/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: Lingkaran1.java
* Deskripsi	: kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import java.util.Scanner;

class Lingkaran {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return Math.PI * jejari * jejari;
    }
}