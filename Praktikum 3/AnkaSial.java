public class  AnkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AnkaSial as = new AnkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

// soal 1 = tidak karena akan mengeluarkan pesan eksepsi yang mana pesannya jangan masukkan angka 13
// soal 2 = dieksekusi karena menampilkan pesan