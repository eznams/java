/*package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import javafx.stage.Stage;
import javafx.scene.text.Text.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
 
public class CustomMenuItem_1 extends Application {
 
    // Launch the application
    public void start(Stage stage)
    {
        // Set title for the stage
        stage.setTitle("creating CustomMenuItem ");
 
        // Create a tile pane
        TilePane r = new TilePane();
 
        // Create a label
        Label description_label =
                    new Label("This is a CustomMenuItem example ");
 
        // Create a menu
        Menu menu = new Menu("Menu");
 
        // Create menuitems
        CustomMenuItem menuitem_1 =
                    new CustomMenuItem(new Button("MenuItem 1"));
        CustomMenuItem menuitem_2 =
                    new CustomMenuItem(new Label("MenuItem 2"));
        CustomMenuItem menuitem_3 =
                    new CustomMenuItem(new CheckBox("MenuItem 3"));
 
        // Add menu items to menu
        menu.getItems().add(menuitem_1);
        menu.getItems().add(menuitem_2);
        menu.getItems().add(menuitem_3);
 
        // Create a menubar
        MenuBar menubar = new MenuBar();
 
        // Add menu to menubar
        menubar.getMenus().add(menu);
 
        // Create a VBox
        VBox vbox = new VBox(menubar);
 
        // Create a scene
        Scene scene = new Scene(vbox, 200, 200);
 
        // Set the scene
        stage.setScene(scene);
 
        stage.show();
    }
 
    public static void main(String args[])
    {
        // Launch the application
        launch(args);
    }
}
 */