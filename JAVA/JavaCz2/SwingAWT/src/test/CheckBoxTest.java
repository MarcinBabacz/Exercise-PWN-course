package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest extends JFrame implements ActionListener{
	
	JCheckBox bOK;
	JLabel lab;
	public CheckBoxTest(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bOK = new JCheckBox("OK", true);
		lab = new JLabel();
		bOK.setBounds(50, 50, 100, 30);
		bOK.addActionListener(this);
		this.add(bOK);
		lab.setBounds(50, 100, 200, 30);
		add(lab);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		lab.setText("Czy jest zaznaczony: " + bOK.isSelected());
	}

}
