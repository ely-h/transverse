package CIUPTest;

import CIUP.*;

public class MaisonInternationaleTest {
	
	public static void AllTest_MaisonInternationale(String arg[]) {
		testAddService();
		
		System.out.println("All tests passed.");
	}
	
	//Test l'ajout de service
	public static void testAddService() {
		Nationnalite nation = new Nationnalite("nation");
		MaisonInternationale testMI = new MaisonInternationale("", nation, 14.00, 14.00, 15);
		
		testMI.addService("Menage");
		
		System.out.println("Test ajout de service :");
		
		assert testMI.getServicesProposes().size() == 1 : "NOT OK - Nombre de service incorrect";
		System.out.println("OK - Nombre de service correcte");
		
		assert testMI.estService("Menage");
		System.out.println("OK - Service ajouté");
	}
	
	
}
