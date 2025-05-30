package controller.Etudiant.BlankProfil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ListenerCancel implements ActionListener{
	
	//---------------
	//ATTRIBUTS
	//---------------
	private JPanel _paneSRC;
	private JFrame _frameSRC;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ListenerCancel(JPanel pane, JFrame frame) {
		_paneSRC = pane;
		_frameSRC = frame;
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
		_frameSRC.getContentPane().removeAll();
		_frameSRC.add(_paneSRC);
		_frameSRC.revalidate();
		_frameSRC.repaint();
	}
}
