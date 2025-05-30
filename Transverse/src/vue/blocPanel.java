package vue;

import javax.swing.*;

import vue.miseEnLienDesPages.PanelChangeListener;

import java.awt.*;

/**
 * Panel contenant les blocs de menu pour les différentes sections.
 */
public class blocPanel extends JPanel {

    // Champs privés pour les blocs
    private panelBlockMenu blocResidences;
    private panelBlockMenu blocEtudiants;
    private panelBlockMenu blocRestoU;
    
    private PanelChangeListener listener;
    
    /**
     * Construit le panel contenant les blocs de menu.
     * Initialise les blocs pour Résidences, Étudiants et Resto U.
     */
    public blocPanel(PanelChangeListener listener) {
    	this.listener=listener;

        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 60));
        setBackground(Color.WHITE);

        // Création des blocs
        blocResidences = new panelBlockMenu("Résidences");
        blocEtudiants = new panelBlockMenu("Étudiants");
        blocRestoU = new panelBlockMenu("Resto U");

        // Ajout des blocs au panel
        add(blocResidences);
        add(blocEtudiants);
        add(blocRestoU);
        
        blocResidences.getBouton().addActionListener(e -> /*équilavent de @Override
        public void actionPerformed(ActionEvent e) */{
        	listener.changeVers("Residences");
        });
//        blocEtudiants.getBouton().addActionListener(e ->{
//        	listener.changeVers("Etudiants");
//        });
        blocRestoU.getBouton().addActionListener(e ->{
        	listener.changeVers("RestoU");
        });
    }

    /**
     * @return Le bloc des résidences
     */
    // Getters simples 
    public panelBlockMenu getBlocResidences() {
        return blocResidences;
    }
   
    /**
     * @return Le bloc des étudiants
     */

    public panelBlockMenu getBlocEtudiants() {
        return blocEtudiants;
    }
    
    /**
     * @return Le bloc du resto U
     */

    public panelBlockMenu getBlocRestoU() {
        return blocRestoU;
    }
}
