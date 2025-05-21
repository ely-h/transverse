package vue.RestoU;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

import modele.*;

public class VuePlat extends JPanel{
	protected JLabel image;
	protected PanelLabelBoutton nomEtBoutton;
	
	public VuePlat(Plat lePlat) {
		BufferedImage bufferedImg;
		try {
			bufferedImg = ImageIO.read(new File("img/"+lePlat.getNomDuPlat()+".jpg"));
			Image imgPlat=bufferedImg.getScaledInstance(300,250, Image.SCALE_DEFAULT);
			image=new JLabel(new ImageIcon(imgPlat));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			image=new JLabel(new ImageIcon("img/pizza.jpg"));
			System.out.println("L'image du plat "+lePlat.getNomDuPlat()+" n'a pas été trouvée");
		}
		nomEtBoutton=new PanelLabelBoutton("Voir",lePlat.getNomDuPlat());
		
		this.setLayout(new BorderLayout());
		this.add(image,BorderLayout.CENTER);
		this.add(nomEtBoutton,BorderLayout.SOUTH);

		Dimension size = new Dimension(300, 300);
	    this.setPreferredSize(size);
	    this.setMinimumSize(size);
	    this.setMaximumSize(size);
	    
	    this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,3));
		
		
	}
	
	public static void main(String[] args) {
		Plat pizza=new Plat("pizza",null,null);
		JFrame fenetre=new JFrame();
		fenetre.setSize(300,300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VuePlat vueTest=new VuePlat(pizza);
		fenetre.add(vueTest);
		fenetre.setVisible(true);
	}

}
