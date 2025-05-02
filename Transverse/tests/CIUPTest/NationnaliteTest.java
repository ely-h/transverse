package CIUPTest;
import java.util.*;

import modele.*;

public class NationnaliteTest {
	private static void addEtudiant_EtudiantNonNull_AjouteEtudiantAPartirDuConstructeur() {
		Nationnalite nationnaliteTest=new Nationnalite("test");
		Etudiant etudiantTest=new Etudiant("","","",0,nationnaliteTest);
		assert (nationnaliteTest.getSesEtudiants().contains(etudiantTest)) : "L'étudiant n'a pas été ajouté à l'arrayList sesEtudiants";
		System.out.println("addEtudiant_EtudiantNonNull_AjouteEtudiantAPartirDuConstructeur passed");
	}
	
	private static void addEtudiant_EtudiantNull_ThrowsIllegalArgumentException () {
		try {
			Nationnalite nationnaliteTest=new Nationnalite("test");
			nationnaliteTest.AddEtudiant(null);
			assert false : "no exception thrown";
		}
		catch(IllegalArgumentException e) {
			System.out.println("addEtudiant_EtudiantNull_ThrowsIllegalArgumentException passed");
		}
		catch(Exception error) {
			assert false : "Expected IllegalArgumentException";
		}
	}
	
	public static void main(String[] args) {
		addEtudiant_EtudiantNonNull_AjouteEtudiantAPartirDuConstructeur();
		addEtudiant_EtudiantNull_ThrowsIllegalArgumentException();
		System.out.println("All tests passed");
	}

}
