package vueMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.FactoryCIUP;
import modele.Maison;

public class EcouteurValider implements ActionListener {
	
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private List<Maison> maisonsSelectionnees;
    private JFrame fenetre;
	
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    public EcouteurValider(List<Maison> maisonsSelectionnees, JFrame fenetre) {
        this.maisonsSelectionnees = maisonsSelectionnees;
        this.fenetre = fenetre;
    }
    
	//-------------------------
	// METHODES
	//-------------------------
    
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
    private void afficherVueListeMaison() {
        fenetre.getContentPane().removeAll();
        fenetre.setTitle("Ma Liste de Maisons");
        
        // Créer et ajouter la vue liste avec référence à la fenêtre parent
        VueListeMaison vueListeMaison = new VueListeMaison(fenetre);
        fenetre.add(vueListeMaison);
        
        fenetre.revalidate();
        fenetre.repaint();
    }
    
    private void retournerVersSelection() {
        // Retourner à la vue de sélection des maisons
        fenetre.getContentPane().removeAll();
        fenetre.setTitle("Calcul Perimètre");
        
        VueAjoutMaisonListe vueAjout = new VueAjoutMaisonListe();
        fenetre.add(vueAjout);
        
        EcouteurConfirmation ecouteur = new EcouteurConfirmation(vueAjout, fenetre);
        vueAjout.getBtnConfirm().addActionListener(ecouteur);
        
        fenetre.revalidate();
        fenetre.repaint();
    }
}