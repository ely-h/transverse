package controller.Etudiant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import vue.Etudiant.Liste.ListeEtudiant.PanelLigneEtudiant;
import vue.Etudiant.Profil.Profil;
import modele.Etudiant;

public class ListenerBoutonProfil  implements ActionListener {

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	private PanelLigneEtudiant _pLE;
	
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
		
		_pLE = (PanelLigneEtudiant) _buttonSRC.getParent().getParent();
		
		_pLE.displayProfil();	
	}
	
	
	//---------------
	//METHODE
	//---------------
	
	

}
