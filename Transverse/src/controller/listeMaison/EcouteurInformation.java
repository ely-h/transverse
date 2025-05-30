package controller.listeMaison;

import modele.Maison;
import vue.listeMaison.VueListeMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author elyssa
 * 
 * Écouteur d'événements pour l'affichage des informations d'une maison.
 * Cette classe implémente ActionListener et gère les clics sur le bouton 'Information' d'un PanelMaison. Lorsque l'événement est déclenché elle demande à la vue parent d'afficher les informations détaillées de la maison concernée.
 */
public class EcouteurInformation implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private Maison maison;
    private VueListeMaison vueParent;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     *  Constructeur de l'écouteur d'information.
     * @param maison La maison concernée par l'action d'information
     * @param vueParent vueParent La vue parent qui gère l'affichage des informations
     */
    public EcouteurInformation(Maison maison, VueListeMaison vueParent) {
        this.maison = maison;
        this.vueParent = vueParent;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    /**
     *Méthode appelée le bouton 'Information' est cliqué.
     *Demande à la vue parent d'afficher les informations détaillées de la maison associée à cet écouteur.
     *
     *@param e L'événement ActionEvent déclenché par le clic
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        vueParent.afficherInformations(maison);
    }
}