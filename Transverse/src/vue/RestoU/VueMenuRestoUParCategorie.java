package vue.RestoU;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;

public class VueMenuRestoUParCategorie extends JPanel {
	
	protected JButton bouttonChoisir;
	protected JLabel categorie;
	protected JLabel imgCategorie;

	public VueMenuRestoUParCategorie(String categorie,String imageCat) {
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
		
		this.add(new PanelLabelBoutton("Choisir",categorie));
		
		this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,3));

	}

	public static void main(String[] args) {
		//BufferedImage monImg=ImageIO.read(new File("tarte_citron_meringuee.webp"));
		VueMenuRestoUParCategorie vueTest;
		
		vueTest = new VueMenuRestoUParCategorie("Essai avec test long","img/pizza.jpg");
		JFrame fenetre=new JFrame();
		fenetre.setSize(300,500);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.add(vueTest);
		fenetre.setVisible(true);
		
		

	}

}
