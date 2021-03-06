import java.io.FilterInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class AfficherContenu {
	void afficher() {
	
	//Contenu du r�pertoire
	HashMap<String, String> repertory = new HashMap<>();
	repertory.put("brian","0601020300");
	repertory.put("iyad","0601020301");
	repertory.put("michael","0601020302");
	repertory.put("tobias","0601020303");
	repertory.put("laurent","0601020304");
	repertory.put("marco","0601020305");
	repertory.put("code","0601020306");

		//proposer d'afficher le contenu du r�pertoire:
		boolean repert = false;
			do {
				System.out.println("Souhaitez-vous afficher tout le contenu du r�pertoire?");
				Scanner all = new Scanner(new FilterInputStream(System.in) {
				   @Override
				  public void close() throws IOException {
					   //don't close System.in! 
				   }
					});
				String yesorno = all.next();
				yesorno.toLowerCase();
				if (yesorno.equalsIgnoreCase("oui")) {
					Set<String> keySet =repertory.keySet(); 
					Iterator<String> it= keySet.iterator(); 
					while (it.hasNext()){Object key =it.next(); 
					System.out.println("Nom: "+(String)key+" - Num�ro: "+ repertory.get(key));}
					repert = true;
				} else {
					if (yesorno.equalsIgnoreCase("non")) {
						System.out.println(" ");
						repert = true;
					} else {
						System.out.println(" R�pondez par 'oui' ou par 'non' ! ");
							}
					}
						all.close();
			} while (repert == false);
		}
		}