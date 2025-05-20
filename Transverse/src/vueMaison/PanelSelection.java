package vueMaison;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelSelection extends JPanel{
	JLabel label;
	JCheckBox checkbox;
	
	PanelSelection( String cbxNom, String imgNom) throws IOException
	{
		BufferedImage bufferedImg = ImageIO.read(new File(imgNom + ".jpg"));
		Image image = bufferedImg.getScaledInstance(250,250, Image.SCALE_DEFAULT);
		label = new JLabel();	
		label.setIcon(new ImageIcon (image));
		checkbox = new JCheckBox(cbxNom);

		setLayout(new GridLayout(3,1));
		add(label);
		add(checkbox);
	}
	
    public boolean toutSelection() {
        return checkbox.isSelected();
    }
    
    public void setDeselected(boolean deselected) {
        checkbox.setSelected(deselected);
    }
	
	public static void main(String[] args) {
		PanelSelection vueTest;
		try {
			vueTest = new PanelSelection("Essai","img/maison-japon");
			JFrame fenetre = new JFrame();
			fenetre.setSize(300,500);
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.add(vueTest);
			fenetre.setVisible(true);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
