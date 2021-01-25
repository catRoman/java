import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Example14_2 extends Application{
    public void start(Stage primaryStage){
        Scene scene = new Scene(new Button("Ok"), 200, 250);
        primaryStage.setTitle("Example14_2");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 100, 100));
        stage.show();
    }

public static void main(String[] args){
    Application.launch(args);
}
}