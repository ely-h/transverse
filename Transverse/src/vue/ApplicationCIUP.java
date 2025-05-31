package vue;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import javax.swing.*;

import vue.Etudiant.Etudiant;
import vue.RestoU.PanelCategoriesMenuRestoU;
import vue.miseEnLienDesPages.*;
import vue.listeMaison.*;

public class ApplicationCIUP extends JFrame implements PanelChangeListener{
	private CardLayout cardLayout;
    private JPanel panelCentral;
    private JPanel panelEntier;
    
    public ApplicationCIUP() {
    	this.setTitle("Application CIUP");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(xSize,ySize);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelEntier=new JPanel(new BorderLayout());
        
        setUpComponents();
        
        this.panelEntier.add(panelCentral,BorderLayout.CENTER);
        this.panelEntier.add(new adminDashboard(this),BorderLayout.NORTH);
        
        this.add(panelEntier);
    }
    
    private void setUpComponents(){
    	
    	cardLayout=new CardLayout();
    	this.panelCentral=new JPanel(cardLayout);
    	this.panelCentral.add(new blocPanel(this),"Accueil");
    	this.panelCentral.add(new vueGestionDeListe(this),"Residences");
    	try {
			this.panelCentral.add(new Etudiant(this.panelCentral),"Etudiants");
		} catch (IOException e) {
		    JOptionPane.showMessageDialog(this, 
		            "Erreur de chargement des données étudiant",
		            "Erreur",
		            JOptionPane.ERROR_MESSAGE);
		}
    	this.panelCentral.add(new PanelCategoriesMenuRestoU(),"RestoU");
    	
    }

	public static void main(String[] args) {
		ApplicationCIUP notreApp=new ApplicationCIUP();
		notreApp.setVisible(true);

	}

	@Override
	public void changeVers(String nomPanel) {
		// TODO Auto-generated method stub
		cardLayout.show(panelCentral, nomPanel);
	}
	
	public JPanel getPanelCentral() {
	    return panelCentral;
	}

}
