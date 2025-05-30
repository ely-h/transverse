package controller.RestoU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import modele.MenuRestoUParCategorie;
import vue.RestoU.PanelCategoriesMenuRestoU;
import vue.RestoU.VueDUnMenu;

/**
 * Écouteur pour gérer l'action de retour vers la vue principale des catégories
 * Réinitialise l'affichage pour montrer toutes les catégories de menus disponibles
 * 
 * @author [Ton nom ou équipe]
 * @version 1.0
 */
public class EcouteurRetour implements ActionListener {

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** 
     * Liste des menus disponibles 
     */
    private ArrayList<MenuRestoUParCategorie> lesMenus;
    
    /** 
     * Panel principal à mettre à jour 
     */
    private JPanel lePanel;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit l'écouteur avec les éléments nécessaires
     * 
     * @param p Panel conteneur principal à actualiser
     * @param lesMenus Liste des menus disponibles (peut être null)
     */
    public EcouteurRetour(JPanel p, ArrayList<MenuRestoUParCategorie> lesMenus) {
        this.lesMenus = lesMenus;
        this.lePanel = p;
    }

    //--------------------------
    // MÉTHODES
    //--------------------------
    
    /**
     * Méthode appelée lors du déclenchement de l'action
     * Réinitialise l'affichage pour montrer le panel des catégories
     * 
     * @param e Événement d'action contenant la source du déclenchement
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Nettoyage du panel existant
        lePanel.removeAll();
        
        // Ajout de la vue principale des catégories
        lePanel.add(new PanelCategoriesMenuRestoU());
        
        // Actualisation de l'affichage
        lePanel.revalidate();
        lePanel.repaint();
    }
}