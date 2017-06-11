package Zadania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JAS4 extends JFrame implements ActionListener{
JButton bOK, bOK2;
String temp, tempB2;
String temp2, temp2B2;
	public JAS4(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temp = "NOK";
		tempB2 = "NOK";
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
	
		if(e.getSource().equals(bOK)){
		temp2 = bOK.getText();
		bOK.setText(temp);
		temp = temp2;
		}else if(e.getSource().equals(bOK2)){
		temp2B2 = bOK2.getText();
		bOK2.setText(tempB2);
		tempB2 = temp2B2;
		}
	}
}
