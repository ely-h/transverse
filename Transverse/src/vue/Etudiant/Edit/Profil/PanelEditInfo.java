package vue.Etudiant.Edit.Profil;

import java.awt.GridLayout;
import javax.swing.*;

import vue.Etudiant.Component.*;

public class PanelEditInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private ComponentTextField _pNom;
	private ComponentTextField _pPrenom;
	private ComponentTextField _pMail;
	private ComponentTextField _pAnnee;
	private ComponentTextField _pNationalitee;
	private ComponentTextField _pLogement;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelEditInfo(){
		_pNom = new ComponentTextField("Nom :");
		_pPrenom = new ComponentTextField("Prénom :");
		_pMail = new ComponentTextField("Mail :");
		_pAnnee = new ComponentTextField("Année Étude :");
		_pNationalitee = new ComponentTextField("Nationalitée :");
		_pLogement = new ComponentTextField("Logement :");
		
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
