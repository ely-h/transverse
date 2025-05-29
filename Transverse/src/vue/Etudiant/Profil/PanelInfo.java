package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

import vue.Etudiant.Component.ComponentInfo;

public class PanelInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private ComponentInfo _pNom;
	private ComponentInfo _pPrenom;
	private ComponentInfo _pMail;
	private ComponentInfo _pAnnee;
	private ComponentInfo _pNationalitee;
	private ComponentInfo _pLogement;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelInfo(String nom, String prenom, String mail, int annee, String nationalite, String logement){
		_pNom = new ComponentInfo("Nom", nom);
		_pPrenom = new ComponentInfo("Prénom", prenom);
		_pMail = new ComponentInfo("Mail", mail);
		_pAnnee = new ComponentInfo("Année Étude", annee);
		_pNationalitee = new ComponentInfo("Nationalite", nationalite);
		_pLogement = new ComponentInfo("Logement", logement);
		
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
