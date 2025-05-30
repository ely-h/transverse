package vueMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author elyssa
 * 
 * Écouteur pour le bouton 'Tout sélectionner' dans la vue d'ajout de maisons.
 * 
 * Cette classe gère l'action de sélection de toutes les maisons disponibles en cochant automatiquement toutes les cases à cocher des panels de sélection.
 */
public class EcouteurToutSelect implements ActionListener {
    
    //-------------------------
    // ATTRIBUTS
    //-------------------------
    
    private List<PanelSelection> selectionPanels;
    
    //-------------------------
    // CONSTRUCTEUR
    //-------------------------
    
    /**
     * Constructeur de l'écouteur 'Tout sélectionner'.
     * 
     * @param selectionPanels La liste des panels de sélection des maisons
     */
    public EcouteurToutSelect(List<PanelSelection> selectionPanels) {
        this.selectionPanels = selectionPanels;
    }
    
    //-------------------------
    // MÉTHODES
    //-------------------------
    
    /**
     * Action déclenchée lors du clic sur le bouton 'Tout sélectionner'.
     * Coche automatiquement toutes les cases à cocher des panels de sélection.
     * 
     * @param e L'événement d'action
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        for (PanelSelection panel : selectionPanels) {
            panel.checkbox.setSelected(true);
        }
    }
}
