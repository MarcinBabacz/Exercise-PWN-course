package test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelTest extends JFrame{

	public LabelTest(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jLab = new JLabel("To jest przyk³adowy tekst");
		jLab.setBounds(50, 50, 150, 30);
		add(jLab);
	}
}
