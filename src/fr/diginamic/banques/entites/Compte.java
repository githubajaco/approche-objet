package fr.diginamic.banques.entites;

public class Compte {
	
	private int numCompte;
	private double soldeCompte;
	
	public Compte(int numCompte, double d) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = d;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + "]";
	}
	
	
		

}
