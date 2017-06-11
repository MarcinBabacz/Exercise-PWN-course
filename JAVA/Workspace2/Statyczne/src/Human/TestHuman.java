package Human;

public class TestHuman {

	
	
	public static void main(String[] args){
		Human adam = new Human("Adam", 1.86);
		Human ewa = new Human("Ewa", 1.76);
		Human bob = new Human("Bob", 1.96);
		Human ray = new Human("Ray", 1.56);
		Human.avgHeight = (adam.getHeight()+ewa.getHeight()+bob.getHeight()+ray.getHeight())/Human.humanCounter;
		System.out.println("Iloœæ ludzi: " + Human.humanCounter);
		System.out.println("Œrednia wzrostu to: " + Human.avgHeight);
	}

}
