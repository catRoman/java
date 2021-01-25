import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/** Exercise 1 Chapter 14 Intro to java by Liang
 * 
 * <ol>
 *  <li>Exercise14_1 - Display Images
 * </ol>
 * 
 * @author Cat Roman 2021-01-24
 */
public class Exercise14_1 extends Application{
    @Override //Override the strat method in the Application class
    public void start(Stage primaryStage) {
      
    
        // create a pane to hFlowPaneol the image views
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("Pictures/skritches_baby.jpeg");
        pane.getChildren().add(new ImageView(image));
        
        Image image2 = new Image("Pictures/skritches.jpeg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);
        image2.x.bind(pane.widthProperty());
        image2.y.bind(pane.heightProperty());

        //pane2
        Pane pane2 = new HBox(10);
        pane2.setPadding(new Insets(5,5,5,5));
        Image image3 = new Image("Pictures/skritches_lay.jpeg");
        ImageView imageView3 = new ImageView(image3);
       // pane2.setFill(Color.BLACK);

        imageView3.setFitHeight(100);
        imageView3.setFitWidth(100);
        pane2.getChildren().add(imageView3);

          //Creates border pane
          BorderPane border = new BorderPane();
      
          //places nodes in the pane
          border.setTop(pane);
          border.setBottom(pane2);

        //creates a scene and place it in the stage
        Scene scene = new Scene(border);
        primaryStage.setTitle("Exercise14_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**Application Driver */
    public static void main(String[] args){
        Application.launch(args);
    }
}