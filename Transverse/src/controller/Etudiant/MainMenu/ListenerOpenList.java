package controller.Etudiant.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import vue.Etudiant.Liste.*;

public class ListenerOpenList implements ActionListener {

	//---------------
	//ATTRIBUTS
	//---------------
	private Liste _liste;
	private JFrame _frameSRC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerOpenList(Liste liste, JFrame frame){
		_liste = liste;
		_frameSRC = frame;
	}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_frameSRC.getContentPane().removeAll();
		_frameSRC.add(_liste);
		_frameSRC.revalidate();
		_frameSRC.repaint();
	}
}
