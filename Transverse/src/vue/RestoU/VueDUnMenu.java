package vue.RestoU;
import modele.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controller.RestoU.EcouteurComboBox;

public class VueDUnMenu extends JPanel{
	JPanel plats;
	ArrayList<String> lesFiltres;
	MenuRestoUParCategorie leMenu;
	
	public VueDUnMenu(MenuRestoUParCategorie leMenu) {
		this.leMenu=leMenu;
		
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		lesFiltres=f.getLesFiltres();
		lesFiltres.add(0, "Tous");
		
		plats=new JPanel();
		this.plats.setLayout(new FlowLayout(FlowLayout.LEADING));
		for(Plat plat : leMenu.getSesPlats()) {
			this.plats.add(new VuePlat(plat));
		}
		this.setLayout(new BorderLayout());
		this.add(plats,BorderLayout.CENTER);
		
		String[] filtres=new String[lesFiltres.size()];
		filtres=this.lesFiltres.toArray(filtres);
		
		JComboBox<String> box=new JComboBox<String>(filtres);
		box.setPreferredSize(new java.awt.Dimension(150,50));
		box.addActionListener(new EcouteurComboBox(this));
		JPanel p=new JPanel(new FlowLayout());
		p.add(box);
		p.setBackground(new Color(78, 94, 99));
		this.add(p,BorderLayout.WEST);
		this.setBorder(BorderFactory.createEmptyBorder(0,0,0,150));
		
		
	}
	
	public void FiltrerPar(String filtre) {
		this.plats.removeAll();
		if(filtre==null|| filtre.equals("Tous")) {
			for(Plat plat : leMenu.getSesPlats()) {
				this.plats.add(new VuePlat(plat));
			}
		}
		else {
			for(Plat plat:leMenu.getSesPlats()) {
				if(plat.getAllergenes().contains(filtre)) {
					this.plats.add(new VuePlat(plat));
				}
			}
			
		}
		this.plats.revalidate();
		this.plats.repaint();
	}
	
	public static void main(String[] args) {
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		JFrame fenetre=new JFrame();
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth());
		int ySize = ((int) tk.getScreenSize().getHeight());
		fenetre.setSize(xSize-100,ySize-100);
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
