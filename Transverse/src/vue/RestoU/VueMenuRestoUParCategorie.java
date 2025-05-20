package vue.RestoU;
import javax.swing.*;

import java.awt.BorderLayout;
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

	public VueMenuRestoUParCategorie(String categorie,String imageCat) throws IOException{
		BufferedImage bufferedImg=ImageIO.read(new File(imageCat));
		
		Image imgCat=bufferedImg.getScaledInstance(300,250, Image.SCALE_DEFAULT);
		
		imgCategorie=new JLabel(new ImageIcon(imgCat));
		
		this.setLayout(new GridLayout(2,1) );
		
		this.add(imgCategorie);
		
		this.add(new PanelLabelBoutton("Choisir",categorie));

	}

	public static void main(String[] args) {
		//BufferedImage monImg=ImageIO.read(new File("tarte_citron_meringuee.webp"));
		VueMenuRestoUParCategorie vueTest;
		try {
			vueTest = new VueMenuRestoUParCategorie("Essai avec test long","img/pizza.jpg");
			JFrame fenetre=new JFrame();
		fenetre.setSize(300,500);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.add(vueTest);
		fenetre.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
