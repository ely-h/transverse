package vue.RestoU;
import javax.swing.*;
import javax.swing.border.Border;

import modele.MenuRestoUParCategorie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;

public class VueMenuRestoUParCategorie extends JPanel {

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	protected JButton bouttonChoisir;
	protected JLabel categorie;
	protected JLabel imgCategorie;
	protected PanelLabelBoutton panelCatBoutton;

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------

	public VueMenuRestoUParCategorie(MenuRestoUParCategorie categorie,String imageCat) {
		BufferedImage bufferedImg;
		try {
			bufferedImg = ImageIO.read(new File(imageCat));
			Image imgCat=bufferedImg.getScaledInstance(300,250, Image.SCALE_DEFAULT);
		
			imgCategorie=new JLabel(new ImageIcon(imgCat));
		} catch (IOException e) {
			imgCategorie=new JLabel(new ImageIcon("img/placeholder-food.png"));
		}
		
		
		
		this.setLayout(new GridLayout(2,1) );
		
		this.add(imgCategorie);
		
		this.panelCatBoutton=new PanelLabelBoutton("Choisir",categorie.getCategorie());
		
		this.add(panelCatBoutton);
		
		this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,3));

	}

	//--------------------------
	// ACCESSEURS
	//--------------------------
	
	public JButton getBoutton() {
		return this.panelCatBoutton.getBoutton();
	}


}
