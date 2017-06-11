package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DziedziczyApp extends JFrame implements ActionListener{
	JButton bOk;
	DziedziczyApp (String title, int szerokosc , int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void addButton(){
		bOk = new JButton("OK");
		bOk.setBounds(50, 50, 500, 500);
		ImageIcon bIcon = new ImageIcon("C:\\Users\\Everest1986\\workspace2\\SwingAWT\\icon\\ok.png");
		bOk.setIcon(bIcon);
		this.add(bOk);
		bOk.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		bOk.setText("NOK");
	}
	
	
}
