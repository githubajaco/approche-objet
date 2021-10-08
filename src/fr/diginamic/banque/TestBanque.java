package fr.diginamic.banque;

import fr.diginamic.banques.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cpt = new Compte(122455693, 23.95);
		System.out.println(cpt);
		//affiche la référence de l'objet et non les valeurs
	}

}

