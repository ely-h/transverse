package modele;
import java.util.*;

/**
 * FactoryCIUP - Singleton responsable de la création et de la gestion 
 * des objets modélisant la Cité Internationale Universitaire de Paris.
 * Centralise toutes les données de l'application (maisons, étudiants, menus, etc.).
 * 
 * @author hassine
 */
public class FactoryCIUP {
    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Instance unique du singleton */
    private static FactoryCIUP instance;
    
    /** Liste complète des maisons */
    private ArrayList<Maison> lesMaisons;
    
    /** Liste des maisons sélectionnées/filtrées */
    private ArrayList<Maison> listeMaisons;
    
    /** Liste de tous les étudiants */
    private ArrayList<Etudiant> lesEtudiants;
    
    /** Liste d'attente pour les demandes de logement */
    private ArrayList<Etudiant> listeAttente;
    
    /** Filtres disponibles (allergènes, étiquettes) */
    private ArrayList<String> lesFiltres;
    
    /** Liste des Nationnalite du CIUP */
    private ArrayList<Nationnalite> lesNationnalites;
    
    /** Catégories de menus du restaurant universitaire */
    private ArrayList<MenuRestoUParCategorie> lesCategories;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Constructeur privé pour le pattern Singleton
     */
    private FactoryCIUP() {
        // Initialisation différée dans CreationObjets()
    }

    //--------------------------
    // METHODES STATIQUES
    //--------------------------
    
    /**
     * Point d'accès à l'instance unique du Singleton
     * @return L'instance unique de FactoryCIUP
     */
    public static FactoryCIUP getInstance() {
        if (instance == null) {
            instance = new FactoryCIUP();
        }
        return instance;
    }

    //--------------------------
    // METHODES D'INITIALISATION
    //--------------------------
    
