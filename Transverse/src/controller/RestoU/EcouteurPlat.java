package controller.RestoU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modele.Plat;
import vue.RestoU.VueDetailsPlat;

/**
 * Écouteur pour gérer l'affichage des détails d'un plat
 * Ouvre une nouvelle fenêtre présentant les informations détaillées du plat sélectionné
 * 
 * @author hassine
 */
public class EcouteurPlat implements ActionListener {

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /**
     * Le plat dont on doit afficher les détails
     */
    private Plat plat;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit l'écouteur avec le plat à afficher
     * 
     * @param plat Le plat dont on veut voir les détails (ne doit pas être null)
     * @throws NullPointerException si le plat est null
     */
    public EcouteurPlat(Plat plat) {
        this.plat = plat;
    }

    //--------------------------
    // MÉTHODES
    //--------------------------
    
    /**
     * Méthode appelée lors du clic sur le bouton
     * Ouvre une nouvelle fenêtre centrée contenant les détails du plat
     * 
     * @param e L'événement de clic contenant la source du déclenchement
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            // Création de la fenêtre
            JFrame fenetre = new JFrame(plat.getNomDuPlat());
            fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Modifié pour fermer seulement cette fenêtre
            fenetre.setLocationRelativeTo((JButton)e.getSource());
            fenetre.setSize(400, 300);
            
            // Ajout du panel de détails
            fenetre.add(new VueDetailsPlat(plat));
            
            // Affichage
            fenetre.setVisible(true);
        }
    }
}