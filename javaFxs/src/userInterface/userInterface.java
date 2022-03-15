package userInterface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class userInterface implements ActionListener{
	JMenuItem item1,item2,item3,item4;
	JMenuBar menuBox;
	JTextField txtbox;
	JMenu menu;
	JFrame frm;
	
	public userInterface(){
		frm = new JFrame();
		frm.setLayout(null);
	
		menuBox = new JMenuBar();
		txtbox = new JTextField();
		menu = new JMenu("Menu");
	
		item1 = new JMenuItem("Date And Time");
		item2 = new JMenuItem("Write to File");
		item3 = new JMenuItem("Change Color");
		item4 = new JMenuItem("Exit");
	
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
	
		menuBox.add(menu);
		frm.setJMenuBar(menuBox);
	

		item1.addActionListener(this);  
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
	
		txtbox.setBounds(200,50,200,30);
		frm.add(txtbox);
		frm.setVisible(true);
		frm.setSize(500,350);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==item1){
			String fullForm = getDateAndTime();
			txtbox.setText(fullForm);
		}
		if(ae.getSource() == item2){
			String toWrite = txtbox.getText();
			writeOnFile(toWrite);
			JFrame jFrame = new JFrame();
	        JOptionPane.showMessageDialog(jFrame, "File Wrote successfully");
		}
		if(ae.getSource() == item3){
			Color orange = Color.decode("#ff9900");
			frm.getContentPane().setBackground(orange);
		}
		if(ae.getSource() == item4){
			System.exit(0);
		}
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	public static void writeOnFile(String s1) {
		try{
			FileWriter fw = new FileWriter("LOG.txt", true);
			BufferedWriter out = new BufferedWriter(fw);
			out.write(s1 + "\n");
			out.flush();
			out.close();
		}
		catch(Exception e1){
			String message = "Could not write the file. Try again";
			JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);	
		}
	}

	public static String getDateAndTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'at' hh:mm a");
		LocalDateTime datetime = LocalDateTime.now();
	
		return datetime.format(formatter);
	}
	
	public static void main(String args[]){
		userInterface md = new userInterface();
	}
}