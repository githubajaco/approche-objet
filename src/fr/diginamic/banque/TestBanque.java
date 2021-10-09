package fr.diginamic.banque;

import fr.diginamic.banques.entites.Compte;
import fr.diginamic.banques.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cpt1 = new Compte(122455693, 23.95);
		Compte cpt2 = new CompteTaux(175486329, 7085.52, 0.05);
		
		Compte[] tabCpt;
		
		tabCpt = new Compte[2];
		
		tabCpt[0] = cpt1;
		tabCpt[1] = cpt2;
		
		for(Compte item : tabCpt) {
			System.out.println(item);
		}
		
		
	}

}

