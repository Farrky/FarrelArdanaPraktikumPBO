/* Program   : .java */
/* Deskripsi :  */
/* NIM & Nama  : 24060122140165 & Farrel Ardana Jati */
/* Tanggal   : 16 Februari 2024 */

public class Garis{
	private Titik titikAwal;
	private Titik titikAkhir;
	
	public Garis(Titik titikAwal, titikAkhir){
		this.titikAwal = titikAwal;
		this.titikAkhir = titikAkhir;
	}
	
	public Titik getTitikAwal(){
		return titikAwal;
	}
	
	public void setTitikAwal(Titik titikAwal){
		this.titikAwal = titikAwal;
	}
	
	public void setTitikAkhir(Titik titikAkhir){
		this.titikAkhir = titikAkhir;
	}
	
	public double getPanjang(){
		double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
		double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
		
		return math.sqrt(math.pow(deltaX,2) + math.pow(deltaY,2));
	}
	
	public double getGradien(){
		double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
		double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
		
		return deltaY / deltaX;
	}
	
	public getRefleksiY(){
		Titik titikAwalRefleksi = new Titik(-titikAwal.getAbsis(), titikAwal.getOrdinat());
		Titik titikAkhirRefleksi = new Titik(-titikAkhir.getAbsis(), titikAkhir.getOrdinat());
		return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
	}
	
	public boolean isTegakLurus(Garis G){
		double gradien1 = this.getGradien();
		double gradien2 = G.getGradien();
		
		return math.abs(gradien1 * gradien2) == -1;
	}