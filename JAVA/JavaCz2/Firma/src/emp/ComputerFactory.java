package emp;

public class ComputerFactory {

	Computer createNewComputer(String procesor, int pamiec){
		Computer nowyComputer = new Computer();
		nowyComputer.procesor = procesor;
		nowyComputer.memory = pamiec;
		return nowyComputer;
	}
}
