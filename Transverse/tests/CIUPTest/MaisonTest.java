package CIUPTest;

import modele.*;

public class MaisonTest {
	
	final static int NB_CHAMBRE = 5;

	public static void main(String arg[]) {
		testAddRestoU();
		testAddEtudiant_UnSeulEtudiant();
		testAddEtudiant_NombreMaximum();
		
		System.out.println("All test passed");
	}

	
	public static void testAddRestoU() {
		Nationnalite nation = new Nationnalite("nation");
		Maison testM = new Maison("testM", nation, 14.00, 14.00, NB_CHAMBRE);
		RestoU restoU = new RestoU(testM);
		
		testM.addRestoU(restoU);
		
		System.out.println("Test ajout RestoU : ");
		assert testM.getSonRestoU() != null : "NOT OK - RestoU non ajouté";
		System.out.println("OK - RestoU ajouté");
	}
	
	public static void testAddEtudiant_NombreMaximum() {
		Nationnalite nation = new Nationnalite("nation");
		Maison testM = new Maison("testM", nation, 14.00, 14.00, NB_CHAMBRE);
		Etudiant etu = new Etudiant("John", "Smith","john.smith@mail.com", 1, nation);
		
		for (int i = 0; i < NB_CHAMBRE; i++) {
			testM.addEtudiant(etu);
		}
		
		System.out.println("Test - ajout maximum d etudiant : ");
		assert testM.getNombreEtudiants() == testM.getNombreChambres() : "NOT OK - Nombre maximum non atteint";
		System.out.println("OK - Nombre maximum atteint");
	}
	
	public static void testAddEtudiant_UnSeulEtudiant() {
		Nationnalite nation = new Nationnalite("nation");
		Maison testM = new Maison("testM", nation, 14.00, 14.00, NB_CHAMBRE);
		Etudiant etu = new Etudiant("John", "Smith","john.smith@mail.com", 1, nation);
		
		testM.addEtudiant(etu);
		
		System.out.println("Test - ajout un seul etudiant : ");
		assert testM.getNombreEtudiants() == 1 : "NOT OK - Nombre d etudiant incorrect";
		System.out.println("OK - Un seul etudiant ajoute");
	}
}
