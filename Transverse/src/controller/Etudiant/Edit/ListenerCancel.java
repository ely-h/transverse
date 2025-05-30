package controller.Etudiant.Edit;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.*;

import vue.Etudiant.Edit.Profil.*;
import vue.Etudiant.Profil.Profil;
import modele.Etudiant;

public class ListenerCancel implements ActionListener{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	private EditProfil _panelSRC;
	private PanelEditInfo _panelInfo;
	private JFrame _frameSRC;
	private Etudiant _targetEtu;
	private Profil _profil;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerCancel(){}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_buttonSRC = (JButton) e.getSource();
		_panelSRC = (EditProfil) _buttonSRC.getParent().getParent().getParent().getParent();
		_frameSRC = (JFrame) _panelSRC.getParent().getParent().getParent().getParent() ;
		_panelInfo = _panelSRC.getEditInfo();
		_targetEtu = _panelSRC.getEtu();
		
		loadProfil();
		closeFrame();
	}
	
	//---------------
	//METHODES
	//---------------
	private void loadProfil() {
		try {
			_profil = new Profil(_targetEtu);
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void closeFrame() {
		_frameSRC.getContentPane().removeAll();
		_frameSRC.add(_profil);
		_frameSRC.revalidate();
		_frameSRC.repaint();
	}
}
