package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;



public class ColorChooser extends JFrame implements ActionListener{

	
	public ColorChooser(){
		JFrame f = new JFrame(); 
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Color c = JColorChooser.showDialog(this, "Nowe Okno",Color.blue);
	}

}
