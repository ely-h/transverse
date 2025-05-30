package controller.RestoU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import modele.MenuRestoUParCategorie;
import vue.RestoU.PanelCategoriesMenuRestoU;
import vue.RestoU.VueDUnMenu;

public class EcouteurRetour implements ActionListener{
	ArrayList<MenuRestoUParCategorie> lesMenus;
	JPanel lePanel;
	
	public EcouteurRetour(JPanel p,ArrayList<MenuRestoUParCategorie> lesMenus) {
		this.lesMenus=lesMenus;
		this.lePanel=p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lePanel.removeAll();
		lePanel.add(new PanelCategoriesMenuRestoU());
		lePanel.revalidate();
		lePanel.repaint();
	}

}
