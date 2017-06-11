package Zadania;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JAS14 extends JFrame{

	JLabel Jl;
	public JAS14(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(this, "Witaj w nowym programie");
		String imie = JOptionPane.showInputDialog("Podaj Imie");
		Jl = new JLabel("OK");
        Jl.setBounds(200,100, 200,75);
        Jl.setText("Witaj " + imie);
        Jl.setFont(new Font("Calbri", Font.BOLD, 25));
        add(Jl);
		setVisible(true);
	}
}
