package superTest;

public class Notebook extends Computer {
	
	private int batteryCapacity;

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public void coolDown(){
		super.coolDown();
		turboCooldown();
	}
	public void turboCooldown(){
		setCpuTemperature(getCpuTemperature() - 2);
	}
	public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity){
		super(cpuTemperature,ramMemory);
		setBatteryCapacity(batteryCapacity);
	}
	

}
