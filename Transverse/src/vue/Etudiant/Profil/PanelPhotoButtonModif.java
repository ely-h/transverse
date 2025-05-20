package vue.Etudiant.Profil;

import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.*;

public class PanelPhotoButtonModif extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelPhoto _pPhoto;
	private ButtonModification _pbutton;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelPhotoButtonModif(String imgPath)throws IOException{
		_pPhoto = new PanelPhoto(imgPath);
		_pbutton = new ButtonModification();
		
		add(_pPhoto);
		add(_pbutton);
		
		setLayout(new GridLayout(2,1));
	}
	
	
	//---------------
	//MAIN
	//---------------

	public static void main(String arg[]) {
		try {
			JFrame profil = new JFrame("Profil");
			profil.setSize(700, 300);
			profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			PanelPhotoButtonModif p = new PanelPhotoButtonModif ("img/example.jpg");
			
			profil.add(p);
			profil.setVisible(true);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
