/*
* File 			: Titik.java 26/02/24
* Nama 			: Farrel Ardana Jati
* NIM 			: 24060122140165
* Deskripsi 	: Kelas titik

*/


class Titik{
	private double absis;
	private double ordinat;
	static int counterTitik;
	
	
	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public Titik(double x, double y){
		this.absis = x;
		this.ordinat = y;
		counterTitik++;
	}
	
	public void setAbsis(double x){
		this.absis = x;
	}
	
	public void setOrdinat(double y){
		this.ordinat = y;
	}
	
	public double getAbsis(){
		return this.absis;
	}
	
	public double getOrdinat(){
		return this.ordinat;
	}
	
	static double getCounterTitik(){
		return counterTitik;
	}
}