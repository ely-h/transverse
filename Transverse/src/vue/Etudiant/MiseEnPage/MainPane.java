package vue.Etudiant.MiseEnPage;

import java.io.IOException;
import java.awt.GridLayout;
import javax.swing.*;

import modele.FactoryCIUP;
import vue.Etudiant.Liste.*;
import vue.Etudiant.Edit.ProfilVierge.*;
import vue.Etudiant.Component.*;

public class MainPane extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private Liste _laListe;
	private ProfilVierge _profilVierge;
	private CompsButtonTitle _cbtListe;
	private CompsButtonTitle _cbtEtu;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public MainPane() {
		try {	
			FactoryCIUP facto = FactoryCIUP.getInstance();
			facto.CreationObjets();
			_laListe = new Liste(facto.getLesMaisons(), facto.getLesEtudiants());
			_profilVierge = new ProfilVierge();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		_cbtEtu = new CompsButtonTitle("Ajouter Etudiant", "Ajouter");
		_cbtListe = new CompsButtonTitle("Liste des étudiants", "voir");
		
		add(_cbtEtu);
		add(_cbtListe);
		
		setLayout(new GridLayout(1,2,4,4));
		
		
	}
	
	
	//---------------
	//MAIN
	//---------------

	
	//---------------
	//TO DO
	//---------------
	/* La classe contiendra une méthode qui devra pouvoir être appelé
	 * pour ouvrir une Jframe qui sera l'entièreté de la liste d'étudiant.
	 * 
	 * 
	 */
	
}
