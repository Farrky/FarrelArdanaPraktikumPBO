import java.util.Scanner;

class MLingkaran2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran :");
        double jejari = scan.nextDouble();
        Lingkaran ling1 = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejari "+jejari+"satuan adalah"+ling1.hitungLuas());  
    }
}

//JAWABAN UNTUK PERTANYAAN KEDUA
//DIATAS JAWABANNYA
