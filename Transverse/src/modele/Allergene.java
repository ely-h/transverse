package modele;

import java.io.Serializable;

public class Allergene implements Serializable{
	private static final long serialVersionUID = 1L;
	String nom;
	
	public Allergene(String nom)
	{
		this.nom=nom;
	}
	
	public String getNom() {
		return nom;
	}

}
