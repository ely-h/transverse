package CIUP;

/*-----------------------------
 * Classe principale représentant la Cité Internationale Universitaire de Paris (CIUP).
 * Gère la création et l'affichage des objets liés à la CIUP, notamment les maisons, les étudiants, les restaurants universitaires et leurs menus.
 *---------------------------*/

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
        // Étape 3 : Affichage des informations sur les RestoU, leurs catégories et plats
        System.out.println("\nInformations sur les RestoU :");
        for (Maison maison : FactoryCIUP.getLesMaisons()) {
            if (maison.getSonRestoU() != null) { // Vérifie si la maison a un RestoU
                RestoU restoU = maison.getSonRestoU();
                System.out.println("\nRestoU de la maison : " + maison.getNom());
                restoU.consulterCategoriesDuResto(); // Affiche les catégories du RestoU

                // Affichage détaillé des plats dans chaque catégorie
                for (MenuRestoUParCategorie categorie : restoU.getSesCategories()) {
                    System.out.println("\nCatégorie : " + categorie.getCategorie());
                    for (Plat plat : categorie.getSesPlats()) {
                        System.out.println("- Plat : " + plat.getNomDuPlat());
                        System.out.println("  Ingrédients : " + plat.getIngredientsDuPlat());
                        System.out.println("  Valeurs nutritionnelles : " + plat.getValeursNutritionnelles());

                        // Affichage des allergènes
                        System.out.print("  Allergènes : ");
                        for (Allergene allergene : plat.getAllergenes()) {
                            System.out.print(allergene.getNom() + ", ");
                        }
                        System.out.println();

                        // Affichage des étiquettes
                        System.out.print("  Étiquettes : ");
                        for (Etiquette etiquette : plat.getEtiquettes()) {
                            System.out.print(etiquette.getNom() + ", ");
                        }
                        System.out.println("\n");
                    }
                }
            } else {
                System.out.println("La maison " + maison.getNom() + " n'a pas de RestoU.");
            }
        }
    }
}

