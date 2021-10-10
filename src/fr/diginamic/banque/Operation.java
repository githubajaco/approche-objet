package fr.diginamic.banque;

public abstract class Operation {
	
	private String dateOperation;
	private Double montantOperation;
	
	public Operation(String dateOperation, Double montantOperation) {
		
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;		
		
	}	
	
	protected Double getMontantOperation() {
		return montantOperation;
	}

	protected void setMontantOperation(Double montantOperation) {
		this.montantOperation = montantOperation;
	}

	//retourner le type d'opération
	public abstract String getType();

	@Override
	public String toString() {
		return "Operation [dateOperation=" + dateOperation + ", montantOperation=" + montantOperation + "]";
	}
	
	
}
