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
	private ArrayList<String> allergenes;

	/*-------------------------
	 * Constructeur vide de plat pour initialiser
	 *------------------------
	 */
	 Plat() {
		 
		 this.nomDuPlat = "Plat inconnu";
		 this.ingredientsDuPlat = new ArrayList<>();
		 this.valeursNutritionnelles = ""; 
		 this.allergenes = new ArrayList<String>();
	}
	 
	 /*-------------------------
	  * Constructeur avec paramètres
	  *------------------------
	  */
	  Plat (String nomDuPlat, ArrayList<String> ingredientsDuPlat, ArrayList<String> allergenes, String valeursNutritionnelles) {
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
	 
	 public List<String> getAllergenes (){
		 return allergenes;
	 }
	
/*------------------------------
 * Cette classe permet de renvoyer le nom et le logo des allergènes en utilisant le chemin vers le logo des allergènes
 *-----------------------------
 */
 	class Etiquette() {
		private String nomDeEtiquette;
		private String logoPath; 
	}
 
 /*---------------------------
  * Constructeur Etiquette 
  *---------------------------
  */
 public Etiquette ( String nomDeEtiquette, String logoPath) {
	 this.nomDeEtiquette = nomDeEtiquette;
	 this.logoPath = logoPath; 
 }
 /*----------------------------
  * La méthode Getter permet ici d'accéder aux valeurs de nom de l'etiquette et de son logo
  *----------------------------
  */
  
 public String getNomDeEtiquette() {
	 return nomDeEtiquette; 
 }
 
 public String getLogoPath() {
	 return logoPath;
 }
 
 /*-----------------------------
  * cette classe permet d'afficher le logo des etiquettes 
  *----------------------------
  */
 
public class AfficherLogo{
	public static void main (String[] args) {
	
		Etiquette Gluten = new Etiquette ("Gluten", "images/Gluten.png");
		Etiquette Arachide = new Etiquette ("Arachide", "images/Arachide.png");
		Etiquette MollusquesCrustacés = new Etiquette ("MollusquesCrustacés", "images/MollusquesCrustacés.png");
		Etiquette Noix = new Etiquette ("Noix", "images/Noix.png");
		Etiquette Vegan = new Etiquette ("images/Vegan.png"); 
	
		System.out.println(Gluten);
		System.out.println(Arachide);
		System.out.println(MollusquesCrustacés);
		System.out.println(Noix);
		System.out.println(Vegan);
	
	}	
}

}