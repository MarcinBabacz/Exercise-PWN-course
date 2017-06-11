package model;

public class Zwierze extends Organizm{
	private String nazwa;
	@Override
	public void interactionWith(Organizm org) {
		// TODO Auto-generated method stub
		if(org instanceof Zwierze){
			if(org.getNazwaGatunku().equals(this.getNazwaGatunku()) && org.isFemale() != this.isFemale()){
				System.out.println("Kopulacja!!!");
			}
			else if(org.getNazwaGatunku().equals(this.getNazwaGatunku())){
				System.out.println("Piwo!!!");
			}
			else{
				System.out.println("Walka!!!");
			}
		}
		else if(org instanceof Roslina){
			System.out.println("Roœlina zjedzona!!!");	
		}
	}
	public Zwierze(String nazwaGat, boolean plec){
		setNazwaGatunku(nazwaGat);
		setFemale(plec);
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}
