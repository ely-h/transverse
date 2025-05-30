package controller.listeMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.FactoryCIUP;
import modele.Maison;
import vue.listeMaison.VueAjoutMaisonListe;
import vue.listeMaison.VueListeMaison;

/**
 * @author elyssa
 * Écouteur d'événements pour gérer la validation finale de la liste de maisons.
 * Cette classe traite l'ajout effectif des maisons sélectionnées à la liste et propose à l'utilisateur de voir la liste créée ou de retourner à la sélection.
 * 
 */
public class EcouteurValider implements ActionListener {
	
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    /**
     * Liste des maisons sélectionnées à ajouter à la liste principale.
     */
    private List<Maison> maisonsSelectionnees;
    
    /**
     * Référence vers la fenêtre principale de l'application.
     */
    private JFrame fenetre;
	
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     * Constructeur de l'écouteur de validation.
     * 
     * @param maisonsSelectionnees
     * @param fenetre
     */
    public EcouteurValider(List<Maison> maisonsSelectionnees, JFrame fenetre) {
        this.maisonsSelectionnees = maisonsSelectionnees;
        this.fenetre = fenetre;
    }
    
	//-------------------------
	// METHODES
	//-------------------------
    
    /**
     * Méthode appelée lors de l'événement de validation.
     * Ajoute les maisons sélectionnées à la liste principale via FactoryCIUP, affiche un message de confirmation et propose à l'utilisateur de voir la liste créée ou de retourner à la sélection.
     * 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Récupérer l'instance de FactoryCIUP
        FactoryCIUP factory = FactoryCIUP.getInstance();
        
        // Ajouter les maisons sélectionnées à listeMaisons
        for (Maison maison : maisonsSelectionnees) {
            factory.addMaisonToListe(maison);
            System.out.println("Maison ajoutée à la liste : " + maison.getNom());
        }
        
        //message de confirmation
        String message = "Liste créée avec succès !\n" + maisonsSelectionnees.size() + " maison(s) ajoutée(s) à votre liste.";
        
        JOptionPane.showMessageDialog(fenetre, message, "Liste créée", JOptionPane.INFORMATION_MESSAGE);
        
        int reponse = JOptionPane.showConfirmDialog(
                fenetre, 
                message + "\n\n Voulez-vous voir la liste créée ?", "Liste créée", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE
            );
            
            if (reponse == JOptionPane.YES_OPTION) {
                afficherVueListeMaison();
            } else {
                retournerVersSelection();
            }

    }
    /**
     * Affiche la vue de la liste des maisons créée.
     * Remplace le contenu de la fenêtre par VueListeMaison pour permettre à l'utilisateur de consulter sa liste nouvellement créée.
     */
    private void afficherVueListeMaison() {
        fenetre.getContentPane().removeAll();
        fenetre.setTitle("Ma Liste de Maisons");
        
        // Créer et ajouter la vue liste avec référence à la fenêtre parent
        VueListeMaison vueListeMaison = new VueListeMaison(fenetre);
        fenetre.add(vueListeMaison);
        
        fenetre.revalidate();
        fenetre.repaint();
    }
    
    /**
     * Retourne vers la vue de sélection des maisons.
     * Recrée une nouvelle instance de VueAjoutMaisonListe et configure ses écouteurs pour permettre une nouvelle sélection.
     */
    private void retournerVersSelection() {
        // Retourner à la vue de sélection des maisons
        fenetre.getContentPane().removeAll();
        fenetre.setTitle("Calcul Perimètre");
        
        VueAjoutMaisonListe vueAjout = new VueAjoutMaisonListe(fenetre);
        fenetre.add(vueAjout);
        
        EcouteurConfirmation ecouteur = new EcouteurConfirmation(vueAjout, fenetre);
        vueAjout.getBtnConfirm().addActionListener(ecouteur);
        
        fenetre.revalidate();
        fenetre.repaint();
    }
}