package test;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestTable extends JFrame{
	
	JTable tb;
	public TestTable(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[][] tbDane = {{"Ernest", "Krystian", "POL"}, 
				{"Monika", "Zawadzka", "POL"}, {"Stefan", "Morgen", "GER"}};
		String[] tbNazwy = {"Imie", "Nazwisko", "Kraj"};
		tb = new JTable(tbDane,tbNazwy);
		tb.setBounds(30 , 40 , 200, 300);
		JScrollPane sp = new JScrollPane(tb);
		add(tb);
		this.add(sp);
		
		
	}
}
