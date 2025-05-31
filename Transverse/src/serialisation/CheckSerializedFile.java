package serialisation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class CheckSerializedFile {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/liste_maisons.ser"))) {
            ArrayList<?> loadedList = (ArrayList<?>) ois.readObject();
            System.out.println("Liste chargée avec succès. Nombre d'éléments : " + loadedList.size());
            for (Object obj : loadedList) {
                System.out.println(obj.getClass().getName() + ": " + obj);
            }
        } catch (Exception e) {
            System.err.println("Échec du chargement : " + e.getMessage());
            e.printStackTrace();
        }
    }
}