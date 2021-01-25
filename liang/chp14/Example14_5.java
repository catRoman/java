import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.geometry.Insets;

public class Example14_5 extends Application{


    public void start(Stage primaryStage) {
        
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name"), new TextField(),
                new Label("MI:"));

        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);

        pane.getChildren().addAll(tfMi, new Label("Last Name:"),
                new TextField());
            
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Example14_5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}