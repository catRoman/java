
package application;
import livingspace.*;
import exceptions.*;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HousingApplicationFX extends Application {
    @Override // Override the start method in the application class
    public void start(Stage primaryStage) {
    
       

        // create a pane and ste its properties
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("House");
        Button btCancel = new Button("Apartment");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOK, btCancel);

        //Creatge a scene and place it int he stage

        Scene scene = new Scene(pane);
        primaryStage.setTitle("HandleEvent"); //set the stage title
        primaryStage.setScene(scene); // Plave the scen in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}

class OKHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        try{
        Apartment apt1 = new Apartment("123 test dr.",10,1, 1, 100);
        System.out.println(apt1.toString());
        }catch(InvalidBathNumberException ex){
            System.out.println(ex);
        }
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        try{
         House house1 = new House("234 house land", 1 , 3, 4, "1000000");
        System.out.println(house1.toString());
        }catch(InvalidBathNumberException ex){
            System.out.println(ex);
        }
    }
}