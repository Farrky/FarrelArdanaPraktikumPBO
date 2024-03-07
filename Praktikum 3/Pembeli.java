public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;
    private static final int BATAS_OBAT = 5;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[BATAS_OBAT];
        jumlahObat = 0;
    }

    public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        // TODO 2: Implementasikan try-catch untuk handling exception saat pembelian obat
        try {
            if (jumlahObat >= BATAS_OBAT) {
                throw new BatasObatPenuhException("Maaf, batas jumlah obat dalam keranjang telah tercapai.");
            } else if (!obat.isTersedia()) {
                throw new ObatTidakTersediaException("Maaf, obat " + obat.getNama() + " tidak tersedia.");
            } else {
                obat.setTersedia(false);
                keranjangObat[jumlahObat] = obat;
                jumlahObat++;
            }
        } catch (BatasObatPenuhException e) {
            System.out.println(e.getMessage());
        } catch (ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}
