import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class RechercheParNom {
	void afficher() {
		
		//Contenu du répertoire
		HashMap repertory = new HashMap();
		repertory.put("brian","0601020300");
		repertory.put("iyad","0601020301");
		repertory.put("michael","0601020302");
		repertory.put("tobias","0601020303");
		repertory.put("laurent","0601020304");
		repertory.put("marco","0601020305");
		repertory.put("code","0601020306");
		
			//Proposer une recherche par nom:
			boolean rparnom = false;
			do {
				System.out.println("Souhaitez-vous effectuer une recherche par nom?");
				Scanner all = new Scanner(System.in);
				String yesorno = all.next();
					yesorno.toLowerCase();
						if (yesorno.equalsIgnoreCase("oui")) {
							System.out.println("Qui recherchez-vous?");
							Scanner name = new Scanner(System.in);
							String answer = name.next();
							answer.toLowerCase();
							String val=(String)repertory.get(answer);
							System.out.println("Le numéro de "+answer+" est: " + val);
							rparnom = true;
						} else {
							if (yesorno.equalsIgnoreCase("non")) {
								System.out.println(" ");
								rparnom = true;
							} else {
								System.out.println(" Répondez par 'oui' ou par 'non' ! ");								
							}
						}
			} while (rparnom == false);
			}
}