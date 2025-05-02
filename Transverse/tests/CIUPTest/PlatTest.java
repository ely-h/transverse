package CIUPTest;

import modele.Allergene;
import modele.Etiquette;
import modele.Plat;

public class PlatTest {
    public static void main(String[] args) {
    	testAddAllergenes_ListeContientAllergenes();
        testAddEtiquette_ListeContientEtiquettes();
        System.out.println("Les tests sont passés");
    }
	// Test de l'ajout d'allergènes
    public static void testAddAllergenes_ListeContientAllergenes() {
        Plat plat = new Plat();
        Allergene gluten = new Allergene("Gluten");
        Allergene lactose = new Allergene("Lactose");
        Allergene test = new Allergene("Test");
        
        plat.addAllergene(gluten);
        plat.addAllergene(lactose);
        
        System.out.println("Test ajout d'allergènes :");
        assert(plat.getAllergenes().size() == 2)  : "Nombre d'allergènes incorrect, not passed"; 
        assert(plat.getAllergenes().contains(gluten)) : "Échec : Allergène 'Gluten' non ajouté";
        assert(plat.getAllergenes().contains(lactose)) : "Échec : Allergène 'Lactose' non ajouté";
        System.out.print("testAddAllergenes_ListeContientAllergenes test passed");
        //assert(plat.getAllergenes().contains(test)) : "Échec : Allergène 'Lactose' non ajouté";
        System.out.println();


    }

    // Test de l'ajout d'étiquettes
    public static void testAddEtiquette_ListeContientEtiquettes() {
        Plat plat = new Plat();
        Etiquette vegan = new Etiquette("Vegan");
        Etiquette sansGlu = new Etiquette("Sans gluten");
        
        plat.addEtiquette(vegan);
        plat.addEtiquette(sansGlu);
        
        System.out.println("Test ajout d'étiquettes :");
        assert(plat.getEtiquettes().size() == 2) : "Échec : Nombre d'étiquettes incorrect"; 
        assert(plat.getEtiquettes().contains(vegan)) : "Échec : Étiquette 'Vegan' non ajoutée";
        assert(plat.getEtiquettes().contains(sansGlu)) : "Échec : Étiquette 'Sans gluten' non ajoutée";
        System.out.println("testAddEtiquette_ListeContientEtiquettes passed");
    }
}
