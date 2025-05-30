package vue.Etudiant;

import java.io.IOException;

import javax.swing.*;

import modele.FactoryCIUP;
import controller.Etudiant.MainMenu.*;
import controller.Etudiant.BlankProfil.*;
import vue.Etudiant.MiseEnPage.*;
import vue.Etudiant.Liste.*;
import vue.Etudiant.Edit.ProfilVierge.*;

public class Etudiant extends JFrame{

	//---------------
	//ATTRIBUTS
	//---------------
	private Liste _laListe;
	private ProfilVierge _profilVierge;
	private MainPane _panelMain;
	
	private ListenerOpenList _lOListe;
	private ListenerOpenBlankProfil _lOBProfil;
	
	private ListenerCancel _lC;
	private ListenerSave _lS;
	private ListenerPreview _lP;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public Etudiant() throws IOException {
		FactoryCIUP facto = FactoryCIUP.getInstance();
		facto.CreationObjets();
		
		
		_panelMain = new MainPane();
		_laListe = new Liste(facto.getLesMaisons(), facto.getLesEtudiants());
		_profilVierge = new ProfilVierge();
		
		_lOListe = new ListenerOpenList(_laListe, this);
		_lOBProfil = new ListenerOpenBlankProfil(_profilVierge, this);
		
		_panelMain.getCBTListe().addActionListener(_lOListe);
		_panelMain.getCBTEtudiant().addActionListener(_lOBProfil);

		_lS = new ListenerSave(_panelMain, this, facto);
		_profilVierge.getButton0().addActionListener(_lS);
		
		_lP = new ListenerPreview(this);
		_profilVierge.getButton1().addActionListener(_lP);
		
		_lC = new ListenerCancel(_panelMain,this );
		_profilVierge.getButton2().addActionListener(_lC);
		
		
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(_panelMain);
		setVisible(true);
		
		
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		try {
			Etudiant etu = new Etudiant();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//---------------
	//METHODES
	//---------------
	private void initializeListener() {
		
		
	}
}
