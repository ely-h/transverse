package vueMaison;
import modele.FactoryCIUP;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author elyssa
 * 
 * Vue principale pour la création d'une liste de maisons.
 * 
 * Cette classe permet à l'utilisateur de sélectionner des maisons parmi celles disponibles dans la factory CIUP pour créer une liste personnalisée.
 * L'interface présente toutes les maisons disponibles avec des cases à cocher pour permettre la sélection multiple.
 */
public class VueAjoutMaisonListe extends JPanel{
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------

	private JPanel panelMaisons;
    private JButton btnSelectAll;
    private JButton btnConfirm;
    private JButton btnCancel;
    private List<PanelSelection> selectionPanels;
    
    private ArrayList<modele.Maison> lesMaisons;
    private PanelSelection maisonInternationale;
    private PanelSelection maisonFR;
    private PanelSelection maisonES;
    private PanelSelection maisonJP;
    private PanelSelection maisonTU;
    private PanelSelection maisonKR;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------

    
    /**
     * Constructeur de la vue d'ajout de maisons à la liste.
     * Initialise tous les composants graphiques, charge les maisons depuis la factory
     * et met en place la disposition visuelle avec les panels de sélection.
     * Ajoute également l'écouteur pour le bouton "Tout sélectionner".
     */
    public VueAjoutMaisonListe(JFrame fenetre) {
        setLayout(new BorderLayout(20,20));
        selectionPanels = new ArrayList<>();

        panelMaisons = new JPanel();
        panelMaisons.setLayout(new GridLayout(2, 5, 10, 10));
        
        FactoryCIUP factory = FactoryCIUP.getInstance();
        factory.CreationObjets();
        
        lesMaisons = factory.getLesMaisons();

        try 
		{
			maisonFR = new PanelSelection(lesMaisons.get(0), lesMaisons.get(0).getNom(), "img/" + lesMaisons.get(0).getNom() );
			maisonES = new PanelSelection(lesMaisons.get(1), lesMaisons.get(1).getNom(), "img/" + lesMaisons.get(1).getNom() );
			maisonJP = new PanelSelection(lesMaisons.get(2), lesMaisons.get(2).getNom(), "img/" + lesMaisons.get(2).getNom() );
			maisonTU = new PanelSelection(lesMaisons.get(3), lesMaisons.get(3).getNom(), "img/" + lesMaisons.get(3).getNom() );
			maisonKR = new PanelSelection(lesMaisons.get(4), lesMaisons.get(4).getNom(), "img/" + lesMaisons.get(4).getNom() );
			maisonInternationale = new PanelSelection(lesMaisons.get(5), lesMaisons.get(5).getNom(), "img/" + lesMaisons.get(5).getNom() ); 
			
            selectionPanels.add(maisonInternationale);
            selectionPanels.add(maisonFR);
            selectionPanels.add(maisonES);
            selectionPanels.add(maisonJP);
            selectionPanels.add(maisonTU);
            selectionPanels.add(maisonKR);
			
			for (PanelSelection panel : selectionPanels) {
	            panelMaisons.add(panel);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
        add(panelMaisons, BorderLayout.CENTER);
        
        JPanel panelActions = new JPanel();
        panelActions.setLayout(new BoxLayout(panelActions, BoxLayout.Y_AXIS));
        JLabel confirmation = new JLabel("Création de la liste");
        btnSelectAll = new JButton("Tout sélectionner");
        
        btnConfirm = new JButton("Confirmer");
        btnCancel = new JButton("Annuler");
        
        panelActions.add(btnSelectAll);
        
        panelActions.add(Box.createVerticalStrut(250));
        panelActions.add(confirmation);
        panelActions.add(btnConfirm);
        panelActions.add(btnCancel);
 
        JPanel espace = new JPanel();
        espace.setPreferredSize(new Dimension(0, 20));
        
        add(espace, BorderLayout.SOUTH);
        add(panelActions, BorderLayout.EAST);
        
        //ECOUTEURS
        EcouteurToutSelect ecouteurToutSelect = new EcouteurToutSelect(selectionPanels);
        btnSelectAll.addActionListener(ecouteurToutSelect);
        
        EcouteurConfirmation ecouteur = new EcouteurConfirmation(this, fenetre);
        btnConfirm.addActionListener(ecouteur);
    }
    
	//-------------------------
	// GETTERS
	//-------------------------


    public List<PanelSelection> getSelectionPanels() {
		return selectionPanels;
	}
    
	public JButton getBtnConfirm() {
		return btnConfirm;
	}
	
	/**
	 * Méthode main pour tester la vue indépendamment.
	 * Crée une fenêtre maximisée avec la vue d'ajout et son écouteur de confirmation.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
        JFrame fenetre = new JFrame("Création de la liste");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fenetre.setSize(xSize,ySize);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VueAjoutMaisonListe vueAjout = new VueAjoutMaisonListe(fenetre);
        fenetre.add(vueAjout);
        fenetre.setVisible(true);
    }
}
