package vue.Etudiant.Profil.Panels.Photo;

import javax.swing.*;

public class ButtonModification extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _button;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	ButtonModification(){
		_button = new JButton("Modifier");
		
		add(_button);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String arg[]) {
	
		JFrame profil = new JFrame("Profil");
		profil.setSize(200, 300);
		profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonModification p = new ButtonModification();
		
		profil.add(p);
		profil.setVisible(true);
	
	}
	
}
