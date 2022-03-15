package guiDemo;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class Demo {

	protected Shell shell;
	private Text numberOne;
	private Text numberTwo;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Demo window = new Demo();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Add Two Numbers");
		
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 10, 112, 14);
		lblNewLabel_1.setText("Number One");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 141, 112, 14);
		lblNewLabel_2.setText("Number Two");
		
		numberOne = new Text(shell, SWT.BORDER);
		numberOne.setBounds(20, 26, 102, 19);
		
		numberTwo = new Text(shell, SWT.BORDER);
		numberTwo.setBounds(20, 161, 102, 19);
		
		Button calculate = new Button(shell, SWT.NONE);
		
		Label finalAnswer = new Label(shell, SWT.BORDER);
		finalAnswer.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 16, SWT.NORMAL));
		finalAnswer.setBounds(10, 228, 387, 34);
		finalAnswer.setText("Answer");
		calculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int number1, number2;
				
				try {
					 number1 = Integer.parseInt(numberOne.getText());
				}
				catch (Exception exc){
					MessageDialog.openError(shell, "Error", "Wrong first number");
					return;
				}
				try {
					 number2 = Integer.parseInt(numberTwo.getText());
				}
				catch (Exception exc){
					MessageDialog.openError(shell, "Error", "Wrong second number");
					return;
				}
				int answer = number1 + number2;
				finalAnswer.setText("The answer is: " + answer);
			}
		});
		calculate.setBounds(152, 83, 96, 27);
		calculate.setText("Calculate");
		
		

	}
}
