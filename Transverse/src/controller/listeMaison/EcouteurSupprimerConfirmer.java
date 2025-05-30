package controller.listeMaison;

import modele.FactoryCIUP;
import modele.Maison;
import vue.listeMaison.VueListeMaison;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author elyssa
 * Écouteur d'événements pour la confirmation de suppression d'une maison.
 * Cette classe implémente ActionListener et gère la confirmation définitive de suppression d'une maison de la liste. Elle effectue les actions suivantes :
 *   -Supprime la maison de la liste via FactoryCIUP
 *   -Actualise l'affichage de la liste
 *   -Ferme la boîte de dialogue de confirmation
 *   -Affiche un message de confirmation à l'utilisateur
 */
public class EcouteurSupprimerConfirmer implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private Maison maison;
    private VueListeMaison vueParent;
    private JFrame frameParent;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     * Constructeur de l'écouteur de confirmation de suppression.
     * 
     * @param maison La maison à supprimer de la liste
     * @param vueParent La vue parent qui gère l'affichage de la liste
     * @param frameParent La fenêtre de confirmation à fermer
     */
    public EcouteurSupprimerConfirmer(Maison maison, VueListeMaison vueParent, JFrame frameParent) {
        this.maison = maison;
        this.vueParent = vueParent;
        this.frameParent = frameParent;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    /**
     * Méthode appelée lors de la confirmation de suppression.
     * Effectue la suppression définitive de la maison en plusieurs étapes :
     *   -Supprime la maison de la liste via FactoryCIUP
     *   -Actualise l'affichage de la liste des maisons
     *   -Ferme la boîte de dialogue de confirmation
     *   -Affiche un message informant de la suppression réussie
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        FactoryCIUP factory = FactoryCIUP.getInstance();
        factory.removeMaisonFromListe(maison);
        vueParent.actualiserListe();
        frameParent.dispose();
        JOptionPane.showMessageDialog(vueParent, 
            maison.getNom() + " a été supprimée de la liste.", 
            "Suppression confirmée", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
