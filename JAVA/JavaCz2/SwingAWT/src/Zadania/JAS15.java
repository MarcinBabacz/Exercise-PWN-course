package Zadania;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JAS15 extends JFrame implements ActionListener{
	JButton bStart, bStop;
	Instant istart = null ,istop = null;
	JLabel lab;
	boolean stop = false;
public JAS15(String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bStart = new JButton("bStart");
		bStart.addActionListener(this);
		bStart.setBounds(50, 50, 100, 30);
		this.add(bStart);
		bStop = new JButton("OK");
		bStop.addActionListener(this);
		bStop.setBounds(50, 100, 100, 30);
		this.add(bStop);
		lab = new JLabel("bStop");
		lab.setBounds(200,100, 200,75);
        add(lab);
	}
@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		
		if(e.getSource().equals(bStart)){
			istart = Instant.now();
			
		}
		else if (e.getSource().equals(bStop)){
			stop = true;
			istop = Instant.now();
			Duration d = Duration.between(istart, istop);
			lab.setText(String.valueOf((d.getSeconds() + d.getNano()/1000000000f)));
		}		
		
	}


}
