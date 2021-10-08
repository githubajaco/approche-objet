package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale ad1 = new AdressePostale("1", "rue Durand", 34000, "Montpellier");
		AdressePostale ad2 = new AdressePostale("33", "bd de la perruque", 34000, "Montellier");
		
		System.out.println(ad1);
		System.out.println(ad2);
	}

}
