package controller.Etudiant.Edit;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.*;

import vue.Etudiant.Edit.Profil.*;
import vue.Etudiant.Profil.Profil;
import modele.Etudiant;

public class ListenerSave implements ActionListener{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	private EditProfil _panelSRC;
	private PanelEditInfo _panelInfo;
	private JFrame _frameSRC;
	private Etudiant _targetEtu;
	private Profil _profil;
	private String _nom;
	private String _prenom;
	private String _mail;
	private String _annee;
	private String _nation;
	private String _logment;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerSave(){}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_buttonSRC = (JButton) e.getSource();
		_panelSRC = (EditProfil) _buttonSRC.getParent().getParent().getParent().getParent();
		_frameSRC = (JFrame) _panelSRC.getParent().getParent().getParent().getParent() ;
		_panelInfo = _panelSRC.getEditInfo();
		_targetEtu = _panelSRC.getEtu();
		
		loadString();
		updateEtuData();
		loadUpdateProfil();
		closeFrame();
	}
	
	//---------------
	//METHODES
	//---------------
	private void loadString() {
		_nom = _panelInfo.getNom().getTextField().getText();
		_prenom = _panelInfo.getPrenom().getTextField().getText();
		_mail = _panelInfo.getMail().getTextField().getText();
		_annee = _panelInfo.getAnnee().getTextField().getText();
		_nation = _panelInfo.getNationalitee().getTextField().getText();
		_logment = _panelInfo.getLogement().getTextField().getText();
	}
	
	private void updateEtuData() {
		if (!_nom.equals("")) {
			_targetEtu.set_nom(_nom);
		}
		
		if (!_prenom.equals("")) {
			_targetEtu.set_prenom(_prenom);
		}
		
		if (!_mail.equals("")) {
			_targetEtu.set_mail(_mail);
		}
		
		if (!_annee.equals("")) {
			_targetEtu.set_anneeEtude(Integer.valueOf(_annee));
		}
	}
	
	private void loadUpdateProfil() {
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
	
	//---------------
	//TODO
	//---------------
	/*
	 * Ferme une fenêtre en sauvegardant les données dans le modèle puis recharge la fenêtre du profil
	 * 
	 */
	
}
