package packageRockets;

import java.util.Scanner;

/**
 * FASE 3:
 * 
 * Per la fase 3 modificarem els propulsors afegint també una potencia actual. Un propulsor tindrà una potència màxima
 * (no la pot superar) i una potencia actual (la potencia que té el propulsor en aquell moment). Tots els propulsors
 * tindran una potència actual que començarà amb 0.
 *   
 *  El coet tindrà dos mètodes, accelerar o frenar. Aquests mètodes indicaran la potència objectiu de cada propulsor,
 *  tingues en compte que cada propulsor ha de saber si ha d'augmentar o baixar d'un en un la seva potencia i de forma
 *  independent (threads!).
 *  
 *  Com a resultat hauries de veure per pantalla cada propulsor amb el fil adequat pujant o baixant la potencia segons 
 *  hagis indicat a l'ordre d'accelerar o frenar 
 * 
 * @author Enric Comes
 *
 */

public class RocketsFase3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String seleccio="", accio="";
				
		Coet_F3 coet1 = new Coet_F3("32WESSDS",50,30,80); //Es fa 1 coet amb 3 propulsors
		
		//S'inicien 3 fils, 1 fil per a cada propulsor
		coet1.propulsor1.start();
		coet1.propulsor2.start();
		coet1.propulsor3.start();
		
		while(true){
		
			//Es pot anar demanant que acceleri, freni o que finalitzi el programa
			System.out.println("Què vols fer? (1: Accelerar / 2: Frenar / 3: Finalitzar)");
			seleccio=entrada.nextLine();
			
			//Menú senzill
			//Cada opció mostra per consola què hem decidit, i passa paràmetres en un mètode
			if(seleccio.equals("1")) {
				System.out.println("ACCELERAR"); 
				accio = "accelerar";
				coet1.accelerar(100,100,100,accio); 
				
			}else if(seleccio.equals("2")) {
				System.out.println("FRENAR"); 
				accio= "frenar";
				coet1.frenar(0,0,0,accio);
				
			}else if(seleccio.equals("3")) {
				System.out.println("Programa finalitzat."); //Es tanca el programa
				System.exit(0);
			}else {
				System.out.println("Escriu 1, 2 o 3."); //Si no és cap de les opcions, t'ho torna a demanar
			}
				
		}
	
	}

}
