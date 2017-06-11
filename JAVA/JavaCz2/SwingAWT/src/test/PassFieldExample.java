package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PassFieldExample extends JFrame {

	JPasswordField pass;
	public PassFieldExample(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pass = new JPasswordField("OK");
		pass.setBounds(50, 50, 100, 30);
		this.add(pass);
	}
}
