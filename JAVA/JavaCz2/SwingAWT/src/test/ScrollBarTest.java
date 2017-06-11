package test;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class ScrollBarTest extends JFrame{
	JScrollBar s;
	public ScrollBarTest(String title, int szerokosc, int wysokosc){
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s = new JScrollBar(SwingConstants.HORIZONTAL);
		s.setBounds(20, 20, 200, 10);
		add(s);
	}
}
