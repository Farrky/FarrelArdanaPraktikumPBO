public class MGaris {
    public static void main(String[] args) {
     
        Titik titik1 = new Titik(2, 3);
        Titik titik2 = new Titik(5, 7);

        Garis garis1 = new Garis(titik1, titik2);

        //objek Garis
        System.out.println("Titik Awal: (" + garis1.getTitikAwal().getAbsis() + ", " + garis1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + garis1.getTitikAkhir().getAbsis() + ", " + garis1.getTitikAkhir().getOrdinat() + ")");

        //panjang garis
        System.out.println("Panjang Garis: " + garis1.getPanjang());

        //gradien garis
        System.out.println("Gradien Garis: " + garis1.getGradien());

        //refleksi dengan sumbu Y
        Garis garisRefleksiY = garis1.getRefleksiY();
        System.out.println("Titik Awal Refleksi Y: (" + garisRefleksiY.getTitikAwal().getAbsis() + ", " + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir Refleksi Y: (" + garisRefleksiY.getTitikAkhir().getAbsis() + ", " + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");

        // coba Garis lain
        Titik titik3 = new Titik(1, 1);
        Titik titik4 = new Titik(4, 3);
        Garis garis2 = new Garis(titik3, titik4);

        // cek apakah garis1 tegak lurus dengan garis2
        boolean isTegakLurus = garis1.isTegakLurus(garis2);
        System.out.println("Garis 1 Tegak Lurus dengan Garis 2: " + isTegakLurus);
    }
}