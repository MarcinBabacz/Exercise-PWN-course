package hurt;

public class ExhaustPart extends Part{
	private static int counter;
	private boolean zgodna;
	public ExhaustPart(String nazwaProducenta, String model, boolean zgodna){
		counter++;
		setProducent(nazwaProducenta);
		setModel(model);
		this.zgodna = zgodna;
		setSeria("ExhaustPart" + nazwaProducenta+counter);
		setIdNumber("Serial" + getSeria());
		
	}
}
