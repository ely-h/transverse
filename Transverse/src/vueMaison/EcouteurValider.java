package vueMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modele.FactoryCIUP;
import modele.Maison;

public class EcouteurValider implements ActionListener {
    private List<Maison> maisonsSelectionnees;
    private JFrame fenetre;
    
    public EcouteurValider(List<Maison> maisonsSelectionnees, JFrame fenetre) {
        this.maisonsSelectionnees = maisonsSelectionnees;
        this.fenetre = fenetre;
    }
    
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

    }
}