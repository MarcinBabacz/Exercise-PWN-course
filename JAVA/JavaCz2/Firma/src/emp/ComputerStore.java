package emp;

public class ComputerStore {
public static void main(String[] args){
	ComputerFactory factory = new ComputerFactory();
	Computer comp1 = factory.createNewComputer("i5", 8195);
	Computer comp2 = factory.createNewComputer("AMD Ryzen1700", 16000);
	ComputerUpdate update = new ComputerUpdate();
	update.addMemory(comp1, 4000);
	comp1.printInfo();
	comp2.printInfo();
}
}
