package fr.diginamic.banque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestOperation {

	public static void main(String[] args) {
		
				
		Operation op1 = new Credit("04/08/21", 405.00);
		Operation op2 = new Credit("02/05/21", 7084.25);
		Operation op3 = new Debit("12/09/21", 802.50);
		Operation op4 = new Debit("25/07/21", 25.00);
		
		List<Operation> listeOperation = new ArrayList<Operation>();
		
		listeOperation.add(op1);
		listeOperation.add(op2);
		listeOperation.add(op3);
		listeOperation.add(op4);
		
		Double montantGlobal = 0.0;
		
		Iterator<Operation> iterator = listeOperation.iterator();
		while(iterator.hasNext()) {
			
			Operation op = (Operation)iterator.next();
			
			System.out.println(op.toString()+" - type d'opération : "+op.getType());			
			
			
			if(op.getType() == "-") {
				montantGlobal = montantGlobal - op.getMontantOperation();
			}else {
				montantGlobal = montantGlobal + op.getMontantOperation();
			}		
						
		}
		
		System.out.println("Le montant global est : "+montantGlobal);		
		
		
	}

}
