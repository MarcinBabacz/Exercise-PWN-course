package Dodawanie;

public class Firma {

	public static void main(String[] args){
		Pracownik pra1 = new Pracownik();
		Pracownik pra2 = new Pracownik("Ernes", "Krystian");
		Pracownik pra3 = new Pracownik("Monika", "Kowalska", 45);
		System.out.println(pra1.imie + " " + pra1.nazwisko + " " + pra1.wiek);
		System.out.println(pra2.imie + " " + pra2.nazwisko + " " + pra2.wiek);
		System.out.println(pra3.imie + " " + pra3.nazwisko + " " + pra3.wiek);
	}
}
