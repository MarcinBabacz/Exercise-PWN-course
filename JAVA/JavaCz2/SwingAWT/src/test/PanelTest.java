package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest {
	
	PanelTest(){
		JFrame f = new JFrame("OK");
		JPanel panel = new JPanel();
		panel.setBounds(50, 40, 100, 100);
		JButton jb = new JButton("OK");
		jb.setToolTipText("To jest cos");
		jb.setBounds(30, 30, 100, 30);
		panel.add(jb);
		f.add(panel);
		f.setSize(200, 200);
		f.setLayout(null);
		f.setVisible(true);
	
	}

}
