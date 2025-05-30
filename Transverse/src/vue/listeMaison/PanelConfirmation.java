package vue.listeMaison;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import modele.Maison;

/**
 * @author elyssa
 * Panel d'interface graphique pour afficher la confirmation de sélection des maisons.
 * Cette classe présente à l'utilisateur un récapitulatif des maisons sélectionnées et propose les options de retour ou de validation de la liste.
 */
public class PanelConfirmation extends JPanel {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
	private JLabel titleLabel;
	private JTextArea selectedHousesArea;
	private JButton btnRetour;
	private JButton btnValider;
	private List<Maison> selectedMaisons;
	
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
	
	 /**
	 * Constructeur du panel de confirmation.
	 * Initialise tous les composants graphiques et affiche les maisons sélectionnées.
	 * 
	 * @param selectedMaisons
	 */
	public PanelConfirmation(List<Maison> selectedMaisons) {
	     this.selectedMaisons = selectedMaisons;
		 initializeComponents();
		 setupLayout();
		 affichageSelection();
	 }
	 
	//-------------------------
	// METHODES
	//-------------------------
	 
    /**
     * Initialise tous les composants graphiques du panel.
     * Configure les labels, zone de texte et boutons avec leurs styles respectifs.
     */
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
    
    /**
     * Configure la mise en page du panel avec BorderLayout.
     * Organise le titre en haut, la liste au centre et les boutons en bas.
     */
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
    
    /**
     * Met à jour l'affichage de la liste des maisons sélectionnées.
     * Construit un texte formaté avec le nombre et les noms des maisons.
     */
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
    
    /**
     * Met à jour la liste des maisons sélectionnées et rafraîchit l'affichage.
     * Utilisée pour modifier dynamiquement la sélection si nécessaire.
     * 
     * @param newSelectedMaisons
     */
    public void updateSelectedMaisons(List<Maison> newSelectedMaisons) {
        this.selectedMaisons = newSelectedMaisons;
        affichageSelection();
    }
    
	//-------------------------
	// GETTERS
	//-------------------------
    
	public JButton getBtnRetour() {
		return btnRetour;
	}

	public JButton getBtnValider() {
		return btnValider;
	}

	public List<Maison> getSelectedMaisons() {
		return selectedMaisons;
	}
}
