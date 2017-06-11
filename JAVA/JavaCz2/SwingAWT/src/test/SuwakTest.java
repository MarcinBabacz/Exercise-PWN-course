package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SuwakTest extends JFrame{
JSlider suwak;
public SuwakTest(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		suwak = new JSlider(JSlider.VERTICAL, 0 , 50 , 25);
		suwak.setBounds(50, 50, 200, 200);
		add(suwak);
		
		
	}
}
