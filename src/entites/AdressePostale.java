package entites;

public class AdressePostale {
	
	private String numRue;	//car 3bis et 8ter possibles
	private String libelRue;
	private int codePostal;
	private String ville;
	
		

	public AdressePostale(String numRue, String libelRue, int codePostal, String ville) {
		
		super();
		this.numRue = numRue;
		this.libelRue = libelRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	//Getter & setter***********************************

	public String getNumRue() {
		return numRue;
	}

	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}

	public String getLibelRue() {
		return libelRue;
	}

	public void setLibelRue(String libelRue) {
		this.libelRue = libelRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	//Méthodes à suivre**************************


	@Override
	public String toString() {
		return "AdressePostale [numRue=" + numRue + ", libelRue=" + libelRue + ", codePostal=" + codePostal + ", ville="
				+ ville + "]";
	}
	
	
	
}
