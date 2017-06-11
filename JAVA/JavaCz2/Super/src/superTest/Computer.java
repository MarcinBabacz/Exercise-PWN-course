package superTest;

public class Computer {
private double cpuTemperature;
private int ramMemory;
public double getCpuTemperature() {
	return cpuTemperature;
}
public void setCpuTemperature(double cpuTemperature) {
	this.cpuTemperature = cpuTemperature;
}
public int getRamMemory() {
	return ramMemory;
}
public void setRamMemory(int ramMemory) {
	this.ramMemory = ramMemory;
}
public void coolDown(){
	setCpuTemperature(getCpuTemperature() - 1);
}
public Computer(double cpuTemperature, int ramMemory){
	setCpuTemperature(cpuTemperature);
	setRamMemory(ramMemory);
}
}
