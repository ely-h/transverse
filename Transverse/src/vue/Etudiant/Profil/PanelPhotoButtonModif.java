package vue.Etudiant.Profil;

import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.*;

import vue.Etudiant.Component.*;
import controller.Etudiant.Profil.*;

public class PanelPhotoButtonModif extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private CompsPhoto _pPhoto;
	private CompsButton _pbutton;
	private ListenerModification _lM;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelPhotoButtonModif(String imgPath)throws IOException{
		_pPhoto = new CompsPhoto(imgPath);
		_pbutton = new CompsButton("Modifier");
		
		_lM = new ListenerModification();
		
		_pbutton.getButton().addActionListener(_lM);
		
		add(_pPhoto);
		add(_pbutton);
		
		
		setLayout(new GridLayout(2,1, 4, 4));
	}
}
