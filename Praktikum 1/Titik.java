/*
* File 			: Titik.java 19/02/24
* Nama 			: Farrel Ardana Jati
* NIM 			: 24060122140165
* Deskripsi 	: Kelas titik

*/


class Titik{
	double absis;
	double ordinat;
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
	
	void setAbsis(double x){
		this.absis = x;
	}
	
	void setOrdinat(double y){
		this.ordinat = y;
	}
	
	double getAbsis(){
		return this.absis;
	}
	
	double getOrdinat(){
		return this.ordinat;
	}
	
	static double getCounterTitik(){
		return counterTitik;
	}
}