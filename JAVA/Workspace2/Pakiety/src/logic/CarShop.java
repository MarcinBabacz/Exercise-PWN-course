package logic;
import app.Model.Car;
import example.Printer;
public class CarShop {
	
	public static void main(String[] args){
		Car car1 = new Car(2010, "Audi", "A4", "Czarny");
		Printer druk = new Printer();
		druk.printText();
		druk.setText("Ernest");
		druk.printText();
		
	}

}
