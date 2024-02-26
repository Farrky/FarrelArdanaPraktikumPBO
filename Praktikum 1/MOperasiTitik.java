/* Program   : MOperasiTitik.java */
/* Deskripsi : File modul OperasiTitik */
/* NIM & Nama  : 24060122140165 & Farrel Ardana Jati */
/* Tanggal   : 16 Februari 2024 *
public class MOperasiTitik{	
	public static void main(String[] args){	
		Titik t = new Titik(4,4);
		OperasiTitik o = new OperasiTitik();		
		
		o.refleksiSumbuX(t);		
		System.out.println("Titik : (" + t.getAbsis() +", " + t.getOrdinat() + ")");
		
		o.refleksiSumbuY(t);
		System.out.println("Titik : (" + t.getAbsis() +", " + t.getOrdinat() + ")");
		
		System.out.println("Jarak Titik :" + o.getJarakPusat(t));
	}			
}