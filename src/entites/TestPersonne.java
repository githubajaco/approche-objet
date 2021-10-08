package entites;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale ap1 = new AdressePostale("10bis", "imp de l'argenterie", 56100, "Lorient");
		AdressePostale ap2 = new AdressePostale("44ter", "bd gle de Gaulle", 75000, "Paris");
		Personne p1 = new Personne("Guesde", "Jules", ap1);
		Personne p2 = new Personne("Kerviel", "Jerome", ap2);
		Personne p3 = new Personne("De Kersauson", "Olivier");
		
		System.out.println("Affiche p1 : "+p1);
		System.out.println("Affiche p2 : "+p2);
		System.out.println("Affiche p3 : "+p3);
		
		System.out.println("");
		System.out.println("Affiche le nom en majuscule et le prénom de p1 : ");
		p1.afficheNomPrenom();
		System.out.println("");	
		
		p2.setNomPersonne("romjé");
		System.out.println("Modifie le nom de p2 : ");
		p2.afficheNomPrenom();
		System.out.println("");
				
		p1.setNom("Nouveau nom");
		p1.setPrenom("Nouveau prenom");
		System.out.println("Affiche nouveau p1 : ");
		System.out.println(p1);
		System.out.println("");
		
		System.out.println("Modifier l'adresse de p1 : ");
		p1.setAdrpost(ap2);
		System.out.println(p1);
		System.out.println("");
		
		System.out.println("Récup nom de p1 : ");
		System.out.println(p1.getNom());
		System.out.println("");		
		
		System.out.println("Récup prénom de p1 : ");
		System.out.println(p1.getPrenom());
		System.out.println("");
		
		
		System.out.println("Récup adresse de p1 : ");		
		System.out.println(p1.getAdrpost());
		System.out.println("");
		
		System.out.println("Valoriser nom et prenom avec constructeur de p4 : ");
		Personne p4 = new Personne("Sayé", "Jacques");
		System.out.println(p4);
		System.out.println("");
		
		System.out.println("Valoriser l'adresse de p4 : ");
		AdressePostale a = new AdressePostale("1", "av du moulin de la Jasse", 34750, "Villeneuve-les-Maguelone"); 
		p4.setAdrpost(a);
		System.out.println(p4);		
		
		
	}

}