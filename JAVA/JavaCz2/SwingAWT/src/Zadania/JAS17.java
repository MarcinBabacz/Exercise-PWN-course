package Zadania;

import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;

public class JAS17 extends JFrame {

	JPopupMenu pop;
	JProgressBar jb;
	int i =0;
	public JAS17(String title, int szerokosc, int wysokosc){
		super(title);
		jb = new JProgressBar(0,100);
		jb.setBounds(50, 50, 100, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void iterate(){
		while(i<=100){
			++i;
			jb.setValue(i);
			try{Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}
