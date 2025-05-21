package vue.Etudiant.Profil.Panels;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;

public class PanelPhoto extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _pPhoto;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelPhoto(String val) throws IOException{
		BufferedImage bufferedImg = ImageIO.read(new File(val));
		Image imgName = bufferedImg.getScaledInstance (200, 150, Image.SCALE_DEFAULT);
		
		_pPhoto = new JLabel (new ImageIcon(imgName));
		
		this.setLayout(new BorderLayout());
		this.add(_pPhoto, BorderLayout.CENTER);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main (String arg[]) {
		try {
		JFrame frame = new JFrame ("Frame");
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelPhoto p = new PanelPhoto("img/example.jpg");
		
		frame.add(p);
		
		frame.setVisible(true);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//---------------
	//METHODES
	//---------------
	
}
