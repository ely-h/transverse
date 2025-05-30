package controller.listeMaison;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author elyssa
 * 
 * Ecouteur d'événements qui permet de gérer l'action d'annulation de la suppression d'une maison dans l'interface graphique.
 * Cette classe implémente ActionListener pour fermer la fenêtre parent lorsque l'utilisateur clique sur un bouton d'annulation
 */
public class EcouteurAnnuler implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    /**
     * Référence vers la fenêtre parent à fermer lors de l'annulation
     */
    private JFrame frameParent;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     * Constructeur de l'éouteur d'annulation
     * @param frameParent
     */
    public EcouteurAnnuler(JFrame frameParent) {
        this.frameParent = frameParent;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    /**
     * Méthode appelée lors du déclenchement de l'événement d'action
     * Ferme la fenêtre parent en appelant la fonction dispose()
     * 
     * @param e l'évenement d'action déclanché par l'utilisateur
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        frameParent.dispose();
    }
}