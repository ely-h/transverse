package vue.Etudiant.Edit.Profil.EditPhoto;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;

public class PanelPhotoButtonModif extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelPhoto _pPhoto;
	private ButtonModification _pBSave;
	private ButtonModification _pBChange;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelPhotoButtonModif(String imgPath)throws IOException{
		_pPhoto = new PanelPhoto(imgPath);
		_pBSave = new ButtonModification("Sauvegarder");
		_pBChange = new ButtonModification("Modifié");
		
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
