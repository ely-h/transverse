package controller.RestoU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import modele.MenuRestoUParCategorie;
import vue.RestoU.VueDUnMenu;

/**
 * Implémentation d'ActionListener pour gérer le changement de menu dans l'interface graphique.
 * Remplace le contenu du panel principal par la vue correspondant au menu sélectionné.
 * 
 * @author hassine
 */
public class EcouteurChangementMenu implements ActionListener {

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** 
     * Panel principal de l'interface qui sera mis à jour 
     */
    protected JPanel panelPrincipal;
    
    /** 
     * Menu à afficher lorsque l'action est déclenchée 
     */
    protected MenuRestoUParCategorie leMenu;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit l'écouteur avec les éléments nécessaires pour la mise à jour de l'interface
     * 
     * @param panel Panel conteneur principal qui sera actualisé
     * @param MenuAAfficher Menu qui sera affiché dans le panel principal
     */
    public EcouteurChangementMenu(JPanel panel, MenuRestoUParCategorie MenuAAfficher) {
        this.panelPrincipal = panel;
        this.leMenu = MenuAAfficher;
    }

    //--------------------------
    // METHODES
    //--------------------------
    
    /**
     * Méthode appelée lors du déclenchement de l'action.
     * Remplace le contenu du panel principal par la vue du menu sélectionné.
     * 
     * @param e Événement d'action contenant la source du déclenchement
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Vérification que la source est bien un JButton et qu'un menu est disponible
        if(e.getSource() instanceof JButton && leMenu != null) {
            // Nettoyage du panel existant
            this.panelPrincipal.removeAll();
            
            // Ajout de la nouvelle vue correspondant au menu sélectionné
            this.panelPrincipal.add(new VueDUnMenu(leMenu));
            
            // Actualisation de l'affichage
            this.panelPrincipal.revalidate();
            this.panelPrincipal.repaint();
        }
    }
}