package controller.listeMaison;

import vue.vueGestionDeListe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Écouteur pour le bouton "Créer une liste"
 * Gère la navigation vers la vue de création de liste de maisons
 * 
 * @author elyssa
 */
public class EcouteurCreation implements ActionListener {
    
    private vueGestionDeListe vueGestion;
    
    /**
     * Constructeur de l'écouteur
     * @param vueGestion La vue de gestion contenant le menu principal
     */
    public EcouteurCreation(vueGestionDeListe vueGestion) {
        this.vueGestion = vueGestion;
    }
    
    /**
     * Action déclenchée lors du clic sur "Créer une liste"
     * Navigue vers la vue de création de liste
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        vueGestion.afficherVueCreation();
    }
}