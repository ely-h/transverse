package vue;

import javax.swing.*;
import java.awt.*;

public class blocPanel extends JPanel {

    public blocPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 60));
        setBackground(Color.WHITE);

        // Création des blocs
        panelBlockMenu blocResidences = new panelBlockMenu("Résidences");
        panelBlockMenu blocEtudiants = new panelBlockMenu("Étudiants");
        panelBlockMenu blocRestoU = new panelBlockMenu("Resto U");

        // Ajout des blocs au panel
        add(blocResidences);
        add(blocEtudiants);
        add(blocRestoU);
    }
    public panelBlockMenu getBlocResidences() {
        return getBlocResidences();
    }

    public panelBlockMenu getBlocEtudiants() {
        return getBlocEtudiants();
    }

    public panelBlockMenu getBlocRestoU() {
        return getBlocRestoU();
    }
}
