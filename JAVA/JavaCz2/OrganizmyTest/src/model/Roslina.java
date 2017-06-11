package model;

public class Roslina extends Organizm{

	public Roslina(String nazwaGat){
		setNazwaGatunku(nazwaGat);
	}
	@Override
	public void interactionWith(Organizm org) {
		if(org instanceof Roslina){
			walczy(org);
		}
		else if(org instanceof Bakteria){
			symbioza(org);	
		}
		
	}
	public void walczy(Organizm org){
		System.out.println("Zwalcza!!!" + org.getNazwaGatunku());
	}
	public void symbioza(Organizm org){
		System.out.println("Roœlina w symbiozie z " + org.getNazwaGatunku());	
	}

}
