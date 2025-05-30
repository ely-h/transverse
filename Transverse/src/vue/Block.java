package vue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/*---------------------------------------------------------
 * Classe des blocs pour les éléments résidents restoU et etudiants
 * --------------------------------------------------------
 */
public class Block extends JPanel {
	private JButton bouton;
    public Block(String titre)  {
        setPreferredSize(new Dimension(200, 150));
        setBackground(new Color(250, 248, 243));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        JLabel label = new JLabel(titre, SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.PLAIN, 18));

        JButton bouton = new JButton("Manage");
        bouton.setBackground(Color.DARK_GRAY);
        bouton.setForeground(Color.WHITE);

        add(label, BorderLayout.CENTER);
        add(bouton, BorderLayout.SOUTH);
    }
    

    // Permet d’ajouter un ActionListener au bouton "Manage"
    public void addManageListener(ActionListener listener) {
        bouton.addActionListener(listener);
    }
}
