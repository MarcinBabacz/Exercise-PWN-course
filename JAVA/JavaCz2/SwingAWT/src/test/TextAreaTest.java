package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest  extends JFrame implements ActionListener{

	JLabel jL;
	JTextArea pt;
	JButton bAct;
	public TextAreaTest(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pt = new JTextArea(3,20);
		pt.setBounds(50, 50, 200,400);
		add(pt);
		jL = new JLabel("to bedzie text");
		jL.setBounds(50, 100, 100, 30);
		add(jL);
		bAct = new JButton("Akcja");
		bAct.setBounds(50, 150, 100, 30);
		add(bAct);
		bAct.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String po  = pt.getText();
		jL.setText(pt.getText());
	}
}
