package vue.Etudiant.Component;

import java.awt.GridLayout;

import javax.swing.*;

public class CompsTripleButton extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private CompsButton _button0;
	private CompsButton _button1;
	private CompsButton _button2;
	
	//---------------
	//ACCESSEUR
	//---------------
	public JButton getButton0() {return _button0.getButton();}
	public JButton getButton1() {return _button1.getButton();}
	public JButton getButton2() {return _button2.getButton();}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public CompsTripleButton(String s0, String s1, String s2){
		_button0 = new CompsButton(s0);
		_button1 = new CompsButton(s1);
		_button2 = new CompsButton(s2);
	
		add(_button0);
		add(_button1);
		add(_button2);
		
		setLayout(new GridLayout(3,1,2,2));
		
	}
}
