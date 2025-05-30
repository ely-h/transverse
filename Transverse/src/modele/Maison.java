package modele;
import java.util.*;

/**
 * Représente une maison de la Cité Internationale Universitaire de Paris.
 * Gère les informations sur la maison, ses étudiants et son restaurant universitaire.
 * 
 * @author hassine
 */
public class Maison {
    
    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Restaurant universitaire associé à la maison */
    protected RestoU sonRestoU;
    
    /** Liste des étudiants résidant dans la maison */
    protected ArrayList<Etudiant> sesEtudiants = new ArrayList<Etudiant>();
    
    /** Nationalité principale de la maison */
    protected Nationnalite saNationnalite;
    
    /** Nom de la maison */
    private String nom;
    
    /** Coordonnée géographique - longitude */
    private double longitude;
    
    /** Coordonnée géographique - latitude */
    private double lattitude;
    
    /** Capacité totale en nombre de chambres */
    private int nombreChambres;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit une nouvelle maison avec ses caractéristiques de base
     * 
     * @param nom Le nom de la maison
     * @param nationnalite La nationalité principale de la maison
     * @param longitude Position géographique (longitude)
     * @param lattitude Position géographique (latitude)
     * @param nombreTotalChambres Capacité d'accueil en chambres
     */
    public Maison(String nom, Nationnalite nationnalite, double longitude, 
                 double lattitude, int nombreTotalChambres) {
        this.nom = nom;
        this.saNationnalite = nationnalite;
        this.saNationnalite.AddMaison(this);
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.nombreChambres = nombreTotalChambres;
    }

    //--------------------------
    // METHODES
    //--------------------------
    
    /**
     * Associe un restaurant universitaire à cette maison
     * 
     * @param resto Le restaurant universitaire à associer
     */
    public void addRestoU(RestoU resto) {
        this.sonRestoU = resto;
    }
    
    /**
     * Ajoute un étudiant à la maison si la capacité le permet
     * 
     * @param etudiantAAjouter L'étudiant à ajouter
     * @return true si l'ajout a réussi, false si capacité maximale atteinte
     */
    public boolean addEtudiant(Etudiant etudiantAAjouter) {
        if(nombreChambres - sesEtudiants.size() > 0) {
            sesEtudiants.add(etudiantAAjouter);
            etudiantAAjouter.set_saMaison(this);
            return true;
        } else {
            System.err.println("Capacité maximale d'étudiants atteinte pour " + this.nom);
            return false;
        }
    }

    //--------------------------
    // ACCESSEURS
    //--------------------------
    
    /**
     * @return Le nom de la maison
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return La nationalité principale de la maison
     */
    public Nationnalite getNationalite() {
        return saNationnalite;
    }
    
    /**
     * @return Le restaurant universitaire associé
     */
    public RestoU getSonRestoU() {
        return sonRestoU;
    }

    /**
     * @return La coordonnée de longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @return La coordonnée de latitude
     */
    public double getLattitude() {
        return lattitude;
    }

    /**
     * @return La capacité totale en chambres
     */
    public int getNombreChambres() {
        return nombreChambres;
    }
    
    /**
     * @return Le nombre actuel d'étudiants résidants
     */
    public int getNombreEtudiants() {
        return sesEtudiants.size();
    }

    //--------------------------
    // METHODES D'AFFICHAGE
    //--------------------------
    
    /**
     * Affiche la liste des étudiants de la maison dans la console
     */
    public void afficherEtudiants() {
        System.out.println("Étudiants de " + this.nom + ":");
        for(Etudiant etudiant : sesEtudiants) {
            System.out.println(" - " + etudiant);
        }
    }
    
    /**
     * @return Une représentation textuelle des informations de base de la maison
     */
    @Override
    public String toString() {
        return nom + " (" + saNationnalite.getNom() + ") - " 
             + getNombreEtudiants() + "/" + nombreChambres + " chambres occupées\n"
             + "Coordonnées: longitude=" + longitude + ", latitude=" + lattitude;
    }
}