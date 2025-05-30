package vue.Etudiant.Edit.Profil;

import java.awt.GridLayout;
import javax.swing.*;

import vue.Etudiant.Component.*;

public class PopupNewPath extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private ComponentButton _bSave;
	private ComponentButton _bCancel;
	private ComponentInfo _iTitle;
	private ComponentTextField _tfPath;
	private JPanel _boutonDuo;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public PopupNewPath(){
		_bSave = new ComponentButton("Save");
		_bCancel = new ComponentButton("Cancel");
		_iTitle = new ComponentInfo("Entrer le nouveau chemin");
		_tfPath = new ComponentTextField();
		_boutonDuo = new JPanel();
		
		_boutonDuo.add(_bSave);
		_boutonDuo.add(_bCancel);
		
		_boutonDuo.setLayout(new GridLayout(1,2, 4, 4));
		
		add(_iTitle);
		add(_tfPath);
		add(_boutonDuo);
		
		setLayout(new GridLayout(3, 1, 4, 4));
		
	}
	
	
	//---------------
	//MAIN
	//---------------
	public void open () {
		JFrame profil = new JFrame("Profil");
		profil.setSize(500, 200);
		profil.setResizable(false);
		profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PopupNewPath pop = new PopupNewPath();
		
		profil.add(pop);
		profil.setVisible(true);	
	}
	
	//---------------
	//METHODE
	//---------------
}
