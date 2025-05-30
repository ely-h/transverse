package controller.RestoU;
import vue.RestoU.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class EcouteurComboBox implements ActionListener{

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	private VueDUnMenu vue;

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	public EcouteurComboBox(VueDUnMenu vue) {
		this.vue=vue;
	}

	//--------------------------
	// MÉTHODES
	//--------------------------

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JComboBox) {
			JComboBox box=(JComboBox)e.getSource();
			vue.FiltrerPar((String)box.getSelectedItem());
		}
		
	}

}
