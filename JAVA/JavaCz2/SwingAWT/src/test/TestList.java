package test;

import javax.swing.JFrame;
import javax.swing.JList;

public class TestList extends JFrame{
	JList lista;
	public TestList(String title, int szerokosc, int wysokosc){	
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] tab = {"Ernest", "Krystian", "Monika"};
		lista = new JList(tab);
		lista.setBounds(20, 20, 300, 200);
		add(lista);
		
		
	}
}
