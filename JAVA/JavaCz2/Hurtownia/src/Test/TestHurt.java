package Test;
import hurt.*;
public class TestHurt {

	
	public static void main(String[] args){
		Tire opona = new Tire("Pirelli", "R3", 195, 17);
		Tire opona2 = new Tire("Goodyear", "S5", 165, 18);
		System.out.println("Nr seryjny: " + opona.getIdNumber() + " Producent: " + opona.getProducent() + " Model: " + opona.getModel() + " Rozmiar: " + opona.getRozmiar() + " Szerokosc: "+ opona.getSzerokosc());
		System.out.println("Nr seryjny: " + opona2.getIdNumber() + " Producent: " + opona2.getProducent() + " Model: " + opona2.getModel() + " Rozmiar: " + opona2.getRozmiar() + " Szerokosc: "+ opona2.getSzerokosc());
	}
}
