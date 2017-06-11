package testAnimal;

public class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	@Override
	public void giveSound(){
		System.out.println("Jestem kot " + getName());
	}
}
