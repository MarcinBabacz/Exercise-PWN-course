package model;

public class Calc {

	public String wynik(Float pier, Float drug, String znak ){
		
		switch(znak){
		case "/": 
		return "twój wynik dzielenia to: " + (pier/drug);
		case "*":
		return "twój wynik mno¿enia to: " + (pier*drug);
		case "+":
		return "twój wynik dodawania to: " + (pier+drug);
		case "-":
		return "twój wynik odejmowania to: " + (pier-drug);
		default:
		return "Coœ wpisa³eœ Ÿle";
	}
}
}
