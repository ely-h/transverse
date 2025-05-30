package vue;

import javax.swing.*;
import java.awt.*;

public class blocPanel extends JPanel {

    public blocPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 60));
        setBackground(Color.WHITE);

        // Création des blocs
        Block blocResidences = new Block("Résidences");
        Block blocEtudiants = new Block("Étudiants");
        Block blocRestoU = new Block("Resto U");

        // Ajout des blocs au panel
        add(blocResidences);
        add(blocEtudiants);
        add(blocRestoU);
    }
}
