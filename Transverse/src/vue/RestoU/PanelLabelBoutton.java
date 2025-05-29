package vue.RestoU;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLabelBoutton extends JPanel{
	protected JButton bouttonChoisir;
	protected JLabel categorie;
	
	public PanelLabelBoutton(String texteBoutton, String texteCategorie) {
		super();
		this.bouttonChoisir = new JButton(texteBoutton);
		bouttonChoisir.setSize(100,500);
		this.categorie = new JLabel (texteCategorie);
		categorie.setFont(new Font(getFont().toString(),Font.PLAIN,30));
		this.categorie.setHorizontalAlignment(JLabel.CENTER);
		this.add(categorie);
		this.add(bouttonChoisir);
		this.bouttonChoisir.setBackground(new Color(78, 94, 99));
		this.bouttonChoisir.setForeground(Color.WHITE);
		this.bouttonChoisir.setFont(new Font(getFont().toString(),Font.BOLD,25));
		
		this.setLayout(new GridLayout(2,1));
	}
	
	public JButton getBoutton() {
		return bouttonChoisir;
	}

}
