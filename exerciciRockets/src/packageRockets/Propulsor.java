package packageRockets;

/**
 * Classe Propulsor, controla 3 tipus de potència (l'Actual, la Màxima i l'Objectiu), per a saber què ha de fer segons el
 * mètode que rebi i calcular els canvis en cada iteració (1000 milis) del fil.
 * 
 * La propietat acció permet utilitzar un troç del codi o un altre, segons si es vol accelerar o frenar. 
 * 
 * @author Enric Comes
 *
 */

public class Propulsor extends Thread{
	
	private int nomPropulsor;
	private int potenciaActual;
	private int potenciaMaxima;
	private int potenciaObjectiu;
	private String accio;
	
	public int getPotenciaActual() {
		return potenciaActual;
	}

	public void setPotenciaActual(int potenciaActual) {
		this.potenciaActual = potenciaActual;
	}

	public int getPotenciaMaxima() {
		return potenciaMaxima;
	}

	public void setPotenciaMaxima(int potenciaMaxima) {
		this.potenciaMaxima = potenciaMaxima;
	}

	public int getPotenciaObjectiu() {
		return potenciaObjectiu;
	}

	public void setPotenciaObjectiu(int potenciaObjectiu) {
		this.potenciaObjectiu = potenciaObjectiu;
	}

	//Constructor
	public Propulsor(int nomPropulsor, int potenciaMaxima) {
		this.nomPropulsor = nomPropulsor; //Per a distinguir cada Propulsor per un número
		this.potenciaMaxima = potenciaMaxima;
		potenciaActual = 0; //Es deixa la potència actual en 0, perquè ho demana l'exercici
		accio="";//Es deixa iniciada la variable d'acció sense dir quina acció ha de fer, això evita possibles errors dels fils
	}
	
	public int getNomPropulsor() {
		return nomPropulsor;
	}

	public void setNomPropulsor(int nomPropulsor) {
		this.nomPropulsor = nomPropulsor;
	}

	public String getAccio() {
		return accio;
	}

	public void setAccio(String accio) {
		this.accio = accio;
		
	}

	public void run() {
		
		boolean inversa=true;
		
		//Bucle infinit, sols s'acaba al sortir del programa i no es fa res realment si no té encara cap acció
		while(true) {
			
			//Si la acció és accelerar:
			if(accio.equals("accelerar")) {
				
				if(potenciaActual == potenciaMaxima) {
					
					System.out.println("Propulsor nº "+nomPropulsor + "- Potència Actual: "+potenciaActual
							+ "- Potència Maxima: "+potenciaMaxima
							+ "- Potència Objectiu: "+potenciaObjectiu
							+" - PROPULSOR AL MÀXIM.");
					
					accio=""; //S'elimina l'acció
				
				}else if(potenciaActual < potenciaMaxima) {
					
					if(potenciaActual < potenciaObjectiu) {
						potenciaActual+=10;
						
						System.out.println("Propulsor nº "+nomPropulsor + "- Potència Actual: "+potenciaActual
								+ "- Potència Maxima: "+potenciaMaxima
								+ "- Potència Objectiu: "+potenciaObjectiu
								+ " - puja 10 punts (" + potenciaActual +")");
					}

					else{
						
						System.out.println("Propulsor nº "+nomPropulsor + "- Potència Actual: "+potenciaActual
								+ "- Potència Maxima: "+potenciaMaxima
								+ "- Potència Objectiu: "+potenciaObjectiu
								+ " - té la potència actual igualada amb la potència objectiva.");
						
						accio=""; //S'elimina l'acció
					}
					
				}
				
			}
			
			//Si la acció és frenar:
			else if(accio.equals("frenar")) {
				
				if(inversa) {
					potenciaActual = potenciaMaxima;
				}
				
				if(potenciaActual == 0) {
					System.out.println("Propulsor nº "+nomPropulsor + "- Potència Actual: "+potenciaActual
							+ "- Potència Maxima: "+potenciaMaxima
							+ "- Potència Objectiu: "+potenciaObjectiu
							+ " - PROPULSOR APAGAT.");
					
					accio=""; //S'elimina l'acció
				
				}else if(potenciaActual > 0) {
					
					inversa=false;	//per anar a la inversa de potencia actual (del màxim a 0)			
					if(potenciaActual > potenciaObjectiu) {
						potenciaActual-=10;
						System.out.println("Propulsor nº "+nomPropulsor + "- Potència Actual: "+potenciaActual
								+ "- Potència Maxima: "+potenciaMaxima
								+ "- Potència Objectiu: "+potenciaObjectiu
								+ " - baixa 10 punts (" + potenciaActual +")");
					}
					else{
						System.out.println("Propulsor nº "+nomPropulsor + "- Potència Actual: "+potenciaActual
								+ "- Potència Maxima: "+potenciaMaxima
								+ "- Potència Objectiu: "+potenciaObjectiu
								+ " - baixa 10 punts (" + potenciaActual +")"
								+ " - té la potència actual igualada amb la potència objectiva.");
						
						accio=""; //S'elimina l'acció
						inversa=true; //per resetejar la potencia Actual si tornesim a frenar després d'una acceleració	
					}
					
				}
				
			}
			
			//Es deixa còrrer 1000 milis / 1 segon per a veure els canvis de manera més senzilla			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		
	}

}
