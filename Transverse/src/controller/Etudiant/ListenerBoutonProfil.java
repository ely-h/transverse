package controller.Etudiant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;

public class ListenerBoutonProfil  implements ActionListener {

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerBoutonProfil(){
		
	}
	
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_buttonSRC = (JButton) e.getSource();
		
		_buttonSRC.getParent();
		
	}
	
	
	//---------------
	//METHODE
	//---------------
	
	

}
