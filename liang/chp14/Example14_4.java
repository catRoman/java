import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Example14_4 extends Application{
    public void start(Stage primaryStage){
        
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));

        Image image = new Image("Pictures/skritches.jpeg");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(image.getHeight() / 2.0);
        imageView2.setFitWidth(image.getWidth() / 2.0);
        pane.getChildren().add(imageView2);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);
        

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Example14_4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}