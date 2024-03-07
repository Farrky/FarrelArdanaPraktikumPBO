public class MainObat {
    public static void main(String[] args) {
        // Instansiasi kelas Pembeli dan Obat
        Pembeli pembeli = new Pembeli("John Doe");
        Obat obat1 = new Obat("Paracetamol");
        Obat obat2 = new Obat("Amoxicillin");

        // TODO 4: Implementasikan try-catch untuk handling exception saat pembelian obat
        try {
            pembeli.beliObat(obat1);
            pembeli.beliObat(obat2);
            // Jika ingin mencoba pembelian obat melebihi batas, bisa uncomment baris di bawah
            // pembeli.beliObat(new Obat("Ibuprofen")); // Uncomment untuk mencoba pembelian obat melebihi batas
        } catch (BatasObatPenuhException e) {
            System.out.println(e.getMessage());
        } catch (ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}
