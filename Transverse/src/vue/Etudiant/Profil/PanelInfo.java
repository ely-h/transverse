package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

import vue.Etudiant.Component.CompsInfo;

public class PanelInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private CompsInfo _pNom;
	private CompsInfo _pPrenom;
	private CompsInfo _pMail;
	private CompsInfo _pAnnee;
	private CompsInfo _pNationalitee;
	private CompsInfo _pLogement;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelInfo(String nom, String prenom, String mail, int annee, String nationalite, String logement){
		_pNom = new CompsInfo("Nom", nom);
		_pPrenom = new CompsInfo("Prénom", prenom);
		_pMail = new CompsInfo("Mail", mail);
		_pAnnee = new CompsInfo("Année Étude", annee);
		_pNationalitee = new CompsInfo("Nationalite", nationalite);
		_pLogement = new CompsInfo("Logement", logement);
		
		add(_pNom);
		add(_pPrenom);
		add(_pMail);
		add(_pAnnee);
		add(_pNationalitee);
		add(_pLogement);
		
		setLayout(new GridLayout(6,1));
	}
	
	//---------------
	//METHODE
	//---------------
}
