package modele;
import java.util.*;


/*-----------------------------
 * Classe des Plats ayant comme informations le nom, les ingredients, les valeurs nutritionnelle et les allergenes du plats
 *---------------------------
 */
public class Plat {

	private String nomDuPlat;
	private ArrayList<String> ingredientsDuPlat;
	private String valeursNutritionnelles; 
	private ArrayList<Allergene> sesAllergenes;
	private ArrayList<Etiquette> sesEtiquettes;

/*-------------------------
* Constructeur vide de plat pour initialiser
*--------------------------
*/
	 public Plat() {
		 
		 this.nomDuPlat = "Plat inconnu";
		 this.ingredientsDuPlat = new ArrayList<>();
		 this.valeursNutritionnelles = ""; 
		 this.sesEtiquettes = new ArrayList<Etiquette>();
		 this.sesAllergenes = new ArrayList<Allergene>();
	}
	 
/*-------------------------
* Constructeur avec paramètres.
*--------------------------
*/
	  Plat (String nomDuPlat, ArrayList<String> ingredientsDuPlat, String valeursNutritionnelles) {
		 this.nomDuPlat = nomDuPlat;
		 this.ingredientsDuPlat = ingredientsDuPlat;
		 this.valeursNutritionnelles = valeursNutritionnelles; 
	     this.sesAllergenes = new ArrayList<>();
	     this.sesEtiquettes = new ArrayList<>(); 
	 }
	  
/*------------------------
 * liste des getter 
 * -----------------------
 */
	 
	 public String getNomDuPlat() {
		 return nomDuPlat;
	 }
	 
	 public List<String> getIngredientsDuPlat(){
		 return ingredientsDuPlat;
	 }
	 
	 public String getValeursNutritionnelles () {
		 return valeursNutritionnelles; 
	 }
	 
	 public List<Allergene> getAllergenes (){
		 return sesAllergenes;
	 }
	 
	 public void addEtiquette(Etiquette etiquette) {
		 this.sesEtiquettes.add(etiquette);
	 }
	 
	 public void addAllergene (Allergene allergene) {
		 this.sesAllergenes.add(allergene);
	 }
/*---------------------------------------
 * Getter pour appeler la classe Etiquette
 * --------------------------------------
 */
	 public ArrayList<Etiquette> getEtiquettes() {
			return this.sesEtiquettes;

		}

	public void setSesAllergenes(ArrayList<Allergene> sesAllergenes) {
		this.sesAllergenes = sesAllergenes;
	}
	
	@Override
	public String toString() {
	    return "Plat: " + nomDuPlat;
	}



}