package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxEx extends JFrame implements ActionListener{
	JLabel jl;
	JComboBox cb;
	
public ComboBoxEx (String title, int szerokosc, int wysokosc){
		
		super(title);
		setSize(szerokosc,wysokosc);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] panstwa = {"POL", "GER", "USA"};
		cb = new JComboBox(panstwa);
		cb.setBounds(50, 50, 100, 30);
		jl = new JLabel();
		jl.setBounds(50, 100, 100, 30);
		add(jl);
		cb.addActionListener(this);
		add(cb);
		
		
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	jl.setText(cb.getSelectedItem().toString());
}
}
