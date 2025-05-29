package vue.Etudiant.Liste.Filtre;

import javax.swing.*;
import java.awt.GridLayout;

public class PanelFiltreButton extends JPanel{

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
	PanelFiltreButton(String nation){
		_button = new JButton(nation);
		
		add(_button);
	}
	
	//---------------
	//MAIN
	//---------------
	
	//---------------
	//METHODE
	//---------------
}
