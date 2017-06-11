package Zadania;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JAS9 extends JFrame implements ActionListener{
	
	JCheckBox cB1, cB2, cB3 ;
	JLabel lab;
	JButton bAction;
	public JAS9(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cB1 = new JCheckBox("CB1 ");
		cB2 = new JCheckBox("CB2 ");
		cB3 = new JCheckBox("CB3 ");
		lab = new JLabel();
		bAction = new JButton("OK");
		cB1.setBounds(50, 50, 100, 30);
		cB2.setBounds(50, 100, 100, 30);
		cB3.setBounds(50, 150, 100, 30);
		//cB1.addActionListener(this);
		this.add(cB1);
		this.add(cB2);
		this.add(cB3);
		this.add(bAction);
		bAction.setBounds(50, 200, 100, 30);
		bAction.addActionListener(this);
		lab.setBounds(50, 300, 200, 30);
		add(lab);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = " ";
		if(e.getSource().equals(bAction)){
			if(cB1.isSelected()){
				text += cB1.getText();
			}
			if(cB2.isSelected()){
				text += cB2.getText();
			}
			if(cB3.isSelected()){
				text += cB3.getText();
			}
			
		}
	
		lab.setText(text);
		
	}

}
