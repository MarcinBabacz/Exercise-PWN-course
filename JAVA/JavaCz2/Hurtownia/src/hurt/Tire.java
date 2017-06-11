package hurt;

public class Tire extends Kolo {
	
	private static int counter;
	
	public Tire(String nazwaProducenta, String model, int szerokosc, int rozmiar){
		counter++;
		setProducent(nazwaProducenta);
		setModel(model);
		setSzerokosc(szerokosc);
		setRozmiar(rozmiar);
		setSeria("TIRE" + nazwaProducenta+counter);
		setIdNumber("Serial" + getSeria());
		
	}
}
