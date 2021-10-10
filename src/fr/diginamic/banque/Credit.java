package fr.diginamic.banque;

public class Credit extends Operation{

	private static final String CREDIT = "+";

	public Credit(String dateOperation, Double montantOperation) {
		
		super(dateOperation, montantOperation);
		
	}

	@Override
	public String getType() {
		return CREDIT;
	}
	
	
}


