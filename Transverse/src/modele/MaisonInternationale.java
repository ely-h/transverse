package modele;
import java.util.*;
import java.io.Serializable;

/**
 * Représente une maison internationale de la CIUP, avec des services spécifiques.
 * Étend la classe Maison de base en ajoutant la gestion des services proposés.
 * 
 * @author hassine
 */
public class MaisonInternationale extends Maison implements Serializable{
	private static final long serialVersionUID = 1L; // Version 1
    
    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Liste des services proposés par la maison internationale */
    private ArrayList<String> servicesProposes = new ArrayList<String>();

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit une maison internationale avec ses caractéristiques de base
     * 
     * @param nom Le nom de la maison
     * @param nationnalite La nationalité (généralement "Internationale")
     * @param longitude Position géographique (longitude)
     * @param lattitude Position géographique (latitude)
     * @param nombreTotalChambres Capacité d'accueil en chambres
     */
    public MaisonInternationale(String nom, Nationnalite nationnalite, 
                              double longitude, double lattitude, 
                              int nombreTotalChambres) {
        super(nom, nationnalite, longitude, lattitude, nombreTotalChambres);
    }

    //--------------------------
    // METHODES
    //--------------------------
    
    /**
     * Ajoute un service à la liste des services proposés
     * 
     * @param service Le nom du service à ajouter
     */
    public void addService(String service) {
        if(service != null && !service.trim().isEmpty()) {
            servicesProposes.add(service);
        }
    }
    
    /**
     * Vérifie si un service particulier est proposé
     * 
     * @param service Le service à vérifier
     * @return true si le service est proposé, false sinon
     */
    public boolean estService(String service) {
        return servicesProposes.contains(service);
    }
    
    /**
     * @return La liste des services proposés
     */
    public ArrayList<String> getServices() {
        return new ArrayList<>(servicesProposes); // Retourne une copie pour protéger l'encapsulation
    }
    
    /**
     * @return Une chaîne formatée listant tous les services
     */
    public String returnServices() {
        StringBuilder sb = new StringBuilder();
        for(String service : this.servicesProposes) {
            sb.append(service).append(", ");
        }
        // Retire la dernière virgule si la liste n'est pas vide
        return sb.length() > 0 ? sb.substring(0, sb.length()-2) : "Aucun service";
    }
    
    /**
     * @return Une représentation textuelle complète de la maison internationale
     */
    @Override
    public String toString() {
        return super.toString() + "\nServices proposés: " + returnServices();
    }
}