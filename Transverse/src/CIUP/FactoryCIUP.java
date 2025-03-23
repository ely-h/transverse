package CIUP;
import java.util.*;

public class FactoryCIUP {

	private static ArrayList<Maison> lesMaisons;
	private static ArrayList<Maison> listeMaisons;
	private static ArrayList<Etudiant> lesEtudiants;
	private static ArrayList<Etudiant> listeAttente;
	
	public static void CreationObjets() {
		FactoryCIUP a = new FactoryCIUP();
		
		lesMaisons = new ArrayList<Maison>();
		 listeMaisons = new ArrayList<Maison>();
		 lesEtudiants = new ArrayList<Etudiant>();
		 listeAttente = new ArrayList<Etudiant>();
		 
		 Nationnalite FR = new Nationnalite ("Française");
		Nationnalite ES = new Nationnalite ("Espagnole");			
		Nationnalite JP = new Nationnalite ("Japonaise");
		Nationnalite TN = new Nationnalite ("Tunisienne");
		Nationnalite KR = new Nationnalite ("Coréenne"); 
		Nationnalite INT = new Nationnalite ("Internationale"); 
		
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
		
		System.out.println(maisonFrance); 
		System.out.println(maisonEspagne);
		System.out.println(maisonJapon);
		System.out.println(maisonTunisie); 
		System.out.println(maisonCoree);
		System.out.println(maisonInternationale);
		
		Etudiant etudiant1=new Etudiant("Ronaldo", "Dicaprio", "ronaldo.dicaprio@hotmail.com", 2, ES);
		Etudiant etudiant2=new Etudiant("Larry", "Tocrate", "larry.tocrate@orange.fr", 3, FR);
		Etudiant etudiant3=new Etudiant("Yasmine", "Any", "yasmine13.any@yahoo.com", 1, TN);
		
		lesEtudiants.add(etudiant1);
		lesEtudiants.add(etudiant2);
		lesEtudiants.add(etudiant3);
		
		for(Etudiant etudiant : lesEtudiants)
			System.out.println(etudiant);
		
		
		
		//return a;
			 
	}
	
/*---------------------------
* Initialise les listes
* --------------------------
*/
	/*
	 
	 public static void initialiserListes() {
		 lesMaisons = new ArrayList<Maison>();
		 listeMaisons = new ArrayList<Maison>();
		 lesEtudiants = new ArrayList<Etudiant>();
		 listeAttente = new ArrayList<Etudiant>():
	 }

/*------------------------------
* Cette méthode permet de créer les nationalités des maisons
* ------------------------------ 
*//*
	 
public static void creerNationnalite() {
	Nationnalite FR = new Nationnalite ("Française");
	Nationnalite ES = new Nationnalite ("Espagnole");
	Nationnalite JP = new Nationnalite ("Japonaise");
	Nationnalite TN = new Nationnalite ("Tunisienne");
	Nationnalite KR = new Nationnalite ("Coréenne"); 
	Nationnalite INT = new Nationnalite ("Internationale"); 	
}

/*-------------------------------
 *  Cette méthode permet de creer une maison et de la rajouter dans la liste de maison
 *  -----------------------------
 *//*
	
 public static ArrayList<Maison> creerMaisons(){
	 ArrayList<Maison> listeMaisons=new ArrayList<Maison>();
	 
	 	Maison maisonFrance = new Maison("Maison France", FR, 48, 2, 50);
		Maison maisonEspagne = new Maison("Maison Espagnole", ES, 40, -3, 30);
		Maison maisonJapon = new Maison("Maison Japon", JP, 35, 139, 40);
		Maison maisonTunisie = new Maison ("Maison Tunisie", TN, 36, 10, 35);
		Maison maisonCoree = new Maison ("Maison Coree", KR, 37, 127, 45);
		MaisonInternationale maisonInternationale = new MaisonInternationale ("Maison Internationale", INT, 0, 0, 100 );
 
		

*------------------------------------
* Permet d'ajouter les maisons dans la liste
* -----------------------------------
*
		listeMaisons.add(maisonFrance);
		listeMaisons.add(maisonEspagne);
		listeMaisons.add(maisonJapon);
		listeMaisons.add(maisonTunisie);
		listeMaisons.add(maisonCoree);
		listeMaisons.add(maisonInternationale);*/
		
/*----------------------------------
* Afficher les maisons et la maison internationale 
* ---------------------------------
*//*

		for(Maison maison : listeMaisons)
			System.out.println(maison);
		
		return listeMaisons;
		 
		}*/
	 
	 
/*-------------------------------
 * Cette méthode permet de creer un etudiant avec une maison
 * ------------------------------ 
 *//*
	
  public static void creerEtudiantsAvecMaison() {
	  Etudiant etudiant1("Ronaldo", "Dicaprio", "ronaldo.dicaprio@hotmail.com", 2, ES);
	  Etudiant etudiant2("Larry", "Tocrate", "larry.tocrate@orange.fr", 3, FR);
	  Etudiant etudiant1("Yasmine", "Any", "yasmine13.any@yahoo.com", 1, TN);
	}*/

/*---------------------------------
* Permet de mettre un etudiant creer dans la liste d'attente
* ---------------------------------
*/
  /*
   
	public static void creerEtudiantsListeAttente() {
		Etudiant etudiant = new Etudiant(nom, nationalite, email, ??, Nationalité);
		listeAttente.add(etudiant);
		System.out.println("l'étudiant"+ nom +"est placé dans la liste attente");
	}*/

/*-------------------------------------
 * Permet de creer une liste de maison 
 * ------------------------------------
 */

	
 
/*------------------------------------------------
* Permet d'appeler les méthodes
* ------------------------------------------------
*/
 public static void main(String[] args) {
	 	FactoryCIUP.CreationObjets();
	    /*creerListeMaisons(); 
	    creerEtudiantsListeAttente();
	    creerEtudiantsAvecMaison();
	    creerMaisons();*/
	}
}