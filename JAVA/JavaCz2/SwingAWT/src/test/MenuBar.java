package test;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JFrame{

	public MenuBar(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar bar = new JMenuBar();
		JMenu firs = new JMenu("Menu");
		JMenuItem i1 = new JMenuItem("Item1");
		bar.add(firs);
		firs.add(i1);
		setJMenuBar(bar);
		
	}
}
