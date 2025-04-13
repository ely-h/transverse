package CIUP;
import java.util.*;

public class MaisonInternationale extends Maison {
	
	/*------------------------------------
	 * attributs
	 * ------------------------------------
	 */

	private ArrayList<String> servicesProposes=new ArrayList<String>();
	
	/*------------------------------------
	 * constructeur
	 * ------------------------------------
	 */
	
	public MaisonInternationale(String nom,Nationnalite nationnalite,double longitude, double lattitude, int nombreTotalChambres) {
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
	
	public String returnServices() {
		String s="";
		for(String service : this.servicesProposes) {
			s+=service+" ";
		}
		return s;
	}
	public String toString() {
		return super.toString()+"\n Voici les services proposes : "+returnServices();
	}

}