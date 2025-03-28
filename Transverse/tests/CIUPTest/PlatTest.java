package CIUPTest;

import CIUP.Allergene;
import CIUP.Etiquette;
import CIUP.Plat;

public class PlatTest {
    public static void main(String[] args) {
        testAddAllergenes();
        testAddEtiquettes();
    }
	// Test de l'ajout d'allergènes
    public static void testAddAllergenes() {
        Plat plat = new Plat();
        Allergene gluten = new Allergene("Gluten");
        Allergene lactose = new Allergene("Lactose");
        
        plat.addAllergene(gluten);
        plat.addAllergene(lactose);
        
        System.out.println("Test ajout d'allergènes :");
        assert plat.getAllergenes().size() == 2 : "Échec : Nombre d'allergènes incorrect";
        System.out.println("OUI Nombre d'allergènes correct");
        
        assert plat.getAllergenes().contains(gluten) : "Échec : Allergène 'Gluten' non ajouté";
        System.out.println("OUI Allergène 'Gluten' ajouté");
        
        assert plat.getAllergenes().contains(lactose) : "Échec : Allergène 'Lactose' non ajouté";
        System.out.println("OUI Allergène 'Lactose' ajouté");
        System.out.println();
    }

    // Test de l'ajout d'étiquettes
    public static void testAddEtiquettes() {
        Plat plat = new Plat();
        Etiquette vegan = new Etiquette("Vegan");
        Etiquette sansGlu = new Etiquette("Sans gluten");
        
        plat.addEtiquette(vegan);
        plat.addEtiquette(sansGlu);
        
        System.out.println("Test ajout d'étiquettes :");
        assert plat.getEtiquettes().size() == 2 : "Échec : Nombre d'étiquettes incorrect";
        System.out.println("OUI Nombre d'étiquettes correct");
        
        assert plat.getEtiquettes().contains(vegan) : "Échec : Étiquette 'Vegan' non ajoutée";
        System.out.println("OUI Étiquette 'Vegan' ajoutée");
        
        assert plat.getEtiquettes().contains(sansGlu) : "Échec : Étiquette 'Sans gluten' non ajoutée";
        System.out.println("OUI Étiquette 'Sans gluten' ajoutée");
        System.out.println();
    }
}
