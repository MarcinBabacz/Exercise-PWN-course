package Zadania;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class JAS7 extends JFrame implements ActionListener {

	JLabel jL;
	JTextArea pt, pt2;
	JButton bAct;
	public JAS7(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pt = new JTextArea();
		pt.setBounds(50, 50, 100, 30);
		add(pt);
		pt2 = new JTextArea();
		pt2.setBounds(50, 100, 100, 30);
		add(pt2);
		
		bAct = new JButton("Akcja");
		bAct.setBounds(50, 150, 100, 30);
		add(bAct);
		bAct.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		pt2.setText(pt.getText());
	}

}
