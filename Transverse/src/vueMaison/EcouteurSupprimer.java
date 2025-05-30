package vueMaison;

import modele.Maison;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author elyssa
 * Écouteur d'événements pour la demande de suppression d'une maison.
 * Cette classe implémente ActionListener et gère les clics sur le bouton 'Supprimer' d'un PanelMaison. Lorsque l'événement est déclenché, elle demande à la vue parent d'afficher une boîte de dialogue de confirmation avant suppression.
 * 
 * Cet écouteur ne supprime pas directement la maison, il ne fait que demander la confirmation à l'utilisateur via la vue parent.
 */
public class EcouteurSupprimer implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private Maison maison;
    private VueListeMaison vueParent;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     * Constructeur de l'écouteur de suppression.
     * 
     * @param maison La maison concernée par la demande de suppression
     * @param vueParent La vue parent qui gère l'affichage de la confirmation
     */
    public EcouteurSupprimer(Maison maison, VueListeMaison vueParent) {
        this.maison = maison;
        this.vueParent = vueParent;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    /** Méthode appelée lors du clic sur le bouton "Supprimer".
     * 
     * Demande à la vue parent d'afficher une boîte de dialogue de confirmation pour la suppression de la maison associée à cet écouteur.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        vueParent.afficherConfirmationSuppression(maison);
    }
}