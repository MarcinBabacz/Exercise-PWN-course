package superTest;

public class SuperTest {

	
	public static void main(String[] args){
		Notebook asus = new Notebook(34,12,50);
		System.out.println("Temperatura procesora: " + asus.getCpuTemperature());
		System.out.println("Pami�c : " + asus.getRamMemory());
		System.out.println("Pojemnos� bateri: " + asus.getBatteryCapacity());
		asus.turboCooldown();
		System.out.println("Temperatura procesora: " + asus.getCpuTemperature());
	}
}
