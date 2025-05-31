package controller.Etudiant.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import vue.Etudiant.Etudiant;
import vue.Etudiant.Edit.ProfilVierge.*;

public class ListenerOpenBlankProfil implements ActionListener {

	//---------------
	//ATTRIBUTS
	//---------------
	private ProfilVierge _blankProfil;
	private JPanel _panelSRC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerOpenBlankProfil(ProfilVierge profil, JPanel panel){
		
		_blankProfil = profil;
		_panelSRC = (JPanel) panel;
	}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_panelSRC.removeAll();
		_panelSRC.add(_blankProfil);
		_panelSRC.revalidate();
		_panelSRC.repaint();
	}
}
