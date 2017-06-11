package hurt;

public class Wheel extends Kolo{
	private static int counter;
	public Wheel(String nazwaProducenta, String model, int szerokosc, int rozmiar){
		counter++;
		setProducent(nazwaProducenta);
		setModel(model);
		setSzerokosc(szerokosc);
		setRozmiar(rozmiar);
		setSeria("Wheel" + nazwaProducenta+counter);
		setIdNumber("Serial" + getSeria());
		
	}
}
