package controller.listeMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import vue.listeMaison.VueAjoutMaisonListe;

/**
 * @author elyssa
 * 
 * Écouteur d'événements pour gérer le retour vers la vue de sélection des maisons.
 * Cette classe permet de revenir à l'étape précédente depuis la vue de confirmation.
 */
public class EcouteurRetour implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
	
    /**
     * Référence vers la vue d'ajout des maisons à réafficher.
     */
    private VueAjoutMaisonListe vueAjout;
    
    /**
     * Référence vers la fenêtre principale de l'application.
     */
    private JFrame fenetre;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    public EcouteurRetour(VueAjoutMaisonListe vueAjout, JFrame fenetre) {
        this.vueAjout = vueAjout;
        this.fenetre = fenetre;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    /**
     * Méthode appelée lors de l'événement de retour.
     * Remplace le contenu actuel de la fenêtre par la vue d'ajout des maisons, permettant à l'utilisateur de modifier sa sélection.
     * 
     * @param e L'événement d'action déclenché par le bouton de retour
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Remettre la vueAjout dans la fenêtre principale
        fenetre.getContentPane().removeAll();
        fenetre.add(vueAjout);
        fenetre.revalidate();
        fenetre.repaint();
    }
}