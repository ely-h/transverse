package controller.Etudiant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import vue.Etudiant.Liste.ListeEtudiant.PanelLigneEtudiant;

public class ListenerBoutonProfil  implements ActionListener {

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	private PanelLigneEtudiant _pLE;

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
		
		_pLE = (PanelLigneEtudiant) _buttonSRC.getParent().getParent();
		
		_pLE.displayProfil();	
	}
}
