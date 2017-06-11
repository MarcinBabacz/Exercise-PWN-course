package superTest;

public class SuperTest {

	
	public static void main(String[] args){
		Notebook asus = new Notebook(34,12,50);
		System.out.println("Temperatura procesora: " + asus.getCpuTemperature());
		System.out.println("Pamiêc : " + asus.getRamMemory());
		System.out.println("Pojemnosæ bateri: " + asus.getBatteryCapacity());
		asus.turboCooldown();
		System.out.println("Temperatura procesora: " + asus.getCpuTemperature());
	}
}
