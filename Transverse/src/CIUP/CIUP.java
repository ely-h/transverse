package CIUP;

public class CIUP {
    public static void main(String[] args) {
        // Étape 1 : Création des objets via FactoryCIUP
        FactoryCIUP.CreationObjets();

        // Étape 2 : Affichage des informations
        System.out.println("Informations sur la CIUP :");
        for (Maison maison : FactoryCIUP.getLesMaisons()) {
            System.out.println(maison);
            System.out.println("Étudiants dans cette maison :");
            maison.afficherEtudiants();
            System.out.println("-----------------------------");
        }
    }
}

