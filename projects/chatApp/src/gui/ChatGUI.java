package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatGUI extends Application{
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chatgui.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Skricthes ChatApp");
        stage.setScene(scene);
        stage.show();
    }
   
}
