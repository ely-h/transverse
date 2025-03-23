package CIUP;
import java.util.*;

public class FactoryCIUP {

	private static ArrayList<Maison> lesMaisons;
	private static ArrayList<Maison> listeMaisons;
	private static ArrayList<Etudiant> lesEtudiants;
	private static ArrayList<Etudiant> listeAttente;
	
	public static void CreationObjets() {
		FactoryCIUP a = new FactoryCIUP();
		
		/*---------------------------
		* Initialise les listes
		* --------------------------
		*/
		
		lesMaisons = new ArrayList<Maison>();
		listeMaisons = new ArrayList<Maison>();
		lesEtudiants = new ArrayList<Etudiant>();
		listeAttente = new ArrayList<Etudiant>();
		
		/*------------------------------
		* Permet de créer les nationalités des maisons
		* ------------------------------ 
		*/
		 
		 Nationnalite FR = new Nationnalite ("Française");
		Nationnalite ES = new Nationnalite ("Espagnole");			
		Nationnalite JP = new Nationnalite ("Japonaise");
		Nationnalite TN = new Nationnalite ("Tunisienne");
		Nationnalite KR = new Nationnalite ("Coréenne"); 
		Nationnalite INT = new Nationnalite ("Internationale"); 
		
		/*-------------------------------
		 *  Permet de creer une maison et de la rajouter dans la liste de maison
		 *  -----------------------------
		 */
		
		Maison maisonFrance = new Maison("Maison France", FR, 48, 2, 50);
		Maison maisonEspagne = new Maison("Maison Espagnole", ES, 40, -3, 30);
		Maison maisonJapon = new Maison("Maison Japon", JP, 35, 139, 40);
		Maison maisonTunisie = new Maison ("Maison Tunisie", TN, 36, 10, 35);
		Maison maisonCoree = new Maison ("Maison Coree", KR, 37, 127, 45);
		MaisonInternationale maisonInternationale = new MaisonInternationale ("Maison Internationale", INT, 0, 0, 100 );
		maisonInternationale.addService("bibliotheque");
		maisonInternationale.addService("RestoU");
		maisonInternationale.addService("Theatre");
		
		lesMaisons.add(maisonFrance);
		lesMaisons.add(maisonEspagne);
		lesMaisons.add(maisonJapon);
		lesMaisons.add(maisonTunisie);
		lesMaisons.add(maisonCoree);
		lesMaisons.add(maisonInternationale);
		
		for(Maison maison : lesMaisons)
			System.out.println(maison);
		
		/*-------------------------------
		 * Permet de creer des etudiant avec une maison
		 * ------------------------------ 
		 */
		
		Etudiant etudiant1=new Etudiant("Ronaldo", "Dicaprio", "ronaldo.dicaprio@hotmail.com", 2, ES);
		Etudiant etudiant2=new Etudiant("Larry", "Tocrate", "larry.tocrate@orange.fr", 3, FR);
		Etudiant etudiant3=new Etudiant("Yasmine", "Any", "yasmine13.any@yahoo.com", 1, TN);
		
		maisonEspagne.addEtudiant(etudiant1);
		maisonFrance.addEtudiant(etudiant2);
		maisonTunisie.addEtudiant(etudiant3);
		
		lesEtudiants.add(etudiant1);
		lesEtudiants.add(etudiant2);
		lesEtudiants.add(etudiant3);
		
		
		for(Etudiant etudiant : lesEtudiants)
			System.out.println(etudiant);
		
		
			 
	}
	

}