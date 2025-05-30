package vue;

import javax.swing.*;
import java.awt.*;

public class BoutonsNavigationPanel extends JPanel {

    public JButton btnResidences;
    public JButton btnEtudiants;
    public JButton btnRestoU;

    public BoutonsNavigationPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        setBackground(Color.WHITE);

        btnResidences = new JButton("Résidences");
        btnEtudiants = new JButton("Étudiants");
        btnRestoU = new JButton("Resto U");

        Dimension btnSize = new Dimension(120, 30);
        btnResidences.setPreferredSize(btnSize);
        btnEtudiants.setPreferredSize(btnSize);
        btnRestoU.setPreferredSize(btnSize);

        add(btnResidences);
        add(btnEtudiants);
        add(btnRestoU);
    }
}
