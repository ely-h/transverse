package vue.Etudiant.Profil;

import modele.Etudiant;
import modele.FactoryCIUP;

import java.awt.GridLayout;
import javax.swing.*;
import java.io.IOException;

public class Profil extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelPhotoButtonModif _pPhoto;
	private PanelInfo _pInfo;
	private Etudiant _e;
	
	//---------------
	//ACCESSEUR
	//---------------
	public Etudiant getEtu() {return _e;}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public Profil(Etudiant e0) throws IOException{
		String logement;
		
		if (e0.get_saMaison() == null)
			logement = e0.get_statuLogement();
		else
			logement = e0.get_saMaison().getNom();
		
		_pInfo = new PanelInfo(
				e0.get_nom(),
				e0.get_prenom(),
				e0.get_mail(),
				e0.get_anneeEtude(),
				e0.get_saNationnalite().getNom(),
				logement
				);
		_pPhoto = new PanelPhotoButtonModif(e0.getPathImg());
		
		_e = e0;
		
		
		add(_pPhoto);
		add(_pInfo);
		
		setLayout(new GridLayout(1,2));
				
	}

	//---------------
	//MAIN
	//---------------
	public static void main(String arg[]) {
		try {
			FactoryCIUP facto = FactoryCIUP.getInstance();
			facto.CreationObjets();
			
			JFrame profil = new JFrame("Profil");
			profil.setSize(700, 300);
			profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Profil p = new Profil (facto.getLesEtudiants().get(1));
			
			profil.add(p);
			profil.setVisible(true);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//---------------
	//METHODE
	//---------------
	public void openProfil() {
		JFrame profil = new JFrame("Profil");
		profil.setSize(700, 300);
		profil.setResizable(false);
		profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		profil.add(this);
		profil.setVisible(true);
	}
}
