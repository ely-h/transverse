package vue.Etudiant.Edit.Profil;

import modele.Etudiant;
import modele.FactoryCIUP;

import java.awt.GridLayout;
import javax.swing.*;
import java.io.IOException;

public class EditProfil extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelPhotoButtonModif _pPhoto;
	private PanelEditInfo _pInfo;

	//---------------
	//CONSTRUCTEUR
	//---------------
	public EditProfil(Etudiant e0) throws IOException{
		_pInfo = new PanelEditInfo();
		_pPhoto = new PanelPhotoButtonModif(e0.getPathImg());
		
		add(_pPhoto);
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
			
			JFrame profil = new JFrame("Profil");
			profil.setSize(700, 300);
			profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			EditProfil p = new EditProfil (facto.getLesEtudiants().get(1));
			
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
