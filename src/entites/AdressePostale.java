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



	@Override
	public String toString() {
		return "AdressePostale [numRue=" + numRue + ", libelRue=" + libelRue + ", codePostal=" + codePostal + ", ville="
				+ ville + "]";
	}
	
	
	
}
