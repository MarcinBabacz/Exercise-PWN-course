package Dodawanie;

public class TestDodawania {

	public static void main(String[] args){
		Dodawanie suma = new Dodawanie();
		System.out.println(suma.dodaj(2, 3));
		System.out.println(suma.dodaj(3f, 4f));
		System.out.println(suma.dodaj(5d, 6d));
	}
}
