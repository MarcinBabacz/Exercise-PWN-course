package model;

public class Calc {

	public String wynik(Float pier, Float drug, String znak ){
		
		switch(znak){
		case "/": 
		return "tw�j wynik dzielenia to: " + (pier/drug);
		case "*":
		return "tw�j wynik mno�enia to: " + (pier*drug);
		case "+":
		return "tw�j wynik dodawania to: " + (pier+drug);
		case "-":
		return "tw�j wynik odejmowania to: " + (pier-drug);
		default:
		return "Co� wpisa�e� �le";
	}
}
}
