package Zadania;

import javax.swing.*;    
public class JAS12 {    
    JFrame f;    
    JAS12(){    
    f=new JFrame();    
    String[][] tbDane = {{"Ernest", "Krystian", "89598956565", "4000"}, 
			{"Monika", "Zawadzka", "89598956565", "4000"}, {"Stefan", "Morgen", "89598956565", "4000"}};
	String[] tbNazwy = {"Imie", "Nazwisko", "Pesel", "Zarobki"};
    JTable jt=new JTable(tbDane,tbNazwy);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new JAS12();    
}    
}  

