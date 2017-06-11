package Dodawanie;

public class NowaKlasa {
	double a;
	char b;
	NowaKlasa(double a){
		this.a = a;
	}
	NowaKlasa(char b){
		this.b = b;
		
	}
	NowaKlasa(double a,char b){
	this(a);
	this.b = b;
	
	}
	NowaKlasa(char b, double a){
	this(a,b);
	
	}
	

}
