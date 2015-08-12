import java.util.HashMap;
import java.util.Scanner;

public class RechercheParNumero {
	
	void afficher() {
		
		//Contenu du répertoire
		HashMap<String,String> repertory2 = new HashMap<>();
		repertory2.put("0601020300","brian");
		repertory2.put("0601020301","iyad");
		repertory2.put("0601020302","michael");
		repertory2.put("0601020303","tobias");
		repertory2.put("0601020304","laurent");
		repertory2.put("0601020305","marco");
		repertory2.put("0601020306","code");
				
		//Proposer une recherche par numéro:
		boolean rparnum = false;
		do {
			System.out.println("Souhaitez-vous effectuer une recherche par numéro?");
			Scanner all = new Scanner(System.in);
			String yesorno = all.next();
				yesorno.toLowerCase();
					if (yesorno.equalsIgnoreCase("oui")) {
						System.out.println(" ");
						System.out.println("Entrez un numéro -sans espaces:");
						Scanner number = new Scanner(System.in);
						String nbr = number.next();
						nbr.toLowerCase();
						String val=(String)repertory2.get(nbr);
						if(val != null) {
							System.out.println("Le numéro de "+nbr+" appartient à: " + val);
						} else {
							System.out.println("Ce numéro n'existe pas ou n'est pas enregistré.");
							continue;
						}
						rparnum = true;
					} else {
						if (yesorno.equalsIgnoreCase("non")) {
							System.out.println(" ");
							rparnum = true;
						} else {
							System.out.println(" Répondez par 'oui' ou par 'non' ! ");								
						}
					}
		} while (rparnum == false);
		}
}
