import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Example14_1 extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button btOk = new Button("Hello Lisa");
        Scene scene = new Scene(btOk, 200, 300);
        primaryStage.setTitle("Hello Lisa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}