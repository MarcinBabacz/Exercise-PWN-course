package Zadania;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JAS21 extends JFrame{

	public JAS21(String title, int szerokosc, int wysokosc){
		super(title);
		JButton jb = new JButton("OK");
		jb.setToolTipText("To jest tip do przycisku");
		jb.setBounds(30, 30, 100, 30);
		setSize(200, 200);
		setLayout(null);
		add(jb);
	
	}
}
