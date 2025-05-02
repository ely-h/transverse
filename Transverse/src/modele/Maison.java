package modele;
import java.util.*;

public class Maison {
	
	/*------------------------------------
	 * attributs
	 * ------------------------------------
	 */

	RestoU sonRestoU;
	ArrayList<Etudiant> sesEtudiants=new ArrayList<Etudiant>();
	Nationnalite saNationnalite;
	private String nom;
	private String nationalite;
	private double longitude;
	private double lattitude;
	private int nombreChambres;
	
	/*------------------------------------
	 * constructeur
	 * ------------------------------------
	 */

	public Maison(String nom,Nationnalite nationnalite,double longitude, double lattitude, int nombreTotalChambres) {
		
		this.nom=nom;
		saNationnalite=nationnalite;
		saNationnalite.AddMaison(this);
		this.longitude=longitude;
		this.lattitude=lattitude;
		nombreChambres=nombreTotalChambres;
	}
	
	/*------------------------------------
	 * methodes
	 * ------------------------------------
	 */
	
	public void addRestoU(RestoU resto) {
		sonRestoU=resto;
	}
	
	public boolean addEtudiant(Etudiant etudiantAAjouter)
	{
		if(nombreChambres-sesEtudiants.size()>=0)
		{
			sesEtudiants.add(etudiantAAjouter);
			etudiantAAjouter.set_saMaison(this);
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
	
	public RestoU getSonRestoU(){
		return sonRestoU;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLattitude() {
		return lattitude;
	}

	public int getNombreChambres() {
		return nombreChambres;
	}
	
	public int getNombreEtudiants() {
		return sesEtudiants.size();
	}

	public void afficherEtudiants(){
		for(Etudiant etudiant : sesEtudiants){
			System.out.println(etudiant);
		}
	}
	public String toString(){
		return nom+" de "+saNationnalite.getNom()+"\nSes coordonnes gps sont longitude="+longitude+" lattitude="+lattitude;
	}
}