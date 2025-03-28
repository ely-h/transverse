package CIUP;
import java.util.*;

public class Nationnalite {

	Maison saMaison;
	ArrayList<Etudiant> sesEtudiants;
	private String nom;

	public Nationnalite(String nom) {
		this.nom=nom;
		sesEtudiants=new ArrayList<Etudiant>();
	}

	public void AddEtudiant(Etudiant etudiant) {
		sesEtudiants.add(etudiant);
	}

	public void AddMaison(Maison maison) {
		saMaison=maison;
	}
	
	public String getNom() {
		return nom;
	}
	
	public ArrayList<Etudiant> getSesEtudiants(){
		return sesEtudiants;
	}
	
	public Maison getSaMaison() {
		return saMaison;
	}

}