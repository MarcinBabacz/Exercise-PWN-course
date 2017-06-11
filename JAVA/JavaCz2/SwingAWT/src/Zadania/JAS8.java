package Zadania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JAS8 extends JFrame implements ActionListener {

	JLabel jL;
	JTextField pt;
	JButton bAct;
	JPasswordField pass;
	String passCheck = "Ernest";
	public JAS8(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pt = new JTextField();
		pt.setBounds(50, 50, 100, 30);
		pt.addActionListener(this);
		add(pt);
		jL = new JLabel();
		jL.setBounds(50, 100, 100, 30);
		add(jL);
		bAct = new JButton("Akcja");
		bAct.setBounds(50, 200, 100, 30);
		add(bAct);
		bAct.addActionListener(this);
		pass = new JPasswordField();
		pass.setBounds(50, 150, 100, 30);
		pass.addActionListener(this);
		add(pass);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String po  = String.valueOf(pass.getPassword());
		System.out.println(po);
		if(po.equals(passCheck)){
			jL.setText("Witaj "+pt.getText());
		}
		else{
			jL.setText("Z³e has³o");
		}
	}
}
