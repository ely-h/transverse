package controller.listeMaison;

import vue.vueGestionDeListe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Écouteur pour le bouton "Voir la liste"
 * Gère la navigation vers la vue d'affichage de la liste de maisons
 * 
 * @author elyssa
 */
public class EcouteurVoirListe implements ActionListener {
    
    private vueGestionDeListe vueGestion;
    
    /**
     * Constructeur de l'écouteur
     * @param vueGestion La vue de gestion contenant le menu principal
     */
    public EcouteurVoirListe(vueGestionDeListe vueGestion) {
        this.vueGestion = vueGestion;
    }
    
    /**
     * Action déclenchée lors du clic sur "Voir la liste"
     * Navigue vers la vue d'affichage de la liste
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        vueGestion.afficherVueListe();
    }
}