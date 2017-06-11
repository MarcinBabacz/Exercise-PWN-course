package Zadania;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JAS11 extends JFrame implements ActionListener{

	JLabel jl;
	JComboBox cb, cb1;
	JTextField tf;
	HashMap<String, Float> hm = new HashMap<>();
	JButton jB;
public JAS11 (String title, int szerokosc, int wysokosc){
		super(title);
		putToHashMap();
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] jednostki = {"mm", "cm", "dcm", "m"};
		jB = new JButton("OK");
		jB.setBounds(50, 150, 80, 30);
		jB.addActionListener(this);
		cb = new JComboBox(jednostki);
		cb.setBounds(150, 50, 50, 30);
		cb1 = new JComboBox(jednostki);
		cb1.setBounds(300, 50, 50, 30);
		tf = new JTextField();
		tf.setBounds(50, 50, 100, 30);
		add(tf);
		
		jl = new JLabel("pole");
		jl.setBounds(220, 50, 100, 30);
		add(jl);
		add(cb);
		add(cb1);
		add(jB);
	}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(cb.getSelectedItem().equals(cb1.getSelectedItem())){
		jl.setText(tf.getText());
	}
	else{
		 float multiplex = (float)((float)hm.get(cb.getSelectedItem().toString()))/((float)hm.get(cb1.getSelectedItem().toString()));//(cb)/hm.get(cb1);
		 float tfnumber = Float.parseFloat(tf.getText());
		 
		 jl.setText(String.valueOf(multiplex*tfnumber));
	}
}
public void putToHashMap(){
	hm.put("mm", 1f);
	hm.put("cm", 10f);
	hm.put("dcm", 100f);
	hm.put("m", 1000f);
}
}
