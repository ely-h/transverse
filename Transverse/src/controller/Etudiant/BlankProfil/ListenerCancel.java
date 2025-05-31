package controller.Etudiant.BlankProfil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ListenerCancel implements ActionListener{
	
	//---------------
	//ATTRIBUTS
	//---------------
	private JPanel _paneSRC;
	private JPanel _panelSRC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerCancel(JPanel pane, JPanel lePanel) {
		_paneSRC = pane;
		_panelSRC = lePanel;
	}
	//---------------
	//MAIN
	//---------------
	public void actionPerformed(ActionEvent e) {
		closeFrame();
	}
	//---------------
	//METHODE
	//---------------
	private void closeFrame() {
		_panelSRC.removeAll();
		_panelSRC.add(_paneSRC);
		_panelSRC.revalidate();
		_panelSRC.repaint();
	}
}
