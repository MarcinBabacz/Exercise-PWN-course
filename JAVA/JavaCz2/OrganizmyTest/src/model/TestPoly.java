package model;

public class TestPoly {
	public static void main(String[] args){
		
		Organizm facet = new Zwierze("Cz³owiek", false);
		Organizm facet2 = new Zwierze("Cz³owiek", false);
		Organizm kobieta = new Zwierze("Cz³owiek", true);
		Organizm grypa = new Bakteria();
		facet.interactionWith(kobieta);
		Organizm chmiel = new Roslina("Chmiel");
		facet.interactionWith(chmiel);
		facet.interactionWith(facet2);
		grypa.interactionWith(facet);
		
		
	}
}
