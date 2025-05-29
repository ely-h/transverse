package vueMaison;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class EcouteurRetour implements ActionListener {
    private VueAjoutMaisonListe vueAjout;
    private JFrame fenetre;
    
    public EcouteurRetour(VueAjoutMaisonListe vueAjout, JFrame fenetre) {
        this.vueAjout = vueAjout;
        this.fenetre = fenetre;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Remettre la vueAjout dans la fenêtre principale
        fenetre.getContentPane().removeAll();
        fenetre.add(vueAjout);
        fenetre.revalidate();
        fenetre.repaint();
    }
}