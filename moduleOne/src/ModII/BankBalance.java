package ModII;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//create BankBalance class
public class BankBalance extends JPanel implements ActionListener{
	//creating elements of the class
	JButton deposit;  
	JButton withdraw;
	JButton exit;
	TextField textOne, textTwo, output; 
	Label depositAccount, withdrawAccount, balanceAmount; 
	double accountBalance;
	
	//create frames and panels
	public BankBalance() {
		deposit = new JButton("Deposit");
		withdraw = new JButton("Withdraw");
		exit = new JButton("Exit");
		accountBalance = 0.0;
	}
	public void loadFrame(JFrame frame){
		JPanel mainPanelOne = new JPanel ();
		JPanel mainPanelTwo = new JPanel ();
		JPanel mainPanel = new JPanel();
		JPanel panelOne = new JPanel ();
		JPanel panelTwo = new JPanel ();
		
		panelOne = timeToDeposit(panelOne);
		mainPanelOne.add(panelOne);
		
		panelTwo = withdrawTime(panelTwo);
		mainPanelOne.add(panelTwo); 
		
		setTextField(mainPanelOne);
		buttonSetter(mainPanelTwo);
		
		mainPanel.add(mainPanelOne);
		mainPanel.add(mainPanelTwo);
		frame.add(mainPanel);
	}

	
	private JPanel buttonSetter(JPanel mainPanelTwo) {
		deposit.addActionListener(this);
		deposit.setBounds(300, 250, 150, 30);
		mainPanelTwo.add(deposit);
		
		withdraw.addActionListener(this);
		withdraw.setBounds(300, 250, 150, 30);
		mainPanelTwo.add(withdraw);
		
		exit.addActionListener(this);
		exit.setBounds(450, 250, 150, 30); ;  
		mainPanelTwo.add(exit); 
		return mainPanelTwo;
	}

	private JPanel setTextField(JPanel mainPanelOne) {
		balanceAmount = new Label("Account Balance: $");
		balanceAmount.setBounds(100, 100, 100, 50);
		mainPanelOne.add(balanceAmount);
		
		output = new TextField("0.00");
		output.setBounds(100, 180, 100, 50);
		mainPanelOne.add(output); 
		return mainPanelOne;
	}


	private JPanel withdrawTime(JPanel panelTwo) {
		withdrawAccount = new Label ("Amount to Withdraw: $");
		panelTwo.add(withdrawAccount);
		textTwo = new TextField("0.00");
		textTwo.setBounds(100, 180, 100, 50);
		panelTwo.add(textTwo);
		return panelTwo;
	}

	private JPanel timeToDeposit(JPanel panelOne) {
		depositAccount = new Label ("Amount to Deposit: $");
		depositAccount.setBounds(50, 100, 100, 50);
		panelOne.add(depositAccount);
		
		textOne = new TextField("0.00");
		textOne.setBounds(100, 180, 100, 50);
		panelOne.add(textOne);
		return panelOne;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getActionCommand().equals("Deposit")){
			 deposit();
		 } else if(e.getActionCommand().equals("Withdraw")){
				withdraw();	 
		 		} else if(e.getActionCommand().equals("Exit")){
		 			exit();
		 			} else {
		 				//should never get to this, but adding it just in case
		 				String message = "Wrong input. Try again!";
						JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);	
		 			}
	}
	
	private void exit() {
		 String message = "Balance in account is $" + accountBalance + "\nGoodbye";
		 JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);	
		 System.exit(0);
	}


	private void withdraw() {
		 try {
			 String amount = textTwo.getText();	
			 double withdrawAmount = Double.parseDouble(amount);
			 if(withdrawAmount > 0) {
				 accountBalance = accountBalance - withdrawAmount;
				 output.setText(String.valueOf(accountBalance));
				 textTwo.setText("");
				 }
	
		 }catch(Exception exc){
			 String message = "Please insert a positive amount to withdraw!";
			 JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);	
		 }
		
	}


	private void deposit() {
		try {
			 String balanceAmount = textOne.getText();	
			 double depositAmount = Double.parseDouble(balanceAmount);
			 if(depositAmount > 0) {
				 accountBalance = accountBalance + depositAmount;
				 output.setText(String.valueOf(accountBalance));
				 textOne.setText("");
				 }
		}
		 catch(Exception exc) {
			 String message = "Please insert a positive amount to deposit!";
			 JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);	 
		 }
		
	}


	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Bank Account");
		BankBalance bankAccount = new BankBalance();
		bankAccount.loadFrame(frame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 150);
		frame.setVisible(true);
	
	}
}
