package Zadania;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JAS19 extends JFrame implements ChangeListener{  
	JLabel jL3;
	JSlider slider;
public JAS19(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		slider = new JSlider(JSlider.VERTICAL, 0, 100, 0); 
		slider.setBounds(20, 30, 50, 200);
		slider.addChangeListener(this);
		jL3 = new JLabel("0");
		jL3.setBounds(150, 100, 100, 30);
		 
		add(slider);  
		add(jL3);
}  

@Override
public void stateChanged(ChangeEvent arg0) {
	// TODO Auto-generated method stub
	jL3.setText(String.valueOf(slider.getValue()));
}  
} 