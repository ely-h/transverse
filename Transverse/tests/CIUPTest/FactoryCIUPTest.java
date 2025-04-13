package CIUPTest;
import java.util.ArrayList;
import CIUP.FactoryCIUP;
import CIUP.Maison;
import CIUP.MaisonInternationale;
import CIUP.Etudiant;

public class FactoryCIUPTest {
	 private static final int NOMBRE_MAISONS_ATTENDU = 6;
	    private static final int NOMBRE_ETUDIANTS_ATTENDU = 10;
	    private static final int NOMBRE_SERVICES_ATTENDUS_MAISON_INTERNATIONALE = 3;

	    public static void main(String[] args) {
	    	/*------------------------------------
	    	 * il s'agit de l'exécution des différents test + l'affichage si tous les tests passent 
	    	 * -----------------------------------
	    	 */
	        FactoryCIUPTest test = new FactoryCIUPTest();
	        test.creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull();
	        test.getLesMaisons_ApresInitialisation_ListeCorrecte();
	        test.getLesEtudiants_ApresInitialisation_ListeCorrecte();
	        test.maisonInternationale_ApresCreation_ContientServicesCorrects();
	        System.out.println("Tous les tests FactoryCIUP sont passés.");
	    }

	    	/*------------------------------------
	    	 * permet de tester les listes de maisons et étudiants après initialisation 
	    	 * -----------------------------------
	    	 */
	    private void creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull() {
	        FactoryCIUP.CreationObjets();
	        assert FactoryCIUP.getLesMaisons() != null : "Les maisons ne sont pas initialisées.";
	        assert FactoryCIUP.getLesEtudiants() != null : "Les étudiants ne sont pas initialisés.";
	        System.out.println("creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull passed.");
	    }
	    /*--------------------------------------------
	     * Verifie le nombre de maisons créeees est correct et que certaines maisons spécifiques existent 
	     * -------------------------------------------
	     */

	    private void getLesMaisons_ApresInitialisation_ListeCorrecte() {
	        FactoryCIUP.CreationObjets();
	        ArrayList<Maison> maisons = FactoryCIUP.getLesMaisons();
	        assert maisons.size() == NOMBRE_MAISONS_ATTENDU : "Nombre de maisons incorrect.";

	        boolean maisonFrancePresente = false;
	        boolean maisonInternationalePresente = false;

	        /*----------------------------------------
	         * Vérifie présence de maison spécifique
	         * ---------------------------------------
	         */
	        for (Maison maison : maisons) {
	            if (maison.getNom().equals("Maison France")) {
	                maisonFrancePresente = true;
	            }
	            if (maison.getNom().equals("Maison Internationale")) {
	                maisonInternationalePresente = true;
	            }
	        }

	        assert maisonFrancePresente : "Maison France manquante.";
	        assert maisonInternationalePresente : "Maison Internationale manquante.";
	        System.out.println("getLesMaisons_ApresInitialisation_ListeCorrecte passed.");
	    }

	    /*------------------------------------------------
	     * Vérifie que le bon nombre d etudiants crée et que l etudiant dicaprio soit bien présent
	     * -----------------------------------------------
	     */
	    private void getLesEtudiants_ApresInitialisation_ListeCorrecte() {
	        FactoryCIUP.CreationObjets();
	        ArrayList<Etudiant> etudiants = FactoryCIUP.getLesEtudiants();
	        assert etudiants.size() == NOMBRE_ETUDIANTS_ATTENDU : "Nombre d'étudiants incorrect.";

	        boolean etudiantDicaprioPresent = false;
	        /*-------------------------------------------
	         * recherche d'un etudiant par son nom
	         * ------------------------------------------
	         */
	        for (Etudiant etudiant : etudiants) {
	            if (etudiant.get_nom().equals("Dicaprio")) {
	                etudiantDicaprioPresent = true;
	            }
	        }

	        assert etudiantDicaprioPresent : "Étudiant Dicaprio manquant.";
	        System.out.println("getLesEtudiants_ApresInitialisation_ListeCorrecte passed.");
	    }
	    /*----------------------------------------------
	     * Verifie que la maison internationale contient les services attendus
	     * ---------------------------------------------
	     */

	    private void maisonInternationale_ApresCreation_ContientServicesCorrects() {
	        FactoryCIUP.CreationObjets();
	        Maison maisonInternationale = getMaisonParNom("Maison Internationale");

	        /*-----------------------------------
	         * Verifie que la maison existe
	         * ----------------------------------
	         */
	        assert maisonInternationale != null : "Maison Internationale non trouvée.";

	        MaisonInternationale maisonCast = (MaisonInternationale) maisonInternationale;
	        ArrayList <String> services = maisonCast.getServices();

	        assert services.size() == NOMBRE_SERVICES_ATTENDUS_MAISON_INTERNATIONALE : "Nombre de services incorrect.";

	        boolean serviceBibliotheque = false;
	        boolean serviceRestoU = false;
	        boolean serviceTheatre = false;

	        /*------------------------------------
	         * Recherche de services spécifiques
	         * -----------------------------------
	         */
	        
	        for (String service : services) {
	            if (service.equals("bibliotheque")) {
	                serviceBibliotheque = true;
	            }
	            if (service.equals("RestoU")) {
	                serviceRestoU = true;
	            }
	            if (service.equals("Theatre")) {
	                serviceTheatre = true;
	            }
	        }

	        assert serviceBibliotheque : "Service 'bibliotheque' manquant.";
	        assert serviceRestoU : "Service 'RestoU' manquant.";
	        assert serviceTheatre : "Service 'Theatre' manquant.";
	        System.out.println("maisonInternationale_ApresCreation_ContientServicesCorrects passed.");
	    }

	    /*------------------------------------------
	     * Methode pour trouver une maison à partir de son nom
	     * -----------------------------------------
	     */
	    private Maison getMaisonParNom(String nomMaison) {
	        ArrayList<Maison> maisons = FactoryCIUP.getLesMaisons();
	        for (Maison maison : maisons) {
	            if (maison.getNom().equals(nomMaison)) {
	                return maison;
	            }
	        }
	        return null;
	    }	

}