package packageRockets;

/**
 * FASE 1:
 * Volem fer un software de carreres de coets.
 * Un coet està identificat per un codi de 8 caràcters i un número de propulsors.
 * Realitza els següents passos:
 * 
 * 1. Creem dos coets amb els codis "x" i "LDSFJA32". El primer coet tindrà tres propulsors i el segon sis propulsors.
 * 
 * 2. Mostrar a pantalla el codi dels coets i el número de propulsors que té.
 * 
 * @author Enric Comes
 *
 */

public class RocketsFase1 {

	public static void main(String[] args) {
		
		Coet_F1 coet1 = new Coet_F1("x", 3);
		Coet_F1 coet2 = new Coet_F1("LDSFJA32", 6);
		
		System.out.println(coet1.toString()+"\n"+coet2.toString());

		
	}

}
