public class KeranjangObat {
    private String[] keranjang;
    private int jumlahObat;

    public KeranjangObat() {
        keranjang = new String[5];
        jumlahObat = 0;
    }

    public void tambahObat(String obat) {
        assert jumlahObat < keranjang.length : "Keranjang sudah penuh.";
        keranjang[jumlahObat] = obat;
        jumlahObat++;
    }

    public void tampilkanObat() {
        for (int i = 0; i < jumlahObat; i++) {
            System.out.println(keranjang[i]);
        }
    }
}