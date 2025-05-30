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
	private JFrame _frameSRC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerOpenBlankProfil(ProfilVierge profil, JFrame frame){
		
		_blankProfil = profil;
		_frameSRC = (Etudiant) frame;
	}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_frameSRC.getContentPane().removeAll();
		_frameSRC.add(_blankProfil);
		_frameSRC.revalidate();
		_frameSRC.repaint();
	}
}
