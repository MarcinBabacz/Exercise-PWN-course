package view;

import model.Apple;

public class GroceryShop {

	
	public static void main(String[] args){
		Apple j1 = new Apple("Jab³ko Szampion");
		Apple j2 = new Apple("Warzywo: ", "Marchew");
		j1.printInfo();
		j2.printInfo();
	}
}
