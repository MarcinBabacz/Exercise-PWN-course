package Dodawanie;

public class Pracownik {

	String imie;
	String nazwisko;
	int wiek;
	
	Pracownik(){
		this.imie = "";
		this.nazwisko = "";
		this.wiek = 0;
	}
	Pracownik(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = 0;
	}
	Pracownik(String imie, String nazwisko, int wiek){
		this(imie, nazwisko);
		this.wiek = wiek;
	}

}
