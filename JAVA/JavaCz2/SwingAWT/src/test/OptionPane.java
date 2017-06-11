package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OptionPane extends JFrame{

	JLabel Jl;
	public OptionPane(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String imie = JOptionPane.showInputDialog("Podaj Imie");
		Jl = new JLabel("OK");
        Jl.setBounds(200,100, 200,75);
        Jl.setText("Witaj " + imie);
        add(Jl);
		setVisible(true);
	}
}
