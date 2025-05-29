package vueMaison;

import modele.Maison;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurInformation implements ActionListener {
    private Maison maison;
    private VueListeMaison vueParent;
    
    public EcouteurInformation(Maison maison, VueListeMaison vueParent) {
        this.maison = maison;
        this.vueParent = vueParent;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        vueParent.afficherInformations(maison);
    }
}