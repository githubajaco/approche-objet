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

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adrpost=" + adrpost + "]";
	}
	
	
	
}
