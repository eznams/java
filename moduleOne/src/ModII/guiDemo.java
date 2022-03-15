package ModII;
import java.awt.event.*;
import javax.swing.*;

public class guiDemo extends JPanel implements ActionListener {
	private JButton button;
	
	guiDemo(){
		button = new JButton ("Open a Gift");	
		add(button);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame newFrame = new JFrame();
		JLabel label = new JLabel();
		JPanel panel = new JPanel();     
		newFrame.setTitle("Your Gift");
		newFrame.setSize(300, 300);
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setVisible(true);
		label.setText("Your package has a gift card for $100");
		panel.add(label);
		newFrame.add(panel);
		
	}
	public static void main(String[] args){
		guiDemo panel = new guiDemo();
		JFrame frame = new JFrame();
		frame.setTitle("Amazon Packaging");
	    frame.setSize(300, 300);
	    frame.add(panel);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    
		
	}
	/*
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();     
	    JButton button = new JButton();
	    
	    JLabel label = new JLabel();
	    panel.setBackground(Color.YELLOW);
	   
	    //changing frame
	    frame.setTitle("Example of title");
	    frame.setSize(300, 300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	       
	    //changing label 
	    label.setText("Hello World");
	   
	    button.setText("Change?");
	    
	    //placing all into the panel
	    panel.add(label);
	    panel.add(button);
	    //adding panel to frame
	    frame.add(panel);
	          
	   }*/
	
	
	
	
}