    /**
     * Initialise tous les objets de l'application :
     * - Maisons et leurs nationalités
     * - Étudiants
     * - Menus et plats du restaurant universitaire
     * - Allergènes et étiquettes
     */
    public void CreationObjets() {
        // Initialisation des listes
        lesMaisons = new ArrayList<Maison>();
        listeMaisons = new ArrayList<Maison>();
        lesEtudiants = new ArrayList<Etudiant>();
        listeAttente = new ArrayList<Etudiant>();
        lesCategories = new ArrayList<MenuRestoUParCategorie>();
        
        // Création des nationalités
        Nationnalite FR = new Nationnalite("Française");
        Nationnalite ES = new Nationnalite("Espagnole");            
        Nationnalite JP = new Nationnalite("Japonaise");
        Nationnalite TN = new Nationnalite("Tunisienne");
        Nationnalite KR = new Nationnalite("Coréenne"); 
        Nationnalite INT = new Nationnalite("Internationale"); 
        
        this.lesNationnalites.add(FR);
        this.lesNationnalites.add(ES);
        this.lesNationnalites.add(JP);
        this.lesNationnalites.add(TN);
        this.lesNationnalites.add(KR);
        this.lesNationnalites.add(INT);
        
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
		
		Etudiant etudiant1=new Etudiant("Ronaldo", "Dicaprio", "ronaldo.dicaprio@hotmail.com", 2, ES, "img/Etudiants/RonaldoDicaprio.jpg");
		Etudiant etudiant2=new Etudiant("Larry", "Tocrate", "larry.tocrate@orange.fr", 3, FR, "img/Etudiants/LarryTocrate.jpg");
		Etudiant etudiant3=new Etudiant("Yasmine", "Any", "yasmine13.any@yahoo.com", 1, TN, "img/Etudiants/YasmineAny.jpg");
        Etudiant etudiant4 = new Etudiant("Akira", "Tanaka", "akira.tanaka@gmail.com", 4, JP, "img/Etudiants/AkiraTanaka.jpg");
        Etudiant etudiant5 = new Etudiant("Minji", "Kim", "minji.kim@naver.com", 2, KR, "img/Etudiants/MinjiKim.jpg");
        Etudiant etudiant6 = new Etudiant("Sophie", "Dupont", "sophie.dupont@gmail.com", 3, FR, "img/Etudiants/SophieDupont.jpg");
        Etudiant etudiant7 = new Etudiant("Carlos", "Gomez", "carlos.gomez@yahoo.es", 1, ES, "img/Etudiants/CarlosGomez.jpg");
        Etudiant etudiant8 = new Etudiant("Aya", "Nakamura", "aya.nakamura@gmail.com", 5, JP, "img/Etudiants/AyaNakamura.jpg");
        Etudiant etudiant9 = new Etudiant("Amir", "Ben Ali", "amir.benali@yahoo.fr", 2, TN, "img/Etudiants/AmirBenAli.jpg");
        Etudiant etudiant10 = new Etudiant("Junho", "Lee", "junho.lee@naver.com", 4, KR, "img/Etudiants/JunhoLee.jpg");
        
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
        this.lesFiltres=new ArrayList<String>();
        Allergene allergeneLactose = new Allergene("Lactose");
        this.lesFiltres.add(allergeneLactose.getNom());
        Allergene allergeneGluten = new Allergene("Gluten");
        
        Etiquette etiquetteVegetarien = new Etiquette("Végétarien");
        Etiquette etiquetteSansGluten = new Etiquette("Sans gluten");

        this.lesFiltres.add(etiquetteSansGluten.getNom());
        this.lesFiltres.add(etiquetteVegetarien.getNom());
        
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
        
        lesCategories.add(menuEntrees);
        lesCategories.add(menuPlatsPrincipaux);
        lesCategories.add(menuDesserts);
        lesCategories.add(menuExtras);

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

    //--------------------------
    // ACCESSEURS
    //--------------------------
    
    /**
     * @return La liste des catégories de menus
     */
    public ArrayList<MenuRestoUParCategorie> getLesCategories() {
        return lesCategories;
    }
    
    /**
     * @return La liste complète des maisons
     */
    public ArrayList<Maison> getLesMaisons() {
        return lesMaisons;
    }
    
    /**
     * @return La liste complète des étudiants
     */
    public ArrayList<Etudiant> getLesEtudiants() {
        return lesEtudiants;
    }
    
    /**
     * @return La liste des filtres disponibles
     */
    public ArrayList<String> getLesFiltres() {
        return lesFiltres;
    }

    //--------------------------
    // GESTION DE LA LISTE DES MAISONS
    //--------------------------
    
    /**
     * Ajoute une maison à la liste des maisons sélectionnées
     * @param maison La maison à ajouter
     */
    public void addMaisonToListe(Maison maison) {
        if (listeMaisons == null) {
            listeMaisons = new ArrayList<Maison>();
        }
        listeMaisons.add(maison);
    }
    
    /**
     * @return La liste des maisons sélectionnées
     */
    public ArrayList<Maison> getListeMaisons() {
        if (listeMaisons == null) {
            listeMaisons = new ArrayList<Maison>();
        }
        return listeMaisons;
    }

    /**
     * Retire une maison de la liste des maisons sélectionnées
     * @param maison La maison à retirer
     */
    public void removeMaisonFromListe(Maison maison) {
        if (listeMaisons != null) {
            listeMaisons.remove(maison);
        }
    }

    /**
     * Vide la liste des maisons sélectionnées
     */
    public void clearListeMaisons() {
        if (listeMaisons != null) {
            listeMaisons.clear();
        }
    }
    
    /**
     * Fonction qui à partir d'un String renvoie la Nationnalite qui porte le meme nom
     * 
     * @param nationnaliteATrouver chaine du caractère du nom de nationnalité à trouver
     * @return la nationnalité correspondante, si il y en a aucune retourne la nationnalite "Inconnu"
     */
    public Nationnalite chercherNationnalite(String nationnaliteATrouver) {
    	for(Nationnalite n : this.lesNationnalites) {
    		if(n.getNom().equals(nationnaliteATrouver)) {
    			return n;
    		}
    	}
    	return new Nationnalite("Inconnu");
    }
    
}