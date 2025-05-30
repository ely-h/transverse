package controller.Etudiant.Profil;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.*;

import vue.Etudiant.Edit.Profil.*;
import vue.Etudiant.Profil.Profil;
import modele.Etudiant;

public class ListenerModification implements ActionListener {

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	private EditProfil _paneEdit;
	private PanelEditInfo _panelInfo;
	private JFrame _frameSRC;
	private Etudiant _targetEtu;
	private Profil _profilSRC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerModification(){}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_buttonSRC = (JButton) e.getSource();
		_profilSRC = (Profil) _buttonSRC.getParent().getParent().getParent();
		_frameSRC = (JFrame) _profilSRC.getParent().getParent().getParent().getParent() ;
		_targetEtu = _profilSRC.getEtu();
		
		loadEditProfil();
		closeFrame();
	}	
	
	//---------------
	//METHODE
	//---------------
	private void loadEditProfil() {
		try {
			_paneEdit = new EditProfil(_targetEtu);
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void closeFrame() {
		_frameSRC.getContentPane().removeAll();
		_frameSRC.add(_paneEdit);
		_frameSRC.revalidate();
		_frameSRC.repaint();
	}
	
	//---------------
	//TODO
	//---------------
	/*
	 * Ferme la fenêtre du profil pour ouvrir la version d'édition
	 * 
	 */
	
}
