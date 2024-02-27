public class MKubus{
	public static void main(String[] args){
		Kubus kubus = new Kubus(6.0);
		Kubus kubus1 = new Kubus(9.0);
		System.out.println("Volume kubus: " + kubus.hitungVolume());
		System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
		System.out.println("Volume kubus1: " + kubus1.hitungVolume());
		System.out.println("Luas permukaan kubus1: " + kubus1.hitungLuasPermukaan());
	}
}