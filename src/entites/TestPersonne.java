package entites;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale ap1 = new AdressePostale("10bis", "imp de l'argenterie", 56100, "Lorient");
		AdressePostale ap2 = new AdressePostale("44ter", "bd gle de Gaulle", 75000, "Paris");
		Personne p1 = new Personne("Guesde", "Jules", ap1);
		Personne p2 = new Personne("Kerviel", "Jerome", ap2);
		Personne p3 = new Personne("Kerviel", "Jerome");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
	}

}
