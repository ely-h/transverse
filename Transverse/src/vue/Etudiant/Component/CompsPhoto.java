package vue.Etudiant.Component;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;

public class CompsPhoto extends JPanel  {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _pPhoto;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	public CompsPhoto(String val) throws IOException{
		BufferedImage bufferedImg = ImageIO.read(new File(val));
		Image imgName = bufferedImg.getScaledInstance (200, 150, Image.SCALE_DEFAULT);
		
		_pPhoto = new JLabel (new ImageIcon(imgName));
		
		this.setLayout(new BorderLayout());
		this.add(_pPhoto, BorderLayout.CENTER);
	}
}
