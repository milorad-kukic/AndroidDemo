package com.ccc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Demo application with scroll pane.
 * 
 * @author Milorad Kukic
 * @version 1.0, 2015-01-08
 */
public class AndroidDemoApp3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage mainStage) throws Exception {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        
        mainStage.setX(0);
        mainStage.setY(0);
        mainStage.setWidth(bounds.getWidth());
        mainStage.setHeight(bounds.getHeight());
        
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("ContactCalendar.fxml"));
            ScrollPane scroller = new ScrollPane(root);
            scroller.hbarPolicyProperty().set(ScrollBarPolicy.AS_NEEDED);
            scroller.vbarPolicyProperty().set(ScrollBarPolicy.AS_NEEDED);
            mainStage.setScene(new Scene(scroller));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        mainStage.show();
    }

}
