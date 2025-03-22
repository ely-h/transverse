package CIUP;
import java.util.*;

public class FactoryCIUP {

	private static ArrayList<Maison> lesMaisons;
	private static ArrayList<Maison> listeMaison;
	private static ArrayList<Etudiant> lesEtudiants;
	private static ArrayList<Etudiant> listeAttente;
	
	/*---------------------------
	 * Initialise les listes
	 * --------------------------
	 */
	 
	 public static void initialiserListes() {
		 lesMaisons = new ArrayList<Maison>();
		 listeMaison = new ArrayList<Maison>();
		 lesEtudiants = new ArrayList<Etudiants>();
		 listeAttente = new ArrayList<Etudiant>():
	 }
/*-------------------------------
 *  Cette méthode permet de creer une maison et de la rajouter dans la liste de maison
 *  -----------------------------
 */
	
 public static void creerMaisons();{
	 	Maison maisonFrance = new Maison("Maison France", "Française", 48, 2, 50);
		Maison maisonEspagne = new Maison("Maison Espagnole", "Espagne", 40, -3, 30);
		Maison maisonJapon = new Maison("Maison Japon", "Japonaise", 35, 139, 40);
		Maison maisonInternationale = new Maison ("Maison Internationale", " Toutes les Nationalité", 0, 0, 100 );
		

		/*------------------------------------
		 * Permet d'ajouter les maisons dans la liste
		 * -----------------------------------
		 */
		listeMaisons.add(maisonFrance);
		listeMaisons.add(maisonEspagne);
		listeMaisons.add(maisonJapon);
		listeMaisons.add(maisonInternationale);
		
		/*----------------------------------
		 * Afficher les maisons et la maison internationale 
		 * ---------------------------------
		 */

		System.out.println(maisonFrance); 
		System.out.println(maisonEspagne);
		System.out.println(maisonJapon);
		System.out.println(maisonInternationale);
		 
		}
	 
	 
 /*-------------------------------
  * Cette méthode permet de creer un etudiant avec une maison
  * ------------------------------ 
  */
	
  public static void creerEtudiantsAvecMaison(String nom, String nationalite) {
	  Etudiant etudiant = new Etudiant(nom, nationalite);
	  
	  // Nous cherchos si les maisons sont compatible avec l'étudiant 
	  for (Maison maison ; listeMaisons) {
		  //on compare ici les nationalites
		  if (maison.getNationalite().compareTo(nationalite) == 0 && maison.getNombreEtudiant() < maison.getNombreChambres()) {
			  maison.addEtudiant(etudiant);
			  listeEtudiats.add(etudiant);
			  System.out.println("l'étudiant"+nom + "est placé dans la maison" + maison.getNom());
			  return; 
		  }
	  }
		listeAttente.add(etudiant);
		System.out.println("l'étudiant"+ nom +"est placé dans la liste attente");
		
	}

  /*---------------------------------
   * Permet de mettre un etudiant creer dans la liste d'attente
   * --------------------------------
   */
   
	public static void creerEtudiantsListeAttente() {
		Etudiant etudiant = new Etudiant(nom, nationalite);
		listeAttente.add(etudiant);
		System.out.println("l'étudiant"+ nom +"est placé dans la liste attente");
	}

/*-------------------------------------
 * Permet de creer une liste de maison 
 * ------------------------------------
 */

	public static void creerListeMaisons() {
		
		
		/*---------------------------------------
		 * Permet d'afficher les maisons créees
		 * --------------------------------------
		 */
		
		 System.out.println("Maisons créées : ");
	    for (Maison maison : listeMaisons) {
	        System.out.println("  " + maison.getNom() + "Nationalité : " + maison.getNationalite());
	    }
	}
 
 /*------------------------------------------------
  * Permet d'appeler les méthodes
  * -----------------------------------------------
  */
 public static void main(String[] args) {
	    creerListeMaisons(); 
	    creerEtudiantsListeAttente();
	    creerEtudiantsAvecMaison();
	    creerMaisons();
	}
}