package fr.diginamic.banques.entites;

public class CompteTaux extends Compte{
	
	private double taux;

	
	public CompteTaux(int numCompte, double soldeCompte, Double taux) {
		super(numCompte, soldeCompte);
		this.taux = taux;
	}	
		
	@Override
	public String toString() {
		return ("CompteTaux [taux=" + taux + ", NumCompte = " + super.getNumCompte() + ", SoldeCompte = "
				+ super.getNumCompte());
	}	
	
}
