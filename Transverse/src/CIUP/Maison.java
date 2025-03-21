package CIUP;
import java.util.*;

public class Maison {
	
	/*------------------------------------
	 * attributs
	 * ------------------------------------
	 */

	ArrayList<MenuRestoUParCategorie> sonMenuRestoUParCategorie;
	ArrayList<Etudiant> sesEtudiants;
	Nationnalite saNationnalite;
	private String nom;
	private String nationalite;
	private int longitude;
	private int lattitude;
	private int nombreChambres;
	
	/*------------------------------------
	 * constructeur
	 * ------------------------------------
	 */

	public Maison(String nom,Nationnalite nationnalite,int longitude, int lattitude, int nombreTotalChambres) {
		sonMenuRestoUParCategorie=new ArrayList<MenuRestoUParCategorie>(4);
		this.nom=nom;
		saNationnalite=nationnalite;
		this.longitude=longitude;
		this.lattitude=lattitude;
		nombreChambres=nombreTotalChambres;
	}
	
	/*------------------------------------
	 * methodes
	 * ------------------------------------
	 */
	
	public boolean addEtudiant(Etudiant etudiantAAjouter)
	{
		if(nombreChambres-sesEtudiants.size()>=0)
		{
			sesEtudiants.add(etudiantAAjouter);
			return true;
		}
		else
		{
			System.out.println("Nombre maximum d'etudiants atteint");
			return false;
		}
	//La methode ajoute un etudiant seulement si quand on l'ajoute on ne depasse pas le nombre maximum de lits occupes.
	//Elle retourne vrai si l'etudiant a pu etre ajoute, sinon false
	}

	public String getNom() {
		return nom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public int getLongitude() {
		return longitude;
	}

	public int getLattitude() {
		return lattitude;
	}

	public int getNombreChambres() {
		return nombreChambres;
	}
	
	public int getNombreEtudiants() {
		return sesEtudiants.size();
	}
}