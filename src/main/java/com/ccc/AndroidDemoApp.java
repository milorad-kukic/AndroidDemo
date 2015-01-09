package com.ccc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Demo application which demonstrates reported issues.
 * 
 * <ol>
 * <li><b>Screen rotation</b> - When screen is rotated, form can not be 
 *     scrolled (part of the form is not visible).</li>
 *      
 * <li><b>Editing field on bottom of the screen</b> - When editing income
       field, editing field is not visible. When keyboard is closed, form
       title is not visible any more.</li>
 * </ol>
 * 
 * @author Milorad Kukic
 * @version 1.0, 2015-01-08
 */
public class AndroidDemoApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage mainStage) throws Exception {
        HBox hbox = new HBox();
        hbox.getChildren().add(new Label("TestApp"));
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        
        mainStage.setX(0);
        mainStage.setY(0);
        mainStage.setWidth(bounds.getWidth());
        mainStage.setHeight(bounds.getHeight());
        
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("Contact.fxml"));
            mainStage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        mainStage.show();
    }

}
