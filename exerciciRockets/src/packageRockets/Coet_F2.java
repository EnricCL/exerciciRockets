package packageRockets;

import java.util.ArrayList;
import java.util.Iterator;

public class Coet_F2 {

	private String codi;
	
	private ArrayList<Integer> propulsors = new ArrayList<Integer>();

	public Coet_F2(String codi, int propulsor1, int propulsor2, int propulsor3) {
		this.codi = codi;
		propulsors.add(propulsor1);
		propulsors.add(propulsor2);
		propulsors.add(propulsor3);
	}
	
	public Coet_F2(String codi, int propulsor1, int propulsor2, int propulsor3, int propulsor4, int propulsor5, int propulsor6) {
		this.codi = codi;
		propulsors.add(propulsor1);
		propulsors.add(propulsor2);
		propulsors.add(propulsor3);
		propulsors.add(propulsor4);
		propulsors.add(propulsor5);
		propulsors.add(propulsor6);
	}

	@Override
	public String toString() {
		
		// Es fa iterator per emmagatzemar l'String amb el format d'Output que es demana		
		String resultat = "";
		boolean primer = true;
		Iterator<Integer> it = propulsors.iterator();
		Integer propulsorActual;
		while(it.hasNext()) {
			propulsorActual = it.next();
			if(primer) {
				resultat = Integer.toString(propulsorActual);
				primer=false;
			}
			else resultat = resultat + "," + Integer.toString(propulsorActual);
		}
		
		return "\n" + codi + ": " + resultat + "";
	}

	
	
}
