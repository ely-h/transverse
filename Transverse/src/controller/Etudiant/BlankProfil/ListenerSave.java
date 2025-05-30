package controller.Etudiant.BlankProfil;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.*;

import modele.Etudiant;
import modele.FactoryCIUP;
import vue.Etudiant.Edit.Profil.PanelEditInfo;
import vue.Etudiant.Edit.ProfilVierge.ProfilVierge;
import vue.Etudiant.Profil.Profil;

public class ListenerSave implements ActionListener{
	
	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _buttonSRC;
	private ProfilVierge _panelSRC;
	private PanelEditInfo _panelInfo;
	private JFrame _frameSRC;
	
	private JPanel _paneFerm;
	private FactoryCIUP _facto;
	
	private Etudiant _newEtu;
	private String _nom;
	private String _prenom;
	private String _mail;
	private String _annee;
	private String _nation;
	private String _logment;
	private String _ImgPath;
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerSave (JPanel pane, JFrame frame, FactoryCIUP facto) {
		_paneFerm = pane;
		_frameSRC = frame;
		_facto = facto;
	}
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_buttonSRC = (JButton) e.getSource();
		_panelSRC = (ProfilVierge) _buttonSRC.getParent().getParent().getParent();
		_panelInfo = _panelSRC.getEditInfo();
		_newEtu = _panelSRC.getEtu();
		
		loadString();
		createTempEtu();
		closeFrame();
		
	}
	
	//---------------
	//METHODE
	//---------------
	private void loadString() {
		_nom = _panelInfo.getNom().getTextField().getText();
		_prenom = _panelInfo.getPrenom().getTextField().getText();
		_mail = _panelInfo.getMail().getTextField().getText();
		_annee = _panelInfo.getAnnee().getTextField().getText();
		_nation = _panelInfo.getNationalitee().getTextField().getText();
		_logment = _panelInfo.getLogement().getTextField().getText();
		_ImgPath = _panelInfo.getImgPath().getTextField().getText();
	}
	
	private void createTempEtu() {
		
		if(_ImgPath.equals(""))
			_ImgPath = "img/Etudiants/example.jpg";
		if(_annee.equals(""))
			_annee = "0";
		
		_newEtu = new Etudiant(_nom, _prenom, _mail, Integer.valueOf(_annee), null, _ImgPath);
		
		_facto.getLesEtudiants().add(_newEtu);
		
	}
	
	private void closeFrame() {
		_frameSRC.getContentPane().removeAll();
		_frameSRC.add(_paneFerm);
		_frameSRC.revalidate();
		_frameSRC.repaint();
	}
}
