public class HewanTest{
	public static void main(String[] args) {
		Ternak ikan = new Ternak("Omnivora");
		ikan.showMakan();
		ikan.showKaki();

		Ternak kerbau = new Ternak("Herbivora",4);
		kerbau.showMakan();
		kerbau.showKaki();
	}
}