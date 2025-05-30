package vue.Etudiant;

import javax.swing.*;

import vue.Etudiant.MiseEnPage.*;

public class Etudiant extends JFrame{

	//---------------
	//ATTRIBUTS
	//---------------
	private MainPane _panelMain;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public Etudiant() {
		_panelMain = new MainPane();
		
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(_panelMain);
		setVisible(true);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		Etudiant etu = new Etudiant();
	}
	
	//---------------
	//TO DO
	//---------------
	/* La classe contiendra une méthode qui devra pouvoir être appelé
	 * pour ouvrir une Jframe qui sera l'entièreté de la liste d'étudiant.
	 * 
	 * 
	 */
}
