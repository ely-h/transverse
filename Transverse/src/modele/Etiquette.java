package modele;

import java.io.Serializable;

/*------------------------------
 * Classe Etiquette
 * -----------------------------
 */

public class Etiquette implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nom;
	
/*------------------------------
 * Constructeur de la classe Etiquette  
 * -----------------------------
 */
	
	public Etiquette(String nom){
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
