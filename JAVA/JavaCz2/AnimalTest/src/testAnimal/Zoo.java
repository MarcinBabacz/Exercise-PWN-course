package testAnimal;

public class Zoo {
	
	public static void main(String[] args){
		Animal dog = new Dog("Burek");
		Animal kot = new Cat("Jacek");
		Animal kotopies = new Animal("Kotopies");
		dog.giveSound();
		kot.giveSound();
		kotopies.giveSound();
	}
	
}
