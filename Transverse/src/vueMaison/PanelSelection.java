package vueMaison;
import javax.imageio.ImageIO;
import javax.swing.*;

import modele.Maison;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelSelection extends JPanel{
	JLabel label;
	JCheckBox checkbox;
	private Maison maison;
	
	PanelSelection(Maison maison, String cbxNom, String imgNom) throws IOException
	{
		BufferedImage bufferedImg = ImageIO.read(new File(imgNom + ".jpg"));
		Image image = bufferedImg.getScaledInstance(250,250, Image.SCALE_DEFAULT);
		label = new JLabel();	
		label.setIcon(new ImageIcon (image));
		label.setHorizontalAlignment(JLabel.CENTER);
		checkbox = new JCheckBox(cbxNom);

		setLayout(new GridLayout(2,1));
		this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,3));
		add(label);
		add(checkbox);
		this.maison = maison;
	}
	
    public Maison getMaison() {
		return maison;
	}

	public void setMaison(Maison maison) {
		this.maison = maison;
	}

	public boolean toutSelection() {
        return checkbox.isSelected();
    }
    
    public void setDeselected(boolean deselected) {
        checkbox.setSelected(deselected);
    }
	
	/*public static void main(String[] args) {
		PanelSelection vueTest;
		try {
			vueTest = new PanelSelection(,"Essai","img/maison-japon");
			JFrame fenetre = new JFrame();
			fenetre.setSize(300,500);
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.add(vueTest);
			fenetre.setVisible(true);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}*/
}
