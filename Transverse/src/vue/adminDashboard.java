package vue;

import javax.swing.*;
import java.awt.*;

public class adminDashboard extends JPanel {

    public adminDashboard() {
        setLayout(new BorderLayout());
        setBackground(new Color(77, 111, 122)); // fond bleu-gris
/*----------------------------------------------
 * Redimension du logo
 * ---------------------------------------------
 */
        
        ImageIcon logoIcon = new ImageIcon("img/logo_ciup.png");
        Image scaledImage = logoIcon.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH); 
        JLabel logoLabel = new JLabel(new ImageIcon(scaledImage));
        logoLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // marges internes
/*---------------------------------------------------------------
        // Permet d'avoir le texte admindashboard aligné à droite
  ---------------------------------------------------------------
   */
        JLabel titre = new JLabel("Admin Dashboard");
        titre.setForeground(Color.BLACK);
        titre.setFont(new Font("Avenir", Font.PLAIN, 20));
        titre.setHorizontalAlignment(SwingConstants.RIGHT);
        titre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));

     
        JPanel textePanel = new JPanel(new BorderLayout());
        textePanel.setOpaque(false);
        textePanel.add(titre, BorderLayout.EAST);

        add(logoLabel, BorderLayout.WEST);
        add(textePanel, BorderLayout.EAST);
   
    /*----------------------------------------------------
     * permet d'avoir une taille de bordereau plus petit
     * ---------------------------------------------------
     */
        setPreferredSize(new Dimension(800, 70));
    }
}
