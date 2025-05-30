package vue.Etudiant.Profil;

import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.*;

import vue.Etudiant.Component.*;

public class PanelPhotoButtonModif extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private ComponentPhoto _pPhoto;
	private ComponentButton _pbutton;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelPhotoButtonModif(String imgPath)throws IOException{
		_pPhoto = new ComponentPhoto(imgPath);
		_pbutton = new ComponentButton("Modifier");
		
		add(_pPhoto);
		add(_pbutton);
		
		
		setLayout(new GridLayout(2,1, 4, 4));
	}
}
