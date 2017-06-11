package Zadania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JAS2 extends JFrame{
	JButton bOK;
	public JAS2(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bOK = new JButton("OK");
		bOK.setBounds(50, 50, 100, 30);
		this.add(bOK);
	}

}
