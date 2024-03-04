public class Asersi{
	public static void main(String[] args){
		int x = 0;
		if(x>0){
			System.out.println("x bilangan positif");
		}
		else{
			assert(x>0):"Ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}