package model;

public abstract class Organizm {
	private String nazwaGatunku;
	private boolean female;

	public String getNazwaGatunku() {
		return nazwaGatunku;
	}

	public void setNazwaGatunku(String nazwaGatunku) {
		this.nazwaGatunku = nazwaGatunku;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}
	abstract public void interactionWith(Organizm org);
	
	
	
	
}
