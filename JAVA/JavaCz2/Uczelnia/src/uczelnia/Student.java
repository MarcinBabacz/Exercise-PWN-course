package uczelnia;

public class Student {
	private String imie;
	private String nazwisko;
	private int nr_indeksu;
	public static int studentCounter;
	public Student(String imie, String nazwisko){
		studentCounter++;
		this.imie = imie;
		this.nazwisko = nazwisko;
		nr_indeksu = studentCounter;
		if(studentCounter>=2){
			System.out.println("Na uczelni jest ju¿ " + studentCounter + " studentów");
		}
	}
}
