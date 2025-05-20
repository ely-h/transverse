package vue.Etudiant.Profil;

import modele.Etudiant;
import java.awt.GridLayout;
import javax.swing.*;
import java.io.IOException;

public class Profil extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelPhotoButtonModif _pPhoto;
	private PanelInfo _pInfo;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	Profil(String nom, String prenom, String mail, int annee, String nationalitee, String logement, String imgPath)
	 throws IOException{
		_pInfo = new PanelInfo(nom, prenom, mail, annee, nationalitee, logement);
		_pPhoto = new PanelPhotoButtonModif(imgPath);
		
		add(_pPhoto);
		add(_pInfo);
		
		setLayout(new GridLayout(1,2));
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String arg[]) {
		try {
			JFrame profil = new JFrame("Profil");
			profil.setSize(700, 300);
			profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Profil p = new Profil ("Jones", "Felicia", "felicia.jones@gmail.com", 5, "USA House", "Américaine", "img/example.jpg");
			
			profil.add(p);
			profil.setVisible(true);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//---------------
	//METHODE
	//---------------
	
}
