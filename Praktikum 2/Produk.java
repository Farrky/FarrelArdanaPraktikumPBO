/* Program   : Produk.java */
/* Deskripsi :  Produk*/
/* NIM & Nama  : 24060122140165 & Farrel Ardana Jati */
/* Tanggal   : 28 Februari 2024 */
public class Produk{
    private String namaProduk;
    private double harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual;
    private int jumlah;

     // Constructor
    public Produk(String namaProduk, double harga, int stok, String deskripsi, Penjual penjual) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual;
    }

     // Getter dan setter untuk atribut nama
    public String getNama() {
        return namaProduk;
    }

    public void setNama(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok(){
        return stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }

    public String getDeskripsi(){
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public Penjual getPenjual() {
        return penjual;
    }

    public void ubahStok(int jumlah) {
        stok += jumlah;
    }

}