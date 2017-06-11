package controller;

public class Produkt {
public String nazwa;
public int cena;
public int kod;
	Produkt(){
		nazwa = "";
		cena = 0;
		kod = 0;
	}
	Produkt(String _nazwa, int _cena, int _kod){
		nazwa = _nazwa;
		cena = _cena;
		kod = _kod;
	}
}
