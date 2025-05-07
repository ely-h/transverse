package vue.RestoU;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;

public class VueMenuRestoUParCategorie extends JPanel {
	
	protected JButton bouttonChoisir;
	protected JLabel categorie;
	protected JLabel imgCategorie;

	public VueMenuRestoUParCategorie(String categorie,String imageCat){
		
		imgCategorie=new JLabel(new ImageIcon(imageCat));
		this.add(imgCategorie);
		this.categorie=new JLabel(categorie);
		this.add(this.categorie);
		bouttonChoisir=new JButton("Choisir");
		this.add(bouttonChoisir);
		this.setLayout(new GridLayout(3,1) );
	}

	public static void main(String[] args) {
		//BufferedImage monImg=ImageIO.read(new File("tarte_citron_meringuee.webp"));
		VueMenuRestoUParCategorie vueTest=new VueMenuRestoUParCategorie("Test","img/pizza.jpg");
		JFrame fenetre=new JFrame();
		fenetre.setSize(500,800);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.add(vueTest);
		fenetre.setVisible(true);

	}

}
