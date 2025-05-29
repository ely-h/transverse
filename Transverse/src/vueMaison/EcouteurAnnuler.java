package vueMaison;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurAnnuler implements ActionListener {
    private JFrame frameParent;
    
    public EcouteurAnnuler(JFrame frameParent) {
        this.frameParent = frameParent;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        frameParent.dispose();
    }
}