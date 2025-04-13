package CIUPTest;
import CIUP.FactoryCIUP;
import Maison;
import MaisonInternationale;
import Etudiant;

public class FactoryCIUPTest {
	 private static final int NOMBRE_MAISONS_ATTENDU = 6;
	    private static final int NOMBRE_ETUDIANTS_ATTENDU = 10;
	    private static final int NOMBRE_SERVICES_ATTENDUS_MAISON_INTERNATIONALE = 3;

	    public static void main(String[] args) {
	        FactoryCIUPTest test = new FactoryCIUPTest();
	        test.creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull();
	        test.getLesMaisons_ApresInitialisation_ListeCorrecte();
	        test.getLesEtudiants_ApresInitialisation_ListeCorrecte();
	        test.maisonInternationale_ApresCreation_ContientServicesCorrects();
	        System.out.println("Tous les tests FactoryCIUP sont passés.");
	    }

	    private void creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull() {
	        FactoryCIUP.creationObjets();
	        assert FactoryCIUP.getLesMaisons() != null : "Les maisons ne sont pas initialisées.";
	        assert FactoryCIUP.getLesEtudiants() != null : "Les étudiants ne sont pas initialisés.";
	        System.out.println("creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull passed.");
	    }

	    private void getLesMaisons_ApresInitialisation_ListeCorrecte() {
	        FactoryCIUP.creationObjets();
	        Maison[] maisons = FactoryCIUP.getLesMaisons();
	        assert maisons.length == NOMBRE_MAISONS_ATTENDU : "Nombre de maisons incorrect.";

	        boolean maisonFrancePresente = false;
	        boolean maisonInternationalePresente = false;

	        for (int i = 0; i < maisons.length; i++) {
	            if (maisons[i].getNom().equals("Maison France")) {
	                maisonFrancePresente = true;
	            }
	            if (maisons[i].getNom().equals("Maison Internationale")) {
	                maisonInternationalePresente = true;
	            }
	        }

	        assert maisonFrancePresente : "Maison France manquante.";
	        assert maisonInternationalePresente : "Maison Internationale manquante.";
	        System.out.println("getLesMaisons_ApresInitialisation_ListeCorrecte passed.");
	    }

	    private void getLesEtudiants_ApresInitialisation_ListeCorrecte() {
	        FactoryCIUP.creationObjets();
	        Etudiant[] etudiants = FactoryCIUP.getLesEtudiants();
	        assert etudiants.length == NOMBRE_ETUDIANTS_ATTENDU : "Nombre d'étudiants incorrect.";

	        boolean etudiantDicaprioPresent = false;
	        for (int i = 0; i < etudiants.length; i++) {
	            if (etudiants[i].getNom().equals("Dicaprio")) {
	                etudiantDicaprioPresent = true;
	            }
	        }

	        assert etudiantDicaprioPresent : "Étudiant Dicaprio manquant.";
	        System.out.println("getLesEtudiants_ApresInitialisation_ListeCorrecte passed.");
	    }

	    private void maisonInternationale_ApresCreation_ContientServicesCorrects() {
	        FactoryCIUP.creationObjets();
	        Maison maisonInternationale = getMaisonParNom("Maison Internationale");

	        assert maisonInternationale != null : "Maison Internationale non trouvée.";

	        MaisonInternationale maisonCast = (MaisonInternationale) maisonInternationale;
	        String[] services = maisonCast.getServices();

	        assert services.length == NOMBRE_SERVICES_ATTENDUS_MAISON_INTERNATIONALE : "Nombre de services incorrect.";

	        boolean serviceBibliotheque = false;
	        boolean serviceRestoU = false;
	        boolean serviceTheatre = false;

	        for (int i = 0; i < services.length; i++) {
	            if (services[i].equals("bibliotheque")) {
	                serviceBibliotheque = true;
	            }
	            if (services[i].equals("RestoU")) {
	                serviceRestoU = true;
	            }
	            if (services[i].equals("Theatre")) {
	                serviceTheatre = true;
	            }
	        }

	        assert serviceBibliotheque : "Service 'bibliotheque' manquant.";
	        assert serviceRestoU : "Service 'RestoU' manquant.";
	        assert serviceTheatre : "Service 'Theatre' manquant.";
	        System.out.println("maisonInternationale_ApresCreation_ContientServicesCorrects passed.");
	    }

	    private Maison getMaisonParNom(String nomMaison) {
	        Maison[] maisons = FactoryCIUP.getLesMaisons();
	        for (int i = 0; i < maisons.length; i++) {
	            if (maisons[i].getNom().equals(nomMaison)) {
	                return maisons[i];
	            }
	        }
	        return null;
	    }	

}
