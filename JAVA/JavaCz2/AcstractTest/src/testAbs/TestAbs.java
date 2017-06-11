package testAbs;

public class TestAbs {

	
	public static void main(String[] args){
		
		Car auto = new Car();
		auto.setSpeed(4);
		auto.speedUp();
		auto.speedUp();
		auto.speedUp();
		auto.speedUp();
		System.out.println(auto.getSpeed());
	}
}
