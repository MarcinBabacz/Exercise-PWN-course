package model;

public class Bakteria extends Organizm{

	@Override
	public void interactionWith(Organizm org) {
		if(org instanceof Roslina){
			symbioza(org);
		}
		else if(org instanceof Zwierze){
			zaraza(org);	
		}
	}
	
	public void symbioza(Organizm org){
		System.out.println("Bakteria w symbiozie z " + org.getNazwaGatunku());
	}
	public void zaraza(Organizm org){
		System.out.println("Bakteria zara¿a " + org.getNazwaGatunku());
	}

}
