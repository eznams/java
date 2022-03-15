/*package ModII;



import javax.swing.JFrame;

class EmptyFrame {
   public static void main(String[] args) {
      
      // Construct the JFrame object
      JFrame appFrame = new JFrame();

      // Set the frame's width (400) and height (250) in pixels
      appFrame.setSize(400, 250);
      
      // Set the frame's title
      appFrame.setTitle("An Empty Frame");
      
      // Set the program to exit when the user
      // closes the frame
      appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Make the frame visible to the user
      appFrame.setVisible(true);
   }
}
/*
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

class MyCustomJComponent extends JComponent {
   public void paintComponent(Graphics g) {
      // Cast to Graphics2D
      Graphics2D graphicsObj = (Graphics2D)g;

      // Write your drawing instructions
   }
}



/*import javax.swing.JFrame;
import javax.swing.JTextField;

class SalaryGUI {
   public static void main(String[] args) {
      int hourlyWage;  
      JFrame topFrame = null;        // Application window
      JTextField outputField = null; // Displays output salary

      hourlyWage = 20;

      // Create text field
      outputField = new JTextField();
      // Display program output using the text field
      outputField.setText("An hourly wage of " + hourlyWage + "/hr" +
                          " yields $" + (hourlyWage * 40 * 50) + "/yr.");

      // Prevent user from editing output text
      outputField.setEditable(false);

      // Create window 
      topFrame = new JFrame("Salary");

      // Add text field to window
      topFrame.add(outputField);

      // Resize window to fit components 
      topFrame.pack();

      // Set program to terminate when window is closed
      topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display window
      topFrame.setVisible(true);
   }
}

*/
/*
 * 
 * import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalcFrame extends JFrame implements ActionListener {
   private JLabel wageLabel;     // Label for hourly salary
   private JLabel salLabel;      // Label for yearly salary
   private JTextField salField;  // Displays hourly salary 
   private JTextField wageField; // Displays yearly salary


   // Constructor creates GUI components and adds GUI components
      using a GridBagLayout. /
   SalaryCalcFrame() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Salary");

      wageLabel = new JLabel("Hourly wage:");
      salLabel = new JLabel("Yearly salary:");

      // Set hourly and yearly salary
      wageField = new JTextField(15);
      wageField.setEditable(true);
      wageField.setText("0");
      wageField.addActionListener(this);

      salField = new JTextField(15);
      salField.setEditable(false);

      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      layoutConst = new GridBagConstraints();

      // Specify component's grid location
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;

      // 10 pixels of padding around component
      layoutConst.insets = new Insets(10, 10, 10, 10);

      // Add component using the specified constraints
      add(wageLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(wageField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(salLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(salField, layoutConst);
   }

   // Method is automatically called when an event 
    occurs (e.g, Enter key is pressed) /
   @Override
   public void actionPerformed(ActionEvent event) {
      String userInput;      // User specified hourly wage
      int hourlyWage;        // Hourly wage

      // Get user's wage input
      userInput = wageField.getText();
      
      // Convert from String to an integer
      hourlyWage = Integer.parseInt(userInput);

      // Display calculated salary
      salField.setText(Integer.toString(hourlyWage * 40 * 50));
   }

   // Creates a SalaryCalculatorFrame and makes it visible /
   public static void main(String[] args) {
      // Creates SalaryLabelFrame and its components
      SalaryCalcFrame myFrame = new SalaryCalcFrame();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}
import javax.swing.JButton;.
JButton calcButton;
    // Create a "Calculate" button
      calcButton = new JButton("Calculate");
      
      // Use "this" class to handle button presses
      calcButton.addActionListener(this);

 * 
 * 
 * 
 * */
