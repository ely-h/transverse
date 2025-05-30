package vueMaison;

import modele.Maison;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurSupprimer implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private Maison maison;
    private VueListeMaison vueParent;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    public EcouteurSupprimer(Maison maison, VueListeMaison vueParent) {
        this.maison = maison;
        this.vueParent = vueParent;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    @Override
    public void actionPerformed(ActionEvent e) {
        vueParent.afficherConfirmationSuppression(maison);
    }
}