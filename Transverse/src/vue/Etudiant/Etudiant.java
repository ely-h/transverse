package vue.Etudiant;

import java.io.IOException;

import javax.swing.*;

import modele.FactoryCIUP;
import controller.Etudiant.MainMenu.*;
import controller.Etudiant.BlankProfil.*;
import vue.Etudiant.MiseEnPage.*;
import vue.miseEnLienDesPages.PanelChangeListener;
import vue.Etudiant.Liste.*;
import vue.Etudiant.Edit.ProfilVierge.*;

public class Etudiant extends JPanel{

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
	public Etudiant(JPanel lePanel) throws IOException {
		FactoryCIUP facto = FactoryCIUP.getInstance();
		facto.CreationObjets();
		
		
		_panelMain = new MainPane();
		_laListe = new Liste(facto.getLesMaisons(), facto.getLesEtudiants());
		_profilVierge = new ProfilVierge();
		
		_lOListe = new ListenerOpenList(_laListe, lePanel);
		_lOBProfil = new ListenerOpenBlankProfil(_profilVierge, lePanel);
		
		_panelMain.getCBTListe().addActionListener(_lOListe);
		_panelMain.getCBTEtudiant().addActionListener(_lOBProfil);

		_lS = new ListenerSave(_panelMain, lePanel, facto);
		_profilVierge.getButton0().addActionListener(_lS);
		
		_lP = new ListenerPreview(lePanel);
		_profilVierge.getButton1().addActionListener(_lP);
		
		_lC = new ListenerCancel(_panelMain,lePanel );
		_profilVierge.getButton2().addActionListener(_lC);
		
		this.add(_panelMain);
		
		
		
		
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
//		try {
//			JFrame test = new JFrame();
//			Etudiant etu = new Etudiant(test);
//			test.add(etu);
//			test.setSize(800, 600);
//	        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	        test.setVisible(true);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	//---------------
	//METHODES
	//---------------
	private void initializeListener() {
		
		
	}
}
