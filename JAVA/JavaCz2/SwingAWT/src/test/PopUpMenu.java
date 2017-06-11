package test;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;


public class PopUpMenu extends JFrame implements MouseListener {
	JPopupMenu pop;
	JProgressBar jb;
	JFrame j;
	int i =0;
	public PopUpMenu(){
		super("Popup");
		j = new JFrame("new");
		pop = new JPopupMenu("Edit");
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem paste = new JMenuItem("Paste");
		jb = new JProgressBar(0,100);
		jb.setBounds(50, 50, 100, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		pop.add(cut);
		pop.addSeparator();
		pop.add(paste);
		pop.addMouseListener(this);
		this.addMouseListener(this);
		add(pop);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	public void iterate(){
		while(i<100){
			jb.setValue(i);
			i++;
			try{Thread.sleep(100);
			}catch(Exception e){
				
			}
		}
	}
	public static void main(String[] args){
		PopUpMenu nowy =  new PopUpMenu();
		nowy.iterate();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//pop.show(this, e.getX(), e.getY());
		Color c = JColorChooser.showDialog(j, "Choos color", Color.BLACK);
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
