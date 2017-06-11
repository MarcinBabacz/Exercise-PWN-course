package Zadania;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JAS20 extends JFrame implements ChangeListener{
	JSlider slider;
	JSpinner spiner;
	public JAS20(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		slider = new JSlider(JSlider.VERTICAL, 0, 100, 0); 
		slider.setBounds(20, 30, 50, 200);
		slider.addChangeListener(this);
		add(slider);  
		spiner = new JSpinner(new SpinnerNumberModel(slider.getValue(), 0,100, 1));	
		spiner.setBounds(80, 30, 50, 50);
		spiner.addChangeListener(this);
		add(spiner);  
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JSpinner){
			slider.setValue(Integer.parseInt(spiner.getValue().toString()));
			}
		else if(e.getSource() instanceof JSlider){
			spiner.setValue(slider.getValue());
			}
	}
}
