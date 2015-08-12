import java.util.HashMap;
import java.util.Scanner;

public class RechercheParNumero {
	
	void afficher() {
		
		//Contenu du r�pertoire
		HashMap<String,String> repertory2 = new HashMap<>();
		repertory2.put("0601020300","brian");
		repertory2.put("0601020301","iyad");
		repertory2.put("0601020302","michael");
		repertory2.put("0601020303","tobias");
		repertory2.put("0601020304","laurent");
		repertory2.put("0601020305","marco");
		repertory2.put("0601020306","code");
				
		//Proposer une recherche par num�ro:
		boolean rparnum = false;
		do {
			System.out.println("Souhaitez-vous effectuer une recherche par num�ro?");
			Scanner all = new Scanner(System.in);
			String yesorno = all.next();
				yesorno.toLowerCase();
					if (yesorno.equalsIgnoreCase("oui")) {
						System.out.println(" ");
						System.out.println("Entrez un num�ro -sans espaces:");
						Scanner number = new Scanner(System.in);
						String nbr = number.next();
						nbr.toLowerCase();
						String val=(String)repertory2.get(nbr);
						if(val != null) {
							System.out.println("Le num�ro de "+nbr+" appartient �: " + val);
						} else {
							System.out.println("Ce num�ro n'existe pas ou n'est pas enregistr�.");
							continue;
						}
						rparnum = true;
					} else {
						if (yesorno.equalsIgnoreCase("non")) {
							System.out.println(" ");
							rparnum = true;
						} else {
							System.out.println(" R�pondez par 'oui' ou par 'non' ! ");								
						}
					}
		} while (rparnum == false);
		}
}
