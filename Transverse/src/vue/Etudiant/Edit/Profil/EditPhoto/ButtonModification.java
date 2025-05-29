package vue.Etudiant.Edit.Profil.EditPhoto;

import javax.swing.*;

public class ButtonModification extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _button;

	//---------------
	//CONSTRUCTEUR
	//---------------
	ButtonModification(String s){
		_button = new JButton(s);
		
		add(_button);
	}
}
