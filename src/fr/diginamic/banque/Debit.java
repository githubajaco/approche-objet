package fr.diginamic.banque;

public class Debit extends Operation{

	private static final String DEBIT = "-";
	

	public Debit(String dateOperation, Double montantOperation) {
		
		super(dateOperation, montantOperation);
		
	}

	@Override
	public String getType() {
		return DEBIT;
	}

}
