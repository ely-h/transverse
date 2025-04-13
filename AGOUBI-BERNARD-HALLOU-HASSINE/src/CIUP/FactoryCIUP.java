package CIUP;
import java.util.*;

// Classe FactoryCIUP permettant de créer et initialiser tous les objets nécessaires pour représenter la Cité Internationale Universitaire de Paris (CIUP).
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
        Etudiant etudiant4 = new Etudiant("Akira", "Tanaka", "akira.tanaka@gmail.com", 4, JP);
        Etudiant etudiant5 = new Etudiant("Minji", "Kim", "minji.kim@naver.com", 2, KR);
        Etudiant etudiant6 = new Etudiant("Sophie", "Dupont", "sophie.dupont@gmail.com", 3, FR);
        Etudiant etudiant7 = new Etudiant("Carlos", "Gomez", "carlos.gomez@yahoo.es", 1, ES);
        Etudiant etudiant8 = new Etudiant("Aya", "Nakamura", "aya.nakamura@gmail.com", 5, JP);
        Etudiant etudiant9 = new Etudiant("Amir", "Ben Ali", "amir.benali@yahoo.fr", 2, TN);
        Etudiant etudiant10 = new Etudiant("Junho", "Lee", "junho.lee@naver.com", 4, KR);
        
		maisonEspagne.addEtudiant(etudiant1);
		maisonFrance.addEtudiant(etudiant2);
		maisonTunisie.addEtudiant(etudiant3);
        maisonJapon.addEtudiant(etudiant4);
        maisonCoree.addEtudiant(etudiant5);
        maisonFrance.addEtudiant(etudiant6);
        maisonEspagne.addEtudiant(etudiant7);
        maisonJapon.addEtudiant(etudiant8);
        maisonTunisie.addEtudiant(etudiant9);
        maisonCoree.addEtudiant(etudiant10);
		
		lesEtudiants.add(etudiant1);
		lesEtudiants.add(etudiant2);
		lesEtudiants.add(etudiant3);
        lesEtudiants.add(etudiant4);
        lesEtudiants.add(etudiant5);
        lesEtudiants.add(etudiant6);
        lesEtudiants.add(etudiant7);
        lesEtudiants.add(etudiant8);
        lesEtudiants.add(etudiant9);
        lesEtudiants.add(etudiant10);
        
		
     // Création des listes d'ingrédients
        ArrayList<String> ingredientsSaladeCesar = new ArrayList<>();
        ingredientsSaladeCesar.add("salade");
        ingredientsSaladeCesar.add("poulet grillé");
        ingredientsSaladeCesar.add("parmesan");

        ArrayList<String> ingredientsCarbonara = new ArrayList<>();
        ingredientsCarbonara.add("pâtes");
        ingredientsCarbonara.add("lardons");
        ingredientsCarbonara.add("crème fraîche");

        ArrayList<String> ingredientsSushi = new ArrayList<>();
        ingredientsSushi.add("riz");
        ingredientsSushi.add("saumon");
        ingredientsSushi.add("algues");

        ArrayList<String> ingredientsCouscous = new ArrayList<>();
        ingredientsCouscous.add("semoule");
        ingredientsCouscous.add("viande");
        ingredientsCouscous.add("légumes");

        ArrayList<String> ingredientsTiramisu = new ArrayList<>();
        ingredientsTiramisu.add("biscuits");
        ingredientsTiramisu.add("café");
        ingredientsTiramisu.add("mascarpone");

        ArrayList<String> ingredientsFondantChocolat = new ArrayList<>();
        ingredientsFondantChocolat.add("chocolat");
        ingredientsFondantChocolat.add("beurre");
        ingredientsFondantChocolat.add("sucre");

        ArrayList<String> ingredientsBurger = new ArrayList<>();
        ingredientsBurger.add("pain");
        ingredientsBurger.add("steak");
        ingredientsBurger.add("fromage");

        ArrayList<String> ingredientsPizza = new ArrayList<>();
        ingredientsPizza.add("pâte");
        ingredientsPizza.add("tomates");
        ingredientsPizza.add("mozzarella");

        // Création des plats avec les listes d'ingrédients
        Plat entree1 = new Plat("Salade César", ingredientsSaladeCesar, "Calories: 400 kcal");
        Plat entree2 = new Plat("Soupe de légumes", ingredientsCouscous, "Calories: 300 kcal");

        Plat platPrincipal1 = new Plat("Pâtes Carbonara", ingredientsCarbonara, "Calories: 500 kcal");
        Plat platPrincipal2 = new Plat("Couscous", ingredientsCouscous, "Calories: 600 kcal");

        Plat dessert1 = new Plat("Tiramisu", ingredientsTiramisu, "Calories: 450 kcal");
        Plat dessert2 = new Plat("Fondant au chocolat", ingredientsFondantChocolat, "Calories: 500 kcal");

        Plat extra1 = new Plat("Burger", ingredientsBurger, "Calories: 700 kcal");
        Plat extra2 = new Plat("Pizza Margherita", ingredientsPizza, "Calories: 650 kcal");

        // Ajout d'allergènes et d'étiquettes aux plats
        Allergene allergeneLactose = new Allergene("Lactose");
        Allergene allergeneGluten = new Allergene("Gluten");
        Etiquette etiquetteVegetarien = new Etiquette("Végétarien");
        Etiquette etiquetteSansGluten = new Etiquette("Sans gluten");

        entree1.addEtiquette(etiquetteSansGluten);
        entree1.addAllergene(allergeneLactose);

        platPrincipal1.addAllergene(allergeneGluten);

        dessert1.addEtiquette(etiquetteVegetarien);

        extra1.addAllergene(allergeneLactose);

        // Création des catégories de menus
        MenuRestoUParCategorie menuEntrees = new MenuRestoUParCategorie(entree1);
        menuEntrees.setCategorie("Entrées");
        menuEntrees.addPlat(entree2);

        MenuRestoUParCategorie menuPlatsPrincipaux = new MenuRestoUParCategorie(platPrincipal1);
        menuPlatsPrincipaux.setCategorie("Plats principaux");
        menuPlatsPrincipaux.addPlat(platPrincipal2);

        MenuRestoUParCategorie menuDesserts = new MenuRestoUParCategorie(dessert1);
        menuDesserts.setCategorie("Desserts");
        menuDesserts.addPlat(dessert2);

        MenuRestoUParCategorie menuExtras = new MenuRestoUParCategorie(extra1);
        menuExtras.setCategorie("Extras");
        menuExtras.addPlat(extra2);

        // Création des RestoU
        RestoU restoFrance = new RestoU(maisonFrance);
        RestoU restoEspagne = new RestoU(maisonEspagne);
        RestoU restoJapon = new RestoU(maisonJapon);
        RestoU restoTunisie = new RestoU(maisonTunisie);
        RestoU restoCoree = new RestoU(maisonCoree);
        RestoU restoInternational = new RestoU(maisonInternationale);

        // Ajout des catégories aux RestoU
        restoFrance.addCategorieRestoU(menuEntrees);
        restoFrance.addCategorieRestoU(menuPlatsPrincipaux);
        restoFrance.addCategorieRestoU(menuDesserts);
        restoFrance.addCategorieRestoU(menuExtras);

        restoEspagne.addCategorieRestoU(menuEntrees);
        restoEspagne.addCategorieRestoU(menuPlatsPrincipaux);
        restoEspagne.addCategorieRestoU(menuDesserts);
        restoEspagne.addCategorieRestoU(menuExtras);

        restoJapon.addCategorieRestoU(menuEntrees);
        restoJapon.addCategorieRestoU(menuPlatsPrincipaux);
        restoJapon.addCategorieRestoU(menuDesserts);
        restoJapon.addCategorieRestoU(menuExtras);

        restoTunisie.addCategorieRestoU(menuEntrees);
        restoTunisie.addCategorieRestoU(menuPlatsPrincipaux);
        restoTunisie.addCategorieRestoU(menuDesserts);
        restoTunisie.addCategorieRestoU(menuExtras);

        restoCoree.addCategorieRestoU(menuEntrees);
        restoCoree.addCategorieRestoU(menuPlatsPrincipaux);
        restoCoree.addCategorieRestoU(menuDesserts);
        restoCoree.addCategorieRestoU(menuExtras);

        restoInternational.addCategorieRestoU(menuEntrees);
        restoInternational.addCategorieRestoU(menuPlatsPrincipaux);
        restoInternational.addCategorieRestoU(menuDesserts);
        restoInternational.addCategorieRestoU(menuExtras);
    
    }
	
	public static ArrayList<Maison> getLesMaisons(){
		return lesMaisons;
	}
	
	public static ArrayList<Etudiant> getLesEtudiants(){
		return lesEtudiants;
	}
	

}