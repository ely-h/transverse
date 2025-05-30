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
	private CompsPhoto _pPhoto;
	private CompsButton _pBSave;
	private CompsButton _pBChange;
	private CompsButton _pBCancel;
	private ListenerSave _lS;
	private ListenerCancel _lC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	protected PanelPhotoButtonModif(String imgPath)throws IOException{
		_pPhoto = new CompsPhoto(imgPath);
		_pBSave = new CompsButton("Sauvegarder");
		_pBCancel = new CompsButton("Annuler");
		
		_lC = new ListenerCancel();
		_lS = new ListenerSave();

		_pBSave.getButton().addActionListener(_lS);
		_pBCancel.getButton().addActionListener(_lC);
		
		JPanel jp = new JPanel();
		jp.add(_pBSave);
		jp.add(_pBCancel);
		jp.setLayout(new GridLayout(1,2));
		
		add(_pPhoto, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
		
	}
}
