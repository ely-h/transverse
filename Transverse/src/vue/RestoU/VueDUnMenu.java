package vue.RestoU;
import modele.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VueDUnMenu extends JPanel{
	
	public VueDUnMenu(MenuRestoUParCategorie leMenu) {
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		for(Plat plat : leMenu.getSesPlats()) {
			this.add(new VuePlat(plat));
		}
		
		
	}
	public static void main(String[] args) {
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		JFrame fenetre=new JFrame();
		fenetre.setSize(600,600);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		JPanel test=new JPanel();
		test.setLayout(new BorderLayout());
		VueDUnMenu vueTest=new VueDUnMenu(f.getLesCategories().get(1));
		JScrollPane scrollPane = new JScrollPane(vueTest);
		
		test.add(scrollPane,BorderLayout.CENTER);
		
		fenetre.add(test);
	}
	

}
