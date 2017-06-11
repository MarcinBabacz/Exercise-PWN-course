package Zadania;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class JAS10 extends JFrame implements ActionListener {

	JRadioButton r1,r2;
	JLabel jL;
	JButton bAct;
	public JAS10(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r1 = new JRadioButton("A");
		r2 = new JRadioButton("B");
		r1.addActionListener(this);
		r2.addActionListener(this);
		r1.setBounds(75, 50, 100, 30);
		r2.setBounds(75, 100, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(r1);
		add(r2);
		jL = new JLabel();
		jL.setBounds(50, 100, 100, 30);
		add(jL);
		bAct = new JButton("Akcja");
		bAct.setBounds(50, 200, 100, 30);
		add(bAct);
		bAct.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(bAct)){
			if(r1.isSelected()){
				jL.setText(r1.getText());
			}
			else if(r2.isSelected()){
				jL.setText(r2.getText());
			}
		}
	}
}