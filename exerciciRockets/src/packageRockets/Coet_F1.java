package packageRockets;

public class Coet_F1 {

	private String codi;
	
	private int propulsors;

	public Coet_F1(String nom, int propulsors) {
		this.codi = nom;
		this.propulsors = propulsors;
	}

	@Override
	public String toString() {
		return "Coet codi: " + codi + ", propulsors: " + propulsors + ".";
	}
	
	
}
