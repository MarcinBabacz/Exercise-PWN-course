package model;

public class TestPoly {
	public static void main(String[] args){
		
		Organizm facet = new Zwierze("Cz�owiek", false);
		Organizm facet2 = new Zwierze("Cz�owiek", false);
		Organizm kobieta = new Zwierze("Cz�owiek", true);
		Organizm grypa = new Bakteria();
		facet.interactionWith(kobieta);
		Organizm chmiel = new Roslina("Chmiel");
		facet.interactionWith(chmiel);
		facet.interactionWith(facet2);
		grypa.interactionWith(facet);
		
		
	}
}
