package vueMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import modele.Maison;

public class EcouteurConfirmation implements ActionListener {
    private VueAjoutMaisonListe vueAjout;
    private JFrame fenetre;
    
    public EcouteurConfirmation(VueAjoutMaisonListe vueAjout, JFrame fenetre) {
        this.vueAjout = vueAjout;
        this.fenetre = fenetre;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        List<Maison> maisonsSelectionnees = getMaisonsSelectionnees();
        
        // Vérifier que au moins une maison est sélectionné
        if (maisonsSelectionnees.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(fenetre, "Veuillez sélectionner au moins une maison.", "Aucune sélection", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        PanelConfirmation panelConfirmation = new PanelConfirmation(maisonsSelectionnees);
        
        EcouteurRetour ecouteurRetour = new EcouteurRetour(vueAjout, fenetre);
        panelConfirmation.getBtnRetour().addActionListener(ecouteurRetour);

        EcouteurValider ecouteurValider = new EcouteurValider(maisonsSelectionnees, fenetre);
        panelConfirmation.getBtnValider().addActionListener(ecouteurValider);
        
        // Remplacer contenu de la fenêtre
        fenetre.getContentPane().removeAll();
        fenetre.add(panelConfirmation);
        fenetre.revalidate();
        fenetre.repaint();
    }
    
    private List<Maison> getMaisonsSelectionnees() {
        List<Maison> maisonsSelectionnees = new ArrayList<>();
        List<PanelSelection> selectionPanels = vueAjout.getSelectionPanels();
        
        for (PanelSelection panel : selectionPanels) {
            if (panel.toutSelection()) {
                maisonsSelectionnees.add(panel.getMaison());
            }
        }
        
        return maisonsSelectionnees;
    }
}