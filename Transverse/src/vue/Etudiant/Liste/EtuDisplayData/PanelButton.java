package vue.Etudiant.Liste.EtuDisplayData;

import javax.swing.*;

import vue.Etudiant.Profil.Panels.ButtonModification;

public class PanelButton extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _button;
	
	//---------------
	//ACCESSEUR
	//---------------
	public JButton getButton() {return _button;}
	
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelButton(){
		_button = new JButton("Profil");
		
		add(_button);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String arg[]) {
	
		JFrame profil = new JFrame("Profil");
		profil.setSize(200, 300);
		profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelButton p = new PanelButton();
		
		profil.add(p);
		profil.setVisible(true);
	
	}
	
	
}
