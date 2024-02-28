/* Program   : Penjual.java */
/* Deskripsi :  Penjual*/
/* NIM & Nama  : 24060122140165 & Farrel Ardana Jati */
/* Tanggal   : 28 Februari 2024 */
public class Penjual{
    private String namaPenjual;
    private String alamat;
    private String nomorTelepon;

    // Constructor
    public Penjual(String namaPenjual, String alamat, String nomorTelepon) {
        this.namaPenjual = namaPenjual;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama(){
        return namaPenjual;
    }

    public void setNama(String namaPenjual){
        this.namaPenjual = namaPenjual;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNomorTelepon(){
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon){
        this.nomorTelepon = nomorTelepon;
    }

}