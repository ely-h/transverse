package controller.Etudiant.Edit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import vue.Etudiant.Edit.Profil.*;
import modele.Etudiant;

public class ListenerSave implements ActionListener{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	private EditProfil _panelSRC;
	private PanelEditInfo _panelInfo;
	private Etudiant _targetEtu;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerSave(){
		
	}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_buttonSRC = (JButton) e.getSource();
		_panelSRC = (EditProfil) _buttonSRC.getParent().getParent().getParent();
		
		_panelInfo = _panelSRC.getEditInfo();
		_targetEtu = _panelSRC.getEtu();
		
		String nom = _panelInfo.getNom().getTextField().getText();
		String prenom = _panelInfo.getPrenom().getTextField().getText();
		String mail = _panelInfo.getMail().getTextField().getText();
		String annee = _panelInfo.getAnnee().getTextField().getText();
		String nation = _panelInfo.getNationalitee().getTextField().getText();
		String logment = _panelInfo.getLogement().getTextField().getText();
		
		if (!nom.equals(null)) {
			_targetEtu.set_nom(nom);
		}
		
		if (!prenom.equals(null)) {
			_targetEtu.set_prenom(prenom);
		}
		
		if (!mail.equals(null)) {
			_targetEtu.set_mail(mail);
		}
		
		if (!annee.equals(null)) {
			_targetEtu.set_anneeEtude(Integer.valueOf(annee));
		}
		
		
		
	}
	
	//---------------
	//TODO
	//---------------
	/*
	 * Ferme une fenêtre en sauvegardant les données dans le modèle puis recharge la fenêtre du profil
	 * 
	 */
	
}
