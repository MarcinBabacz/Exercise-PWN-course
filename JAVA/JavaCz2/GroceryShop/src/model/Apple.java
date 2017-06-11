package model;

public class Apple extends Fruit{
	private String odmiana;
	
	public Apple(String type, String odmiana){
		super(type);
		this.odmiana = odmiana;
	}
	public Apple(String odmiana){
		super("Owoc: ");
		this.odmiana = odmiana;
	}
	public void printInfo(){
		super.printInfo();
		System.out.println(odmiana);
	}
	
}
