import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Pos;

public class Example14_7 extends Application{
    public void start(Stage primaryStage){
        Image imageX = new Image("Pictures/skritches.jpeg");
        Image imageO = new Image("Pictures/skritches_baby.jpeg");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);

        for( int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){
                int status = (int)(Math.random() * 3);
                if(status == 0){
                    ImageView imageViewX =new ImageView(imageX);
                    imageViewX.setFitHeight(imageX.getHeight() / 4.0);
                    imageViewX.setFitWidth(imageX.getWidth() / 4.0 );
                    pane.add(imageViewX, j, i);
                }else if (status == 1) {
                    ImageView imageViewO =new ImageView(imageO);
                    imageViewO.setFitHeight(imageO.getHeight() / 4.0);
                    imageViewO.setFitWidth(imageO.getWidth() / 4.0 );
                    pane.add(imageViewO, j, i);
                }
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Example14_7");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}