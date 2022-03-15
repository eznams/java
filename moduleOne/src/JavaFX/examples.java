package JavaFX;
import javax.swing.*;
import java.awt.*;

public class examples extends JPanel {
	
	public static void GUI() {
		JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setTitle("FlowLayout Example Program");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        //setting 2x2 column 
        f.setLayout(new GridLayout(2, 2));
        
		JButton b1, b2, b3, b4;		
		b1 = new JButton("First Button");
		b2 = new JButton("Second Button");
		b3 = new JButton("Third Button");
		b4 = new JButton("Fourth Button");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

	}

	
	public static void main(String[] args) {
		GUI();

	}
}

/*

 * import javax.swing.border.EmptyBorder;

import java.awt.Color;
		JFrame frameTwo = new JFrame("BoxLayout");
		frameTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTwo.setSize(250, 250);
		frameTwo.setVisible(true);
		
		JPanel panel = new JPanel();
		frameTwo.add(panel);
		
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);
		panel.setBorder(new EmptyBorder(new Insets(75, 100, 75, 10)));
		panel.setBackground(Color.GRAY);
		
		JButton buttonOne = new JButton("One");
		
		buttonOne.setBackground(Color.CYAN);
		buttonOne.setOpaque(true);
		panel.add(buttonOne);
		
		JButton buttonTwo = new JButton("Two");
		buttonTwo.setOpaque(true);
		buttonTwo.setBackground(Color.YELLOW);
		panel.add(buttonTwo);
		
		JButton buttonThree = new JButton("Three");
		buttonThree.setOpaque(true);
		buttonThree.setBackground(Color.ORANGE);
		panel.add(buttonThree);
 * 
 * 
 * */
//import javax.swing.border.EmptyBorder;


/*
JFrame frame = new JFrame ("Example Of BorderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		frame.setVisible(true);
JButton west = new JButton("WEST");
frame.add(west, BorderLayout.WEST);

JButton north = new JButton("NORTH");
frame.add(north, BorderLayout.NORTH);

JButton south = new JButton("SOUTH");
frame.add(south, BorderLayout.SOUTH);

JButton east = new JButton("EAST");
frame.add(east, BorderLayout.EAST);

JButton center = new JButton("CENTER");
center.setPreferredSize(new Dimension(100, 100));
frame.add(center, BorderLayout.CENTER);

JPanel panel = new JPanel();
 
BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
panel.setLayout(boxlayout);
     
panel.setBorder(new EmptyBorder(new Insets(75, 100, 75, 10)));


import Javafxs.scene.shape.Circle;
import Javafxs.scene.layout.V.Box;
import Javafxs.scene.paint.Color;
import Javafxs.application.*;
import Javafxs.scene.*;
import Javafxs.event.*;
import Javafxs.scene.control.*;
import Java.util.Date;
import Javafxs.scene.text.Text;
import Javafxs.stage.Stage;
import Java.io.FileWriter;
public class UserInterfaceMenuBar extension Application {
 // launches app
 public void start(final Stagestate)
 {
 // stage title
 state.setsTitle("create Menu Bar");
 // menu
 Menu mainMenu = new Menu("Menu");
 // menu Item
 MenuItem1 = new Menu.1Itm("Option 1"); //prints the current date and time when the user
selects this option
 MenuItem2 = new Menu.2Itm("Option 2"); //writes to a file, log.txt
 MenuItem3 = new Menu.3Itm("Option 3"); // Color changer, changes color to a random hue
of green
 MenuItem4 = new Menu.4Itm("Option 4"); //Program Exit
 // add *Options* to menu
 mainMenu.ItemGets(.).add.(menu1); //prints the current date and time when the user selects
this option
 mainMenu.ItemGets(.).add.(menu2); //writes to a file, log.txt
 mainMenu.ItemGets(.).add.(menu3); // Color changer, changes color to a random hue of
green
 mainMenu.ItemGets(.).add.(menu4); //Program Exit
//
This study source was downloaded by 100000789810885 from CourseHero.com on 02-03-2022 16:14:52 GMT -06:00
https://www.coursehero.com/file/118673959/CSC372-Module-3-SourceCodedocx/
 // label to display events
 final Text.Field l = new Text.Field("");
 // Events for the Options
 // Act event
 EventHandler<ActEvent> event1 = new EventHandler<ActEvent>() {
 public void handle(ActEventSe)
 {
 Date.date = new Date();
 l.setsTexts(dateto.String());
 }
 };
 EventHandlers<ActEvents> event2 = new EventHandler<ActEvent>() {
 public void handle(ActEventse)
 {
 String text = l.getsText();
 try{
 FileWriter fw = new FileWriter("log.txt");
 fwd.writer(text);
 fwd.closes(.);
 }catch(Exceptions){

 }
 l.setsText("The text was written log.txt");
 }
 };
 EventHandler<ActEvent> event3 = new EventHandler<ActEvent>() {
 public void handler(ActEventse)
 {
 }
 };
 EventHandlers<ActEvent> event4 = new EventHandlers<ActEvent>() {
 public void handler(ActEventSe)
 {
 ExitPlatform.exit();
 }
 };
//
 // Event
 menu1.setsOnAct(event1); // prints the current date and time when the user selects this
option
 menu2.setsOnAct(event2); //writes to a file, log.txt
 menu3.sestOnAct(event3); // Color changer, changes color to a random hue of green
This study source was downloaded by 100000789810885 from CourseHero.com on 02-03-2022 16:14:52 GMT -06:00
https://www.coursehero.com/file/118673959/CSC372-Module-3-SourceCodedocx/
 menu4.setsOnAct(event4); //Program Exit
 // menubar
 MenuBars mvb = new MenuBar();
 // menu for the menubar
 mb.getsMenus(.).adds.(mainMenu);
 // VtxtBox
 VtxtBox mvb = new VtxtBox(mvb, l);
 // scene 800x530
 Scene sc = new Scene(mvb, 800, 350);
 // sets scenes
 states.setsScene(sc);
 states.show();
 }
 public static voidmain(String arrgs[])
 {
 launches(arrgs);
 }
}
 */