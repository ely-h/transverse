package vue.Etudiant.Edit.ProfilVierge;

import modele.Etudiant;
import modele.FactoryCIUP;
import vue.Etudiant.Edit.Profil.EditProfil;
import vue.Etudiant.Edit.Profil.PanelEditInfo;

import java.awt.GridLayout;
import javax.swing.*;
import java.io.IOException;

public class ProfilVierge extends JPanel {
	
	//---------------
	//ATTRIBUTS
	//---------------
	private PanelEditInfo _pInfo;
	private Etudiant _e0;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ProfilVierge() throws IOException{
		_pInfo = new PanelEditInfo();
		
		add(_pInfo);
		
		setLayout(new GridLayout(1,2));
				
	}
	//---------------
	//MAIN
	//---------------
	public static void main(String arg[]) {
		try {
			FactoryCIUP facto = FactoryCIUP.getInstance();
			facto.CreationObjets();
			ProfilVierge p = new ProfilVierge ();
			
			JFrame profil = new JFrame("Profil");
			profil.setSize(700, 300);
			profil.setResizable(false);
			profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			profil.add(p);
			profil.setVisible(true);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
