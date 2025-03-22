package CIUP;
import java.util.*;

public class MaisonInternationale extends Maison {
	
	/*------------------------------------
	 * attributs
	 * ------------------------------------
	 */

	private ArrayList<String> servicesProposes;
	
	/*------------------------------------
	 * constructeur
	 * ------------------------------------
	 */
	
	MaisonInternationale(String nom,Nationnalite nationnalite,int longitude, int lattitude, int nombreTotalChambres) {
		super (nom,nationnalite,longitude,lattitude,nombreTotalChambres);
	}
	
	/*------------------------------------
	 * methodes
	 * ------------------------------------
	 */
	public ArrayList<String> getServicesProposes() {
		return this.servicesProposes;
	}
	
	public void addService(String service)
	{
		servicesProposes.add(service);
	}
	
	//retourne true si le service est dans la liste des servicesProposes
	public boolean estService(String service) {
		return servicesProposes.contains(service);
	}
	
	public ArrayList<String> getServices(){
		return servicesProposes;
	}

	

}