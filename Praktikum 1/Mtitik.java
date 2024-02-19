/*
* File 			: Mtitik.java 19/02/24
* Nama 			: Farrel Ardana Jati
* NIM 			: 24060122140165
* Deskripsi 	: Kelas yang berisi program utama yang memanfaatkan kelas titik

*/

public class Mtitik{
		public static void main(String[] args){
				Titik t1, t2, t3;
				t1 = new Titik(); t1.setAbsis(1); t1.setOrdinat(2);
				t2 = new Titik(); t2.setAbsis(3); t2.setOrdinat(4);
				t3 = new Titik(5,6);
				
				System.out.println("Jumlah objek titik : "+t1.getCounterTitik());
				System.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat()+")");
				System.out.println("t2("+t2.getAbsis()+", "+t2.getOrdinat()+")");
				System.out.println("t3("+t3.getAbsis()+", "+t3.getOrdinat()+")");
		}
}