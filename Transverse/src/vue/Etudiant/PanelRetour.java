package vue.Etudiant;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Classe qui définit le Panel Retour 
 * 
 * @author agoubi et hassine
 */
public class PanelRetour extends JPanel{
	JButton backButton;
	
	public PanelRetour() {
		backButton = new JButton("<-"); // Flèche Unicode
      backButton.setFont(new Font("SansSerif", Font.BOLD, 14));
      backButton.setBackground(new java.awt.Color(0, 173, 181));
      backButton.setForeground(java.awt.Color.WHITE);
      backButton.setFocusPainted(false);
      backButton.setPreferredSize(new java.awt.Dimension(60, 40));
      backButton.setMargin(new java.awt.Insets(5, 5, 5, 5));
      
      //backButton.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
      
      
      this.add(backButton);
	}
	
	public JButton getButton() {
		return this.backButton;
	}

}
