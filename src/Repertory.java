
public class Repertory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AfficherContenu repert = new AfficherContenu();
		RechercheParNom rpnom = new RechercheParNom();
		RechercheParNumero rpnum = new RechercheParNumero();			
		
		//proposer d'afficher le contenu du r�pertoire:
		repert.afficher();
		
		//Proposer une recherche par nom:
		rpnom.afficher();
		
		//Proposer une recherche par num�ro:
		rpnum.afficher();
		
		
	}

} 
