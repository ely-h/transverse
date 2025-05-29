package vue.Etudiant.Edit.Profil;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;

import vue.Etudiant.Component.*;

public class PanelPhotoButtonModif extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private ComponentPhoto _pPhoto;
	private ComponentButton _pBSave;
	private ComponentButton _pBChange;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelPhotoButtonModif(String imgPath)throws IOException{
		_pPhoto = new ComponentPhoto(imgPath);
		_pBSave = new ComponentButton("Sauvegarder");
		_pBChange = new ComponentButton("Modifié");
		
		/*Ecouteur pour _pBSave qui sauvegarderas les données dans les JTextFields et qui les
		 * enregistras dans le modele
		 * 
		 *  Ecouteur pour _pBChange qui si possible ouvre l'explorateur de fichier pour choisir
		 *  une nouvelle image et enregistra le nouveau chemin dans le modele
		 */
		
		
		add(_pBChange, BorderLayout.EAST);
		add(_pPhoto, BorderLayout.CENTER);
		add(_pBSave, BorderLayout.SOUTH);
	}
}
