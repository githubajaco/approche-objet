package entites;

public class Personne {
	
	private String nom;
	private String prenom;
	private AdressePostale adrpost;
	
	public Personne(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adrpost) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adrpost = adrpost;
	}	
	//Getter et setter**********************
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdrpost() {
		return adrpost;
	}

	public void setAdrpost(AdressePostale adrpost) {
		this.adrpost = adrpost;
	}
	
	//methodes supplémentaires***************
	
	public void afficheNomPrenom() {
		
		System.out.println(nom.toUpperCase()+ " " + prenom);
	}
	
	public void setNomPersonne(String name) {
		this.nom = name;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adrpost=" + adrpost + "]";
	}
	
	
	
}
