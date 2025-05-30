package vue.Etudiant.Edit.Profil;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.*;

import vue.Etudiant.Component.*;
import controller.Etudiant.Edit.*;

public class PanelPhotoButtonModif extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private ComponentPhoto _pPhoto;
	private ComponentButton _pBSave;
	private ComponentButton _pBChange;
	private ComponentButton _pBCancel;
	private ListenerSave _lS;
	private ListenerCancel _lC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelPhotoButtonModif(String imgPath)throws IOException{
		_pPhoto = new ComponentPhoto(imgPath);
		_pBSave = new ComponentButton("Sauvegarder");
		_pBChange = new ComponentButton("Modifier");
		_pBCancel = new ComponentButton("Annuler");
		
		_lC = new ListenerCancel();
		_lS = new ListenerSave();
		
		
		_pBSave.getButton().addActionListener(_lS);
		_pBCancel.getButton().addActionListener(_lC);
		
		JPanel jp = new JPanel();
		jp.add(_pBSave);
		jp.add(_pBCancel);
		jp.setLayout(new GridLayout(1,2));
		
		/* 
		 *  Ecouteur pour _pBChange qui si possible ouvre l'explorateur de fichier pour choisir
		 *  une nouvelle image et enregistra le nouveau chemin dans le modele
		 */
		
		
		add(_pBChange, BorderLayout.EAST);
		add(_pPhoto, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
		
	}
}
