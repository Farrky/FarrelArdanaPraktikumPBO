/* Program   : Toko.java */
/* Deskripsi :  Main Toko*/
/* NIM & Nama  : 24060122140165 & Farrel Ardana Jati */
/* Tanggal   : 28 Februari 2024 */
public class Toko {
    public static void main(String[] args) {
       
        Penjual penjual = new Penjual("Farrel Ardana", "Gg. Tirtasari No.129", "0812931923120");

        
        Produk produk = new Produk("Laptop Lenovo", 200000, 10, "Laptop Gaming dengan spesfikasi gamer", penjual);

       
        Penjual penjualProduk = produk.getPenjual();
        System.out.println("\nInformasi Penjual:");
        System.out.println("Nama: " + penjualProduk.getNama());
        System.out.println("Alamat: " + penjualProduk.getAlamat());
        System.out.println("Nomor Telepon: " + penjualProduk.getNomorTelepon());

        
        System.out.println("\nInformasi Produk:");
        System.out.println("Nama: " + produk.getNama());
        System.out.println("Harga: " + produk.getHarga());
        System.out.println("Stok: " + produk.getStok());
        System.out.println("Deskripsi: " + produk.getDeskripsi());

       
        produk.ubahStok(-5); 
        System.out.println("\nStok setelah pengurangan: " + produk.getStok());
    }
}