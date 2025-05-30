package vue.Etudiant.Edit.ProfilVierge;

import modele.Etudiant;
import vue.Etudiant.Edit.Profil.PanelEditInfo;
import vue.Etudiant.Component.*;
import controller.Etudiant.BlankProfil.*;

import java.awt.GridLayout;
import javax.swing.*;
import java.io.IOException;

public class ProfilVierge extends JPanel {
	
	//---------------
	//ATTRIBUTS
	//---------------
	private PanelEditInfo _pInfo;
	private CompsTripleButton _p3Button;
	private Etudiant _e0;

	//---------------
	//GETTERS
	//---------------
	public JButton getButton0() {return _p3Button.getButton0();}
	public JButton getButton1() {return _p3Button.getButton1();}
	public JButton getButton2() {return _p3Button.getButton2();}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ProfilVierge() throws IOException{
		_pInfo = new PanelEditInfo();
		_p3Button = new CompsTripleButton("Sauvegarder", "Visualiser", "Annuler");
		
		add(_p3Button);
		add(_pInfo);
		
		setLayout(new GridLayout(1,2));
				
	}
	//---------------
	//MAIN
	//---------------
	public static void main(String arg[]) {
		try {
			ProfilVierge p = new ProfilVierge ();
			
			JFrame profil = new JFrame("Nouveau Profil");
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
