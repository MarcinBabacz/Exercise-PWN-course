package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PierwszaApp implements ActionListener{

	public static void main(String[] args){
		
		/*JFrame jF = new JFrame("PierwszaApp");
		jF.setSize(500,300);
		jF.setLayout(null);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		jF.setVisible(true);*/
		/*jF.setVisible(true);*/
		DziedziczyApp jL = new DziedziczyApp("DziedziczyApp", 700, 700);
		jL.addButton();
		jL.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
