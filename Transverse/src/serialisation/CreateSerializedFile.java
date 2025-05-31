package serialisation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modele.Maison;
import modele.MaisonInternationale;
import modele.Nationnalite;

public class CreateSerializedFile {
    public static void main(String[] args) {
        // Crée une nouvelle liste de test avec des objets Maison
        ArrayList<Maison> testList = new ArrayList<>();
        testList.add(new Maison("Maison France", new Nationnalite("Française"), 48, 2, 50));
        testList.add(new Maison("Maison Espagnole", new Nationnalite("Espagnole"), 40, -3, 30));
        testList.add(new Maison("Maison Japon", new Nationnalite("Japonaise"), 35, 139, 40));
        testList.add(new Maison("Maison Tunisie", new Nationnalite("Tunisienne"), 36, 10, 35));
        testList.add(new Maison("Maison Coree", new Nationnalite("Coréenne"), 37, 127, 45));
        testList.add(new MaisonInternationale("Maison Internationale", new Nationnalite("Internationale"), 0, 0, 100));

        // Crée le dossier s'il n'existe pas
        File dossier = new File("data");
        if (!dossier.exists()) {
            if (!dossier.mkdirs()) {
                System.err.println("Échec de la création du dossier 'data'");
                return;
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/liste_maisons.ser"))) {
            oos.writeObject(testList);
            System.out.println("Liste sauvegardée avec succès.");
        } catch (Exception e) {
            System.err.println("Échec de la sauvegarde : " + e.getMessage());
        }
    }
}