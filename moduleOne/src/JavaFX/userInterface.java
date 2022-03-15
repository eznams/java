package JavaFX;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
public class userInterface implements ActionListener{
	JMenuItem m1,m2,m3,m4;
	JMenuBar mb;
	JTextField txtbox;
	JMenu menu;
	JFrame frm;
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==m1){
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
		LocalDateTime current=LocalDateTime.now();
		txtbox.setText(dt.format(current)+"");
		}
		if(ae.getSource()==m2){
			String s1=txtbox.getText();
			try{
				FileWriter fw=new FileWriter("Log.txt");
				fw.write(s1);
				fw.close();
			}
			catch(Exception e1){
				txtbox.setText("Exception is "+e1);
			}
		}
		if(ae.getSource()==m3){
			frm.getContentPane().setBackground(Color.green);
		}
		if(ae.getSource()==m4){
			frm.setVisible(false);
		}
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}	
	public static void main(String args[]){
		userInterface md = new userInterface();
	}
}
