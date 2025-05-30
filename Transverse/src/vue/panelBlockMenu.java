package vue;

import javax.swing.*;
import java.awt.*;

/*---------------------------------------------------------
 * Classe des blocs pour les éléments Résidences, Resto U et Étudiants
 * --------------------------------------------------------
 */
public class panelBlockMenu extends JPanel {

    private JButton bouton;

    public panelBlockMenu(String titre) {
        setPreferredSize(new Dimension(200, 150));
        setBackground(new Color(250, 248, 243));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        JLabel label = new JLabel(titre, SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.PLAIN, 18));

        bouton = new JButton("Manage");
        bouton.setBackground(Color.DARK_GRAY);
        bouton.setForeground(Color.WHITE);

        add(label, BorderLayout.CENTER);
        add(bouton, BorderLayout.SOUTH);
    }

}
