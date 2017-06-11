package emp;

public class Company {
 
	public static void main(String[] args){
		/*Employee pracownik1 = new Employee();
		Employee pracownik2 = new Employee();
		Employee pracownik3 = new Employee();
		pracownik1.imie = "Ernest";
		pracownik1.nazwisko = "Krystian";
		pracownik1.rokUrodzenia = 1986;
		pracownik1.stazPracy = 20;
		pracownik2.imie = "Damian";
		pracownik2.nazwisko = "Krystian";
		pracownik2.rokUrodzenia = 1998;
		pracownik2.stazPracy = 1;
		pracownik3.imie = "Monika";
		pracownik3.nazwisko = "Krystian";
		pracownik3.rokUrodzenia = 1996;
		pracownik3.stazPracy = 0;
		System.out.println(pracownik1.imie+ " " + pracownik1.nazwisko + " " + pracownik1.rokUrodzenia + " " + pracownik1.stazPracy );
		System.out.println(pracownik2.imie+ " " + pracownik2.nazwisko + " " + pracownik2.rokUrodzenia + " " + pracownik2.stazPracy  );
		System.out.println(pracownik3.imie+ " " + pracownik3.nazwisko + " " + pracownik3.rokUrodzenia + " " + pracownik3.stazPracy  );
		pracownik1.rozmiawia();
		/*String rozmawia = pracownik2.rozmiawia();
		System.out.println("W jakim jêzyku rozmawia pracownik1" + " " +pracownik1.rozmiawia());
		System.out.println("W jakim jêzyku rozmawia pracownik2" + " " +rozmawia);*/
		/*Calc kalkulator = new Calc();
		double wynik = kalkulator.add(4, 6);
		System.out.println("Wynik dzia³ania: " + wynik);
		kalkulator.addAndPrint(3, 7);
		Computer nowyComputer = new Computer(1000,"386");
		ComputerUpdate update = new ComputerUpdate();
		nowyComputer.printInfo();
		nowyComputer.memory = 1024;
		nowyComputer.procesor = "i5";
		update.addMemory(nowyComputer, 1024);
		System.out.println(nowyComputer.memory);
		ComputerFactory fabryka = new ComputerFactory();
		Computer nowyComp2 = fabryka.createNewComputer("i7", 8000);
		System.out.println(nowyComp2.memory);*/
		Computer nowyComp = new Computer(1000, "i5");
		System.out.println(nowyComp.procesor);
		System.out.println(nowyComp.printInfo(23));
		
	}
}
