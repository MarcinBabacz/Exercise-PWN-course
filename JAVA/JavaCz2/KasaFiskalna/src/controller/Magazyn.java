package controller;

import java.util.HashMap;

public class Magazyn {

	public HashMap<Integer,Produkt> mapaProduktow = new HashMap<>();
	public void newProdukt(String nazwa, int cena, int kod){
		
		Produkt nowyObject = new Produkt(nazwa,cena,kod);
		nowyObject.nazwa = nazwa;
		nowyObject.cena = cena;
		nowyObject.kod = kod;
		mapaProduktow.put(nowyObject.kod, nowyObject);
	}
}
