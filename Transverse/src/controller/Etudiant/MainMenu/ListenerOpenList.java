package controller.Etudiant.MainMenu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import vue.Etudiant.Liste.*;
import vue.miseEnLienDesPages.PanelChangeListener;

public class ListenerOpenList implements ActionListener {

	//---------------
	//ATTRIBUTS
	//---------------
	private Liste _liste;
	private JPanel _panelSRC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerOpenList(Liste liste, JPanel panel){
		_liste = liste;
		_panelSRC = (JPanel)panel;
	}
	
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		_panelSRC.removeAll();
		_panelSRC.add(_liste);
		_panelSRC.revalidate();
		_panelSRC.repaint();
	}
}
