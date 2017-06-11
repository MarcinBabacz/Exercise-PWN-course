package Zadania;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;  
public class JAS13 extends JFrame implements ListSelectionListener
{  
	 JList<String> list, list2;
	 JLabel Jl;
     public JAS13(String title, int szerokosc, int wysokosc){  
        //JFrame f= new JFrame();  
    	super(title);
 		setSize(szerokosc,wysokosc);
 		setLayout(null);
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] l1 = {"Ernest", "Krystian" , "Monika", "Magda"};
        String[] l2 = {"Zalewski", "Bak" , "Morwinski", "Lubisz"};
          list = new JList(l1);  
          list.setBounds(100,100, 75,75);  
          list.addListSelectionListener(this);
          list2 = new JList(l2);  
          list2.setBounds(100,200, 75,75);  
          list2.addListSelectionListener(this);
          Jl = new JLabel("OK");
          Jl.setBounds(200,100, 200,75);
          add(Jl);
          add(list);  
          add(list2);
          setSize(400,400);  
          setLayout(null);  
          setVisible(true);  
     }  
@Override
public void valueChanged(ListSelectionEvent lf) {
	try{
			int i = list.getSelectedValue().length() + list2.getSelectedValue().length();
			Jl.setText(list.getSelectedValue() + " " + list2.getSelectedValue() + " " + i);

	}catch(NullPointerException e){
		Jl.setText("Dokonaj wyboru w obu listach");
	}
}

	
}


