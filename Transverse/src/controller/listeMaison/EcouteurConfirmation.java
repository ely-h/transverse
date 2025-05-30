package controller.listeMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import modele.Maison;
import vue.listeMaison.PanelConfirmation;
import vue.listeMaison.PanelSelection;
import vue.listeMaison.VueAjoutMaisonListe;

/**
 * @author elyssa
 * 
 * Écouteur d'événements pour gérer la confirmation de sélection des maisons.
 * Cette classe traite la transition entre la vue de sélection des maisons et la vue de confirmation, en vérifiant qu'au moins une maison est sélectionnée.
 */
public class EcouteurConfirmation implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    /**
     * Référence vers la vue d'ajout des maisons pour récupérer les sélections.
     */
    private VueAjoutMaisonListe vueAjout;
    private JFrame fenetre;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     * Constructeur de l'écouteur de confirmation.
     * 
     * @param vueAjout La vue d'ajout des maisons contenant les sélections
     * @param fenetre La fenêtre principale de l'application
     */
    public EcouteurConfirmation(VueAjoutMaisonListe vueAjout, JFrame fenetre) {
        this.vueAjout = vueAjout;
        this.fenetre = fenetre;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    /**
     * Méthode appelée lors de l'événement de confirmation.
     * Verifie qu'au moins une maison est sélectionnée, puis affiche le panel de confirmation avec les maisons sélectionnées.
     * Si aucune maison n'est sélectionnée elle affiche un message d'avertissement.
     * 
     * @param e L'événement d'action déclenché par le bouton de confirmation
     */
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
    
	//-------------------------
	// GETTER
	//-------------------------
    
    /**
     * Récupère la liste des maisons sélectionnées à partir des panels de sélection.
     * Parcours tous les panels de sélection et ajoute les maisons cochées à la liste.
     * 
     * @return Une liste contenant toutes les maisons sélectionnées par l'utilisateur
     */
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