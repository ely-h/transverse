package vue;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import modele.FactoryCIUP;
import vue.RestoU.*;

public class placeholder {
	public static void main(String[] args) {
		JFrame fenetre=new JFrame("Les Menus");
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth());
		int ySize = ((int) tk.getScreenSize().getHeight());
		fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fenetre.setSize(xSize,ySize);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BlocRestoU haut=new BlocRestoU();
		FactoryCIUP facto=FactoryCIUP.getInstance();
		facto.CreationObjets();
		VueDUnMenu vue=new VueDUnMenu(facto.getLesCategories().get(2));
		JPanel panel=new JPanel(new BorderLayout());
		panel.add(haut,BorderLayout.NORTH);
		panel.add(vue,BorderLayout.CENTER);
		fenetre.add(panel);
		fenetre.setVisible(true);
		
	}

}
