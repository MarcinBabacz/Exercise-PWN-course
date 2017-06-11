package Zadania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JAS5 extends JFrame implements ActionListener{
	JLabel jLab;
	JButton bAction;
	public JAS5(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jLab = new JLabel("Hello World");
		jLab.setBounds(50, 50, 150, 30);
		add(jLab);
		bAction = new JButton("Action");
		bAction.setBounds(50, 100, 100, 30);
		bAction.addActionListener(this);
		add(bAction);
		
	}
	@Override
	public void actionPerformed(ActionEvent l) {
		
		jLab.setText("Witaj Œwiecie!!!");
		
		
	}
}
