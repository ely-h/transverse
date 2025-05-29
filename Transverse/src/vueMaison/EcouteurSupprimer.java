package vueMaison;

import modele.Maison;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurSupprimer implements ActionListener {
    private Maison maison;
    private VueListeMaison vueParent;
    
    public EcouteurSupprimer(Maison maison, VueListeMaison vueParent) {
        this.maison = maison;
        this.vueParent = vueParent;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        vueParent.afficherConfirmationSuppression(maison);
    }
}