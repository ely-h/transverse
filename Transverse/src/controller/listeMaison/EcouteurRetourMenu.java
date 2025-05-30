package controller.listeMaison;

import vue.vueGestionDeListe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Écouteur pour les boutons "Retour au menu"
 * Gère la navigation de retour vers le menu principal
 * 
 * @author elyssa
 */
public class EcouteurRetourMenu implements ActionListener {
    
    private vueGestionDeListe vueGestion;
    
    /**
     * Constructeur de l'écouteur
     * @param vueGestion La vue de gestion contenant le menu principal
     */
    public EcouteurRetourMenu(vueGestionDeListe vueGestion) {
        this.vueGestion = vueGestion;
    }
    
    /**
     * Action déclenchée lors du clic sur "Retour au menu"
     * Retourne vers la vue du menu principal
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        vueGestion.retournerAuMenu();
    }
}
