package vueMaison;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import modele.Maison;

public class PanelConfirmation extends JPanel {
	private JLabel titleLabel;
	private JTextArea selectedHousesArea;
	private JButton btnRetour;
	private JButton btnValider;
	private List<Maison> selectedMaisons;
	
	 public PanelConfirmation(List<Maison> selectedMaisons) {
	     this.selectedMaisons = selectedMaisons;
		 initializeComponents();
		 setupLayout();
		 affichageSelection();
	 }
	 
    private void initializeComponents() {
        titleLabel = new JLabel("Confirmation de la sélection");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        
        selectedHousesArea = new JTextArea(15, 30);
        selectedHousesArea.setEditable(false);
        selectedHousesArea.setFont(new Font("Arial", Font.PLAIN, 12));
        selectedHousesArea.setBackground(new Color(245, 245, 245));
        selectedHousesArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY),BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        
        btnRetour = new JButton("Retour");
        btnValider = new JButton("Valider la liste");
        
        // Styling/apparence des boutons
        btnRetour.setPreferredSize(new Dimension(120, 35));
        btnValider.setPreferredSize(new Dimension(120, 35));
        btnValider.setBackground(new Color(76, 175, 80));
        btnValider.setForeground(Color.WHITE);
        btnRetour.setBackground(new Color(158, 158, 158));
        btnRetour.setForeground(Color.WHITE);
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Panel titre
        JPanel titlePanel = new JPanel();
        titlePanel.add(titleLabel);
        
        // Panel liste maison selectionné
        JPanel centerPanel = new JPanel(new BorderLayout());
        JLabel instructionLabel = new JLabel("Maisons sélectionnées :");
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        centerPanel.add(instructionLabel, BorderLayout.NORTH);
        
        JScrollPane scrollPane = new JScrollPane(selectedHousesArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        
        //Boutons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.add(btnRetour);
        buttonPanel.add(btnValider);
        
        //Ajout boutons au panel principal
        add(titlePanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    private void affichageSelection() {
        if (selectedMaisons == null || selectedMaisons.isEmpty()) {
            selectedHousesArea.setText("Aucune maison sélectionnée.");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de maisons sélectionnées : ").append(selectedMaisons.size()).append("\n\n");
        
        for (int i = 0; i < selectedMaisons.size(); i++) {
            Maison maison = selectedMaisons.get(i);
            sb.append((i + 1)).append(". ").append(maison.getNom()).append("\n");
        }
        
        selectedHousesArea.setText(sb.toString());
        selectedHousesArea.setCaretPosition(0);
    }

	public JButton getBtnRetour() {
		return btnRetour;
	}

	public JButton getBtnValider() {
		return btnValider;
	}

	public List<Maison> getSelectedMaisons() {
		return selectedMaisons;
	}
	
    //mettre à jour la liste des maisons sélectionnées
    public void updateSelectedMaisons(List<Maison> newSelectedMaisons) {
        this.selectedMaisons = newSelectedMaisons;
        affichageSelection();
    }
}
