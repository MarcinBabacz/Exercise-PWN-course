package Zadania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JAS3 extends JFrame implements ActionListener{
JButton bOK, bOK2;
String temp;
String temp2;
	public JAS3(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temp = "NOK";
		temp2 = "";
		bOK = new JButton("OK");
		bOK.setBounds(50, 50, 100, 30);
		bOK.addActionListener(this);
		this.add(bOK);
		bOK2 = new JButton("OK");
		bOK2.setBounds(50, 100, 100, 30);
		bOK2.addActionListener(this);
		this.add(bOK2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		/*temp2 = bOK.getText();
		bOK.setText(temp);
		temp = temp2;*/
	}
}
