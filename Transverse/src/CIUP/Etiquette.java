package CIUP;

/*------------------------------
 * Classe Etiquette
 * -----------------------------
 */

public class Etiquette {
	private String nom;
	
/*------------------------------
 * Constructeur de la classe Etiquette  
 * -----------------------------
 */
	
	Etiquette(String nom){
		this.nom=nom;
	}
	
/*------------------------------
 * Getter qui permet de recuperer le nom de l'étiquette
 * -----------------------------
 */
	public String getNom() {
		return nom;
	}

}
