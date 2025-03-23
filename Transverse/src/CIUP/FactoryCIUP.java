package CIUP;
import java.util.*;

public class FactoryCIUP {

	private static ArrayList<Maison> lesMaisons;
	private static ArrayList<Maison> listeMaisons;
	private static ArrayList<Etudiant> lesEtudiants;
	private static ArrayList<Etudiant> listeAttente;
	
/*---------------------------
* Initialise les listes
* --------------------------
*/
	 
	 public static void initialiserListes() {
		 lesMaisons = new ArrayList<Maison>();
		 listeMaisons = new ArrayList<Maison>();
		 lesEtudiants = new ArrayList<Etudiant>();
		 listeAttente = new ArrayList<Etudiant>():
	 }

/*------------------------------
* Cette méthode permet de créer les nationalités des maisons
* ------------------------------ 
*/
	 
public static void creerNationalite() {
	Nationalite FR = new Nationalite ("Française");
	Nationalite ES = new Nationalite ("Espagnole");
	Nationalite JP = new Nationalite ("Japonaise");
	Nationalite TN = new Nationalite ("Tunisienne");
	Nationalite KR = new Nationalite ("Coréenne"); 
	Nationalite INT = new Nationalite ("Internationale"); 	
}

/*-------------------------------
 *  Cette méthode permet de creer une maison et de la rajouter dans la liste de maison
 *  -----------------------------
 */
	
 public static void creerMaisons();{
	 	Maison maisonFrance = new Maison("Maison France", "Française", 48, 2, 50);
		Maison maisonEspagne = new Maison("Maison Espagnole", "Espagne", 40, -3, 30);
		Maison maisonJapon = new Maison("Maison Japon", "Japonaise", 35, 139, 40);
		Maison maisonTunisie = new Maison ("Maison Tunisie", "Tunisie", 36, 10, 35);
		Maison maisonCoree = new Maison ("Maison Coree", "Coree", 37, 127, 45);
		MaisonInternationale maisonInternationale = new MaisonInternationale ("Maison Internationale", " Toutes les Nationalité", 0, 0, 100 );
		

/*------------------------------------
* Permet d'ajouter les maisons dans la liste
* -----------------------------------
*/
		listeMaisons.add(maisonFrance);
		listeMaisons.add(maisonEspagne);
		listeMaisons.add(maisonJapon);
		listeMaisons.add(maisonTunisie);
		listeMaisons.add(maisonCoree);
		listeMaisons.add(maisonInternationale);
		
/*----------------------------------
* Afficher les maisons et la maison internationale 
* ---------------------------------
*/

		System.out.println(maisonFrance); 
		System.out.println(maisonEspagne);
		System.out.println(maisonJapon);
		System.out.println(maisonTunisie); 
		System.out.println(maisonCoree);
		System.out.println(maisonInternationale);
		 
		}
	 
	 
/*-------------------------------
 * Cette méthode permet de creer un etudiant avec une maison
 * ------------------------------ 
 */
	
  public static void creerEtudiantsAvecMaison() {
	  Etudiant etudiant = new Etudiant("nom", "nationalite", "email", "annee etude", "nationalite");
	  Etudiant etudiant1("Ronaldo", "Dicaprio", "ronaldo.dicaprio@hotmail.com", 2, ES);
	  Etudiant etudiant2("Larry", "Tocrate", "larry.tocrate@orange.fr", 3, FR);
	  Etudiant etudiant1("Yasmine", "Any", "yasmine13.any@yahoo.com", 1, TN);
	}

/*---------------------------------
* Permet de mettre un etudiant creer dans la liste d'attente
* ---------------------------------
*/
   
	public static void creerEtudiantsListeAttente() {
		Etudiant etudiant = new Etudiant(nom, nationalite, email, annee etude, Nationalité);
		listeAttente.add(etudiant);
		System.out.println("l'étudiant"+ nom +"est placé dans la liste attente");
	}

/*-------------------------------------
 * Permet de creer une liste de maison 
 * ------------------------------------
 */

	public static void creerListeMaisons() {
		
	    }
	}
 
/*------------------------------------------------
* Permet d'appeler les méthodes
* ------------------------------------------------
*/
 public static void main(String[] args) {
	 	creerNationalite()
	    creerListeMaisons(); 
	    creerEtudiantsListeAttente();
	    creerEtudiantsAvecMaison();
	    creerMaisons();
	}
}