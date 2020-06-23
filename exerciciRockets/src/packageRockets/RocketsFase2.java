package packageRockets;

/**
 * FASE 2:
 * Volem millorar el software perquè el propulsor tingui una potència màxima.
 * Modifiquem en el main anterior:
 * 1. Creem dos coets amb els codis “32WESSDS” I “ ”. El primer coet tindrà tres propulsors (potència: 10,30,80)
 *  i el segon sis propulsors (potència: 30,40,50,50,30,10).
 *  2. Mostrar a pantalla el codi dels coets, el número de propulsors que té i la potència màxima de cada propulsor.
 *  Output:
 *  32WESSDS: 10,30,80
 *  LDSFJA32: 30,40,50,50,30,10 
 * 
 * @author Enric Comes
 *
 */

public class RocketsFase2 {

	public static void main(String[] args) {
		
		Coet_F2 coet1 = new Coet_F2("32WESSDS",10,30,80);
		Coet_F2 coet2 = new Coet_F2("LDSFJA32",30,40,50,50,30,10);
		
		System.out.println(coet1.toString()+coet2.toString());

	}

}
