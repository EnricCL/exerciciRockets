package packageRockets;

/**
 * La classe Coet té per a emmagatzemar propietats de cada propulsor i per generar-los com a classe Propulsor
 * 
 * També té un mètode accelerar i frenar, amb una propietat en el que s'indica l'acció de la mateixa per a que 
 * l'algoritme de la classe Propulsor sàpiga si ha de fer una cosa o l'altre.
 * 
 * Els valors enters que es passen en aquests mètodes estan pensats per si, en un futur, es vol controlar el 
 * % d'acceleració o de frenada (en aquest exercici no faria falta realment passar cap paràmetre per fer el mateix),
 * aquí sols es passa per a accelerar un valor 100 de potència objectiu i un valor 0 per a frenar.
 * 
 * @author Enric Comes
 *
 */

public class Coet_F3 {

	private String codi;
	protected Propulsor propulsor1, propulsor2, propulsor3, propulsor4, propulsor5, propulsor6;
	private int objectiu1, objectiu2, objectiu3, objectiu4, objectiu5, objectiu6;
	int nomPropulsor1=1,nomPropulsor2=2,nomPropulsor3=3,nomPropulsor4=4,nomPropulsor5=5,nomPropulsor6=6;

	
	public Coet_F3(String codi, int propulsor1, int propulsor2, int propulsor3) {
		
		//Per a construir un coet amb 3 propulsors
		
		this.codi = codi;
		this.propulsor1 = new Propulsor (nomPropulsor1, propulsor1);
		this.propulsor2 = new Propulsor (nomPropulsor2, propulsor2);
		this.propulsor3 = new Propulsor (nomPropulsor3, propulsor3);
		
		
	}
	
	public Coet_F3(String codi, int propulsor1, int propulsor2, int propulsor3, int propulsor4, int propulsor5, int propulsor6) {
		
		//Pensat per a fer l'exercici per a 6 propulsors, no s'utilitza en aquest cas, encara que es pot portar a la pràctica perfectament
		
		this.codi = codi;
		this.propulsor1 = new Propulsor (nomPropulsor1, propulsor1);
		this.propulsor2 = new Propulsor (nomPropulsor2, propulsor2);
		this.propulsor3 = new Propulsor (nomPropulsor3, propulsor3);
		this.propulsor4 = new Propulsor (nomPropulsor4, propulsor4);
		this.propulsor5 = new Propulsor (nomPropulsor5, propulsor5);
		this.propulsor6 = new Propulsor (nomPropulsor6, propulsor6);
		
	}
	
	public void accelerar(int objectiu1, int objectiu2, int objectiu3, String accelerar) {
		
		//S'indica quins són les potències objectiu a arribar i l'acció que comporta en cada propulsor
		
		propulsor1.setPotenciaObjectiu(objectiu1);
		propulsor2.setPotenciaObjectiu(objectiu2);
		propulsor3.setPotenciaObjectiu(objectiu3);
		propulsor1.setAccio(accelerar);
		propulsor2.setAccio(accelerar);
		propulsor3.setAccio(accelerar);
		
		
	}
	
	public void frenar(int objectiu1, int objectiu2, int objectiu3, String frenar) {
		
		//S'indica quins són les potències objectiu a arribar i l'acció que comporta en cada propulsor
		
		propulsor1.setPotenciaObjectiu(objectiu1);
		propulsor2.setPotenciaObjectiu(objectiu2);
		propulsor3.setPotenciaObjectiu(objectiu3);
		propulsor1.setAccio(frenar);
		propulsor2.setAccio(frenar);
		propulsor3.setAccio(frenar);
	}
	
}
