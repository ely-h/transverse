package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class vueDashboard extends JFrame {
    public vueDashboard() {
        setTitle("Admin Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ---- BORDEREAU AVEC SELECTEUR ----
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(new adminDashboard(), BorderLayout.NORTH);

        add(topPanel, BorderLayout.NORTH);

        // ---- NAVIGATION BAR ----
        //add(new panelNavigationBar("Tableau de Bord"), BorderLayout.CENTER);

        // ---- BLOCS CENTRAUX ----
        JPanel centre = new JPanel();
        centre.setBackground(Color.WHITE);
        centre.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 100));
        centre.add(new panelBlockMenu("Résidences"));
        centre.add(new panelBlockMenu("Étudiants"));
        centre.add(new panelBlockMenu("Resto U"));

        add(centre, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new vueDashboard();
    }
}
