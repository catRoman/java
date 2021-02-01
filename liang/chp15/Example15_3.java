import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//anonymous class example
public class Example15_3 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)  {
        Text text = new Text(40, 40, "Programming is grreeat");
        Pane pane = new Pane(text);

        //Hold four buttons in an HBox
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);

        // create and register the handler
        btUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
                text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
            }
        });

        btDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override // Override the handle method
            public void handle(ActionEvent e) {
                text.setY(text.getY() < pane.getHeight() ? 
                    text.getY() + 5 : pane.getHeight());
            }
        });

        btLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override // override the handle method
            public void handle(ActionEvent e) {
                text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
            }
        });

        btRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override // override the handle method
            public void handle(ActionEvent e) {
                text.setX(text.getX() < pane.getWidth() - 100 ? 
                    text.getX() + 5 : pane.getWidth() - 100);
            }
        });

        //creat a scne and place it in the stage
        Scene scene = new Scene(borderPane, 400, 350);
        primaryStage.setTitle("AnonymousHandlerDemo"); //Set title
        primaryStage.setScene(scene);// place the scen in the stage
        primaryStage.show(); //Display the stage
        }
}