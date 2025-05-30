package vue;

import javax.swing.*;

import vue.miseEnLienDesPages.PanelChangeListener;

import java.awt.*;

public class blocPanel extends JPanel {

    // Champs privés pour les blocs
    private panelBlockMenu blocResidences;
    private panelBlockMenu blocEtudiants;
    private panelBlockMenu blocRestoU;
    
    private PanelChangeListener listener;

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

    // Getters simples 
    public panelBlockMenu getBlocResidences() {
        return blocResidences;
    }

    public panelBlockMenu getBlocEtudiants() {
        return blocEtudiants;
    }

    public panelBlockMenu getBlocRestoU() {
        return blocRestoU;
    }
}
