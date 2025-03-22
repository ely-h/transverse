package CIUP;
import java.util.*;


/*-----------------------------
 * Classe des Plats ayant comme informations le nom, les ingredients, les valeurs nutritionnelle et les allergenes du plats
 *---------------------------
 */
public class Plat {

	private String nomDuPlat;
	private ArrayList<String> ingredientsDuPlat;
	private String valeursNutritionnelles; 
	private ArrayList<Allergene> allergenes;
	private ArrayList<Etiquette> sesEtiquettes;

	/*-------------------------
	 * Constructeur vide de plat pour initialiser
	 *------------------------
	 */
	 Plat() {
		 
		 this.nomDuPlat = "Plat inconnu";
		 this.ingredientsDuPlat = new ArrayList<>();
		 this.valeursNutritionnelles = ""; 
		 this.allergenes = new ArrayList<Allergene>();
	}
	 
	 /*-------------------------
	  * Constructeur avec paramètres
	  *------------------------
	  */
	  Plat (String nomDuPlat, ArrayList<String> ingredientsDuPlat, ArrayList<Allergene> allergenes, String valeursNutritionnelles) {
		 this.nomDuPlat = nomDuPlat;
		 this.ingredientsDuPlat =ingredientsDuPlat;
		 this.valeursNutritionnelles = valeursNutritionnelles; 
		 this.allergenes = allergenes; 
	 }
	 
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
		 return allergenes;
	 }
	 
	 public void addEtiquette(Etiquette etiquette) {
		 this.sesEtiquettes.add(etiquette);
	 }
/*---------------------------------------
 * Getter pour appeler la classe Etiquette
 * --------------------------------------
 */
	 
	 public String getEtiquette() {
			return Etiquette;
		}

}