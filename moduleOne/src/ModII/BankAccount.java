package ModII;
import java.awt.Label;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankAccount extends JPanel implements ActionListener{

	JButton debit = new JButton("Debit");
	JButton credit = new JButton("Credit");
	JButton exit = new JButton("Exit");
	TextField t1, t2, output; // text fields
	Label debitAccount, creditAccount, balanceAmount; // labels
	double accountBalance=0.0;

	public BankAccount(JFrame frame) {
		debitAccount = new Label(" Debit Amount :");
		debitAccount.setBounds(50, 100, 100, 50);
		
		frame.add(debitAccount);
		
		t1 = new TextField("");
		
		t1.setBounds(150, 110, 100, 50);
		
		frame.add(t1);
		
		creditAccount = new Label(" credit Amoount :");
		
		creditAccount.setBounds(50, 180, 100, 50);
		
		frame.add(creditAccount);
		
		t2 = new TextField("");
		t2.setBounds(150, 180, 100, 50);
		frame.add(t2);
		debit.addActionListener(this);
		debit.setBounds(150,250, 150,30);
		frame. add(debit);

		credit.addActionListener(this);
		credit.setBounds(300,250, 150,30);
		
		frame.add(credit);

		balanceAmount = new Label(" Balance Amoount :");
		balanceAmount.setBounds(300, 180, 100, 50);
		frame.add(balanceAmount);
	
		
		output = new TextField("");
		output.setBounds(400, 180, 100, 50);
		frame.add(output);
		
		exit.addActionListener(this);
		exit.setBounds(450,250, 150,30); ;  
		frame.add(exit);  
		
	}

	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		frame.getContentPane().add(new BankAccount(frame));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		frame.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e) {
	
		if (e.getActionCommand().equals("Debit")) {
			System.out.println("Debit has been clicked");
			String balanceAmount = t1.getText();	
			double debitAmount = Double.parseDouble(balanceAmount);
			accountBalance=accountBalance+debitAmount;
			output.setText(String.valueOf(accountBalance));
			t1.setText("");
		
		} else if (e.getActionCommand().equals("Credit")) {
			System.out.println("Debit has been clicked");
			String balanceAmount = t2.getText();
			double creditAmount = Double.parseDouble(balanceAmount);
			accountBalance=accountBalance-creditAmount;
			output.setText(String.valueOf(accountBalance));
			t2.setText("");
		
		} else if(e.getActionCommand().equals("Exit")){
		
			System.out.println("You are exited : Bye");
			
			System.exit(0);
		
		}

}

}//class BankAccount ends