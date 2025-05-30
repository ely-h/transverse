package vue.Etudiant.Edit.Profil;

import java.awt.GridLayout;
import javax.swing.*;

import vue.Etudiant.Component.*;

public class PanelEditInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private CompsTextField _pNom;
	private CompsTextField _pPrenom;
	private CompsTextField _pMail;
	private CompsTextField _pAnnee;
	private CompsTextField _pNationalitee;
	private CompsTextField _pLogement;
	private CompsTextField _pImgPath;
	
	//---------------
	//GETTERS
	//---------------
	public CompsTextField getNom() {return _pNom;}
	public CompsTextField getPrenom() {return _pPrenom;}
	public CompsTextField getMail() {return _pMail;}
	public CompsTextField getAnnee() {return _pAnnee;}
	public CompsTextField getNationalitee() {return _pNationalitee;}
	public CompsTextField getLogement() {return _pLogement;}
	public CompsTextField getImgPath() {return _pImgPath;}

	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelEditInfo(){
		_pNom = new CompsTextField("Nom :");
		_pPrenom = new CompsTextField("Prénom :");
		_pMail = new CompsTextField("Mail :");
		_pAnnee = new CompsTextField("Année Étude :");
		_pNationalitee = new CompsTextField("Nationalitée :");
		_pLogement = new CompsTextField("Logement :");
		_pImgPath = new CompsTextField("imgPath :");
		
		add(_pNom);
		add(_pPrenom);
		add(_pMail);
		add(_pAnnee);
		add(_pNationalitee);
		add(_pLogement);
		add(_pImgPath);
		
		setLayout(new GridLayout(7,1, 4,4));
	}
}
