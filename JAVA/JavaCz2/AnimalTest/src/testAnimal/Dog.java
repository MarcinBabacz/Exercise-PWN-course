package testAnimal;

public class Dog extends Animal{
 public Dog(String name){
	 super(name);
 }
 @Override
 public void giveSound(){
	 System.out.println("Jestem pies " + getName());
 }
}
