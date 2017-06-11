package Zadania;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JAS18 extends JFrame implements MouseListener{  
//JFrame f;   
JLabel jL1, jL2, jL3;
Color temp;
boolean justCliked;
public JAS18(String title, int szerokosc, int wysokosc){    
	super(title);
	justCliked = false;
	setSize(szerokosc,wysokosc);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    jL1 = new JLabel("1");
    jL2 = new JLabel("2");
    jL3 = new JLabel("3");
    jL3.addMouseListener(this);
    jL2.addMouseListener(this);
    jL1.addMouseListener(this);
    jL1.setBounds(50, 80, 100, 30);
    jL2.setBounds(50, 160, 100, 30);
    jL3.setBounds(50, 240, 100, 30);
    add(jL1); 
    add(jL2);
    add(jL3);
    setLayout(null);  
    setSize(400,400);  
    setVisible(true);  
}  
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() instanceof JLabel){
		Color c=JColorChooser.showDialog(this,"Choose",Color.BLACK); 
		temp = c;
		JLabel jn = (JLabel)e.getSource();
		jn.setForeground(c);
		}
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() instanceof JLabel && !justCliked){
		
		JLabel jn = (JLabel)e.getSource();
		temp = jn.getForeground();
		jn.setForeground(Color.BLUE);
		}
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() instanceof JLabel){
		JLabel jn = (JLabel)e.getSource();
		jn.setForeground(temp);
		}
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}  
}   
