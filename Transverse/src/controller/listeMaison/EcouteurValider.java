package controller.listeMaison;
import vue.vueGestionDeListe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.FactoryCIUP;
import modele.Maison;
import vue.listeMaison.VueAjoutMaisonListe;
import vue.listeMaison.VueListeMaison;
import vue.ApplicationCIUP;

/**
 * @author elyssa
 * Écouteur d'événements pour gérer la validation finale de la liste de maisons.
 * Cette classe traite l'ajout effectif des maisons sélectionnées à la liste et propose à l'utilisateur de voir la liste créée ou de retourner à la sélection.
 * 
 */
public class EcouteurValider implements ActionListener {
	
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    /**
     * Liste des maisons sélectionnées à ajouter à la liste principale.
     */
    private List<Maison> maisonsSelectionnees;
    
    /**
     * Référence vers la fenêtre principale de l'application.
     */
    private JFrame fenetre;
	
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     * Constructeur de l'écouteur de validation.
     * 
     * @param maisonsSelectionnees
     * @param fenetre
     */
    public EcouteurValider(List<Maison> maisonsSelectionnees, JFrame fenetre) {
        this.maisonsSelectionnees = maisonsSelectionnees;
        this.fenetre = fenetre;
    }
    
	//-------------------------
	// METHODES
	//-------------------------
    
    /**
     * Méthode appelée lors de l'événement de validation.
     * Ajoute les maisons sélectionnées à la liste principale via FactoryCIUP, affiche un message de confirmation et propose à l'utilisateur de voir la liste créée ou de retourner à la sélection.
     * 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        FactoryCIUP factory = FactoryCIUP.getInstance();
        
        for (Maison maison : maisonsSelectionnees) {
            factory.addMaisonToListe(maison);
            System.out.println("Maison ajoutée à la liste : " + maison.getNom());
        }
        factory.sauvegarderListeMaisons();

        String message = "Liste créée avec succès !\n" + maisonsSelectionnees.size() + " maison(s) ajoutée(s) à votre liste.";
        
        JOptionPane.showMessageDialog(fenetre, message, "Liste créée", JOptionPane.INFORMATION_MESSAGE);

        retournerAuMenuPrincipal();
    }
    /**
     * Retourne au menu principal de gestion de liste.
     * Remplace le contenu de la fenêtre par vueGestionDeListe pour permettre à l'utilisateur 
     * de naviguer vers d'autres fonctionnalités.
     */
    private void retournerAuMenuPrincipal() {
    	if (fenetre instanceof ApplicationCIUP) {
            ApplicationCIUP app = (ApplicationCIUP) fenetre;
            app.changeVers("Residences"); // Retour à la vue gestion de liste
        } else {
            fenetre.getContentPane().removeAll();
            vueGestionDeListe vueGestion = new vueGestionDeListe(fenetre);
            fenetre.add(vueGestion);
            fenetre.revalidate();
            fenetre.repaint();
        }
    }

}