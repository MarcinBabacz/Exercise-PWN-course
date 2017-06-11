package gatunki;

import java.util.Scanner;

public class Gatunek {

	String nazwaRodzaju;
	String nazwaGatunkowa;
	int liczbaChromosomow;
	Chromosom[] chromosomy;
	Scanner rl;
	Gatunek(){
		nazwaRodzaju = "";
		nazwaGatunkowa = "";
		liczbaChromosomow = 0;
	}
	Gatunek(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow){
		this.nazwaRodzaju = nazwaRodzaju;
		this.nazwaGatunkowa = nazwaGatunkowa;
		this.liczbaChromosomow = liczbaChromosomow;
		chromosomy = new Chromosom[liczbaChromosomow];
	}
	
	void pritNazwGat(){
		System.out.println(nazwaRodzaju + " " +  nazwaGatunkowa);	
	}
	void liczChromo(){
		System.out.println("Liczba chromosomów:  " +  liczbaChromosomow);
	}
	void printInfo(){
		System.out.println(nazwaRodzaju + " " +  nazwaGatunkowa + " Liczba chromosomów:  " +  liczbaChromosomow);	
	}
	void addChromosoms(){
		rl = new Scanner(System.in);
		for(int i = 0; i<chromosomy.length; i++){
			System.out.println("Wprowadz d³ugoœæ ramion: " );
			int ramion = rl.nextInt();
			System.out.println("Wprowadz nr chromosomu: " );
			int numerchromo = rl.nextInt();
			Chromosom chromo = new Chromosom(ramion,numerchromo);
			chromosomy[i] = chromo;
		}
	}
	void printInfoChromo(){
		for(int i = 0; i<chromosomy.length;i++){
			chromosomy[i].printInfo();
		}

}
	
}
