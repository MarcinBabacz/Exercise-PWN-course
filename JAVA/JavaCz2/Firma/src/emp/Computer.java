package emp;

public class Computer {
public int memory;
public String procesor;
public int kod;
public Computer(){
	memory = 0;
	procesor = "a";
}
public Computer(int memory, String procesor){
	this.memory = memory;
	this.procesor = procesor;
}
public Computer(int memo, String proc, int kod){
	this(memo,proc);
	this.kod = kod;
}
public void printInfo(){
	System.out.println("Komputer ma : " + memory + " i " + procesor);
}
public int printInfo(int ilosc){
	this.printInfo();
	return ilosc;
}
}