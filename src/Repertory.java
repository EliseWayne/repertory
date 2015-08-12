import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;


public class Repertory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AfficherContenu repert = new AfficherContenu();
		RechercheParNom rpnom = new RechercheParNom();
		RechercheParNumero rpnum = new RechercheParNumero();			
		
		//proposer d'afficher le contenu du répertoire:
		repert.afficher();
		
		//Proposer une recherche par nom:
		rpnom.afficher();
		
		//Proposer une recherche par numéro:
		rpnum.afficher();
		
		
	}

} 
