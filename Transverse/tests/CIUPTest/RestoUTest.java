package CIUPTest;

import modele.Maison;
import modele.MenuRestoUParCategorie;
import modele.Nationnalite;
import modele.Plat;
import modele.RestoU;

public class RestoUTest {

    public RestoUTest() {
        super();
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        testConstructeur_AssocieCorrectementLaMaison();
        testSetSaMaison_ModifieCorrectementLaMaison();
        testAddCategorieRestoU_ListeContientCategorie();
        testConsulterCategoriesDuResto_AfficheToutesLesCategories();
        testConstructeurAvecMaisonNull_DeclencheException();
        testSetSaMaisonAvecNull_DeclencheException();
        System.out.println("Tous les tests de RestoU sont passés.");
    }

    public static void testConstructeur_AssocieCorrectementLaMaison() {
        System.out.println("Test constructeur RestoU :");
        Nationnalite nat = new Nationnalite("Test");
        Maison maison = new Maison("Maison Alpha", nat, 0.0, 0.0, 10);
        RestoU resto = new RestoU(maison);

        assert(resto.getSaMaison() == maison) : "Échec : La maison n'est pas correctement associée au RestoU.";
        System.out.println("testConstructeur_AssocieCorrectementLaMaison passed\n");
    }

    public static void testSetSaMaison_ModifieCorrectementLaMaison() {
        System.out.println("Test setSaMaison :");
        Nationnalite nat = new Nationnalite("Test");
        Maison m1 = new Maison("Maison A", nat, 0.0, 0.0, 10);
        Maison m2 = new Maison("Maison B", nat, 1.0, 1.0, 5);
        RestoU resto = new RestoU(m1);

        resto.setSaMaison(m2);
        assert(resto.getSaMaison() == m2) : "Échec : La maison n’a pas été modifiée correctement.";
        System.out.println("testSetSaMaison_ModifieCorrectementLaMaison passed\n");
    }

    public static void testAddCategorieRestoU_ListeContientCategorie() {
        System.out.println("Test ajout catégorie :");
        Nationnalite nat = new Nationnalite("Test");
        Maison maison = new Maison("Maison Test", nat, 0.0, 0.0, 10);
        RestoU resto = new RestoU(maison);

        Plat plat = new Plat();
        MenuRestoUParCategorie cat = new MenuRestoUParCategorie(plat);

        resto.addCategorieRestoU(cat);
        assert(resto.getSesCategories().contains(cat)) : "Échec : La catégorie n’a pas été ajoutée à la liste.";
        System.out.println("testAddCategorieRestoU_ListeContientCategorie passed\n");
    }

    public static void testConsulterCategoriesDuResto_AfficheToutesLesCategories() {
        System.out.println("Test consultation des catégories : (devrait afficher 2 catégories)");
        Nationnalite nat = new Nationnalite("Test");
        Maison maison = new Maison("Maison Test", nat, 0.0, 0.0, 10);
        RestoU resto = new RestoU(maison);

        Plat plat1 = new Plat();
        Plat plat2 = new Plat();
        MenuRestoUParCategorie cat1 = new MenuRestoUParCategorie(plat1);
        MenuRestoUParCategorie cat2 = new MenuRestoUParCategorie(plat2);
        cat1.setCategorie("Entrées");
        cat2.setCategorie("Desserts");

        resto.addCategorieRestoU(cat1);
        resto.addCategorieRestoU(cat2);
        
        resto.consulterCategoriesDuResto();
        System.out.println("\ntestConsulterCategoriesDuResto_AfficheToutesLesCategories passed\n");
    }
    
    public static void testSetSaMaisonAvecNull_DeclencheException() {
        System.out.println("Test setSaMaison avec null :");
        Nationnalite nat = new Nationnalite("Test");
        Maison maison = new Maison("Maison A", nat, 0.0, 0.0, 10);
        RestoU resto = new RestoU(maison);
        
        try {
            resto.setSaMaison(null);
            System.out.println("ÉCHEC : Aucune exception n’a été levée alors qu’elle était attendue.");
        } catch (IllegalArgumentException e) {
            System.out.println("testSetSaMaisonAvecNull_DeclencheException passed");
        } catch (Exception e) {
            System.out.println("Échec : Mauvais type d’exception : " + e);
        }

        System.out.println();
    }

    public static void testConstructeurAvecMaisonNull_DeclencheException() {
        System.out.println("Test constructeur RestoU avec null :");
        try {
            RestoU resto = new RestoU(null);
            System.out.println("ÉCHEC : Le constructeur n’a pas levé d’exception.");
        } catch (IllegalArgumentException e) {
            System.out.println("testConstructeurAvecMaisonNull_DeclencheException passed");
        } catch (Exception e) {
            System.out.println("Échec : Exception inattendue : " + e);
        }
        System.out.println();
    }

    
}

