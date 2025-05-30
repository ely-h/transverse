package vue.Etudiant.MiseEnPage;

import java.awt.GridLayout;
import javax.swing.*;

import vue.Etudiant.Component.*;

public class MainPane extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private CompsButtonTitle _cbtListe;
	private CompsButtonTitle _cbtEtu;
	
	//---------------
	//GETTERS
	//---------------
	public JButton getCBTListe() {return _cbtListe.getButton();}
	public JButton getCBTEtudiant() {return _cbtEtu.getButton();}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public MainPane() {
		_cbtEtu = new CompsButtonTitle("Ajouter Etudiant", "Ajouter");
		_cbtListe = new CompsButtonTitle("Liste des étudiants", "voir");
		
		JPanel jp0 = new JPanel();
		jp0.add(_cbtEtu);
		
		JPanel jp1 = new JPanel();
		jp1.add(_cbtListe);
		
		JPanel jp2 = new JPanel();
		jp2.add(jp0);
		jp2.add(jp1);
		jp2.setLayout(new GridLayout(1,2, 15, 15));
		
		JLabel title = new JLabel("Gestion Étudiants");
		title.setAlignmentX(CENTER_ALIGNMENT);
		title.setAlignmentY(CENTER_ALIGNMENT);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		
		//add(title);	il est pas centrer :(
		add(jp2);
		
		setLayout(new GridLayout(2, 1, 2, 2));
	}
}
