package vue.listeMaison;
import javax.imageio.ImageIO;
import javax.swing.*;

import modele.Maison;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author elyssa
 * 
 * Panel d'interface graphique pour afficher la confirmation de sélection des maisons.
 * Cette classe présente à l'utilisateur un récapitulatif des maisons sélectionnées et propose les options de retour ou de validation de la liste.
 */
public class PanelSelection extends JPanel{
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
	protected JLabel label;
	protected JCheckBox checkbox;
	private Maison maison;
	
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
	
	/**
	 * Constructeur du panel de sélection pour une maison.
	 * Charge l'image correspondante et configure l'interface graphique.
	 * 
	 * @param maison
	 * @param cbxNom
	 * @param imgNom
	 * @throws IOException
	 */
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
		
		//ajout des composants
		add(label);
		add(getCheckbox());
		this.maison = maison;
	}
	
	//-------------------------
	// GETTERS
	//-------------------------
	
    public Maison getMaison() {
		return maison;
	}

	public void setMaison(Maison maison) {
		this.maison = maison;
	}
	
	//-------------------------
	// METHODES
	//-------------------------
	
	//Option tout selectionner
	public boolean toutSelection() {
        return getCheckbox().isSelected();
    }
    
    public void setDeselected(boolean deselected) {
        getCheckbox().setSelected(deselected);
    }

	public JCheckBox getCheckbox() {
		return checkbox;
	}
}
