package vue;

import javax.swing.*;
import java.awt.*;

public class BlocPanel extends JPanel {

    private Block blocResidences;
    private Block blocEtudiants;
    private Block blocRestoU;

    public BlocPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 50));
        setBackground(Color.WHITE);

        blocResidences = new Block("Résidences");
        blocEtudiants = new Block("Étudiants");
        blocRestoU = new Block("Resto U");

        add(blocResidences);
        add(blocEtudiants);
        add(blocRestoU);
    }

    public Block getBlocResidences() {
        return blocResidences;
    }

    public Block getBlocEtudiants() {
        return blocEtudiants;
    }

    public Block getBlocRestoU() {
        return blocRestoU;
    }
} 
