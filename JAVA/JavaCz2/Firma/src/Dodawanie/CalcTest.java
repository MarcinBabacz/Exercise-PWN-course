package Dodawanie;

public class CalcTest {

	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.add(3, 4);
		calc.add(3, 4, 5);
		calc.sub(3, 4, 5);
		calc.sub(3, 4);
	}
}
