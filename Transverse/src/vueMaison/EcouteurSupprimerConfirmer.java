package vueMaison;

import modele.FactoryCIUP;
import modele.Maison;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurSupprimerConfirmer implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private Maison maison;
    private VueListeMaison vueParent;
    private JFrame frameParent;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    public EcouteurSupprimerConfirmer(Maison maison, VueListeMaison vueParent, JFrame frameParent) {
        this.maison = maison;
        this.vueParent = vueParent;
        this.frameParent = frameParent;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    @Override
    public void actionPerformed(ActionEvent e) {
        FactoryCIUP factory = FactoryCIUP.getInstance();
        factory.removeMaisonFromListe(maison);
        vueParent.actualiserListe();
        frameParent.dispose();
        JOptionPane.showMessageDialog(vueParent, 
            maison.getNom() + " a été supprimée de la liste.", 
            "Suppression confirmée", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
