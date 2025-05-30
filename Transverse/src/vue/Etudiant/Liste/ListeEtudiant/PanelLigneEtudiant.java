package vue.Etudiant.Liste.ListeEtudiant;

import javax.swing.*;
import java.awt.GridLayout;
import java.io.IOException;

import controller.Etudiant.Liste.ListenerBoutonProfil;
import modele.Etudiant;
import vue.Etudiant.Profil.Profil;
import vue.Etudiant.Component.*;

public class PanelLigneEtudiant extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private CompsButton _button;
	private CompsInfo _nom;
	private CompsInfo _prenom;
	private CompsInfo _pays;
	private CompsInfo _annee;
	private ListenerBoutonProfil _lbp;
	private Etudiant _etudiant;
	private Profil _profil;
	
	//---------------
	//ACCESSEUR
	//---------------
	public Etudiant getEtudiant() {return _etudiant;}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelLigneEtudiant(Etudiant e0) throws IOException{
		_button = new CompsButton("Profil");
		_nom = new CompsInfo(e0.get_nom());
		_prenom = new CompsInfo(e0.get_prenom());
		_pays = new CompsInfo(e0.get_saNationnalite().getNom());
		_annee = new CompsInfo(e0.get_anneeEtude());
		_etudiant = e0;
		_profil = new Profil(e0);
		
		_lbp = new ListenerBoutonProfil();
		 
		 _button.getButton().addActionListener(_lbp);
		 
		add(_button);
		add(_nom);
		add(_prenom);
		add(_pays);
		add(_annee);
		
		setLayout(new GridLayout(1,6));
	}
	
	//---------------
	//METHODE
	//---------------
	public void displayProfil() {
		_profil.openProfil();
	}
}
