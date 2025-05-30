package vueMaison;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurAnnuler implements ActionListener {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private JFrame frameParent;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    public EcouteurAnnuler(JFrame frameParent) {
        this.frameParent = frameParent;
    }
    
	//-------------------------
	// METHODE
	//-------------------------
    
    @Override
    public void actionPerformed(ActionEvent e) {
        frameParent.dispose();
    }
}