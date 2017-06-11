package controller;

import java.util.HashMap;
import java.util.Scanner;

public class Kasa {

	public static void main(String[] args){
		Scanner rl = new Scanner(System.in);
		Magazyn magazyn = new Magazyn();
		magazyn.newProdukt("pomidor", 2, 1);
		magazyn.newProdukt("chleb", 2, 2);
		magazyn.newProdukt("ser", 2, 3);
		magazyn.newProdukt("sok", 2, 4);
		System.out.println(magazyn.mapaProduktow.get(3).nazwa);
		
		while(true){
			System.out.println("Podaj produkt jaki chesz kupiæ: ");
			String pro = rl.nextLine();
			//if()
			
		}	
	}	
}
