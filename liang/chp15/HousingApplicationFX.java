//package application;
//javaFx 
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HousingApplicationFX extends Application {
    private Stage stage;
    private Scene scene;


    public static void main(String[] args){
        Application.launch(args);
    }
    @Override // overrided the start method in the Application class
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        this.scene = createSceneOne();
        
        //create scene and display on stage
        
        primaryStage.setTitle("HousingFXApplication");
        primaryStage.setScene(scene);
        primaryStage.show();

       
        
       
        
    }
 //Scene 1 Methods   
        //intro Layout(Scene 1) UI, scene, stage creation
        private Scene createSceneOne(){
            GridPane introLayout = new GridPane();
            introLayout.setVgap(10);
            introLayout.setAlignment(Pos.CENTER);
            introLayout.add(getHouseIcon(), 0, 0);
            introLayout.add(getIntroText(), 0, 1);
            introLayout.add(getIntroButtons(),0, 2);
            return  new Scene(introLayout, 600, 350);
        }
        //intro text
        private VBox getIntroText(){
            VBox introText = new VBox();
            Text labTitle = new Text("Lab One:");
            labTitle.setFont(Font.font("Montserrat Black", FontWeight.BOLD, 30));
            Text appTitle = new Text("Housing FX App");
            appTitle.setFont(Font.font("Liberation Sans", FontWeight.BOLD, 25));
            introText.setSpacing(5);
            introText.setAlignment(Pos.CENTER);
            introText.getChildren().addAll(labTitle, appTitle);
            return introText;
        }
        //HBox for intro UI Control
        private HBox getIntroButtons() {
            HBox introButtonLayout = new HBox();
            introButtonLayout.setAlignment(Pos.CENTER);
            introButtonLayout.setPadding(new Insets(15, 15, 15,15));
            introButtonLayout.setSpacing(25);
            Button btEnter = new Button("Enter");
            Button btExit = new Button("Exit");
            introButtonLayout.getChildren().addAll(btEnter, btExit);

            //Create and handle button events with lambdas

            btEnter.setOnAction(e -> 
                switchScenes(createSceneTwo()));
            btExit.setOnAction(e -> 
                Platform.exit());
            
            return introButtonLayout;
        }
        //Street Logo
        private Group getHouseIcon() {
            HBox street = new HBox();
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.GREEN));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.BLACK));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.WHITE));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.RED));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.BLUE));
            
            Polygon triBackGround = new Polygon();
            triBackGround.setFill(Color.RED);
            triBackGround.setStroke(Color.BLACK);
            triBackGround.getPoints().addAll(new Double[]{0.0,0.0,50.0,175.0,150.0,100.0});
            
            StackPane icon = new StackPane();
            icon.getChildren().addAll(triBackGround, street);
            icon.setAlignment(Pos.BOTTOM_CENTER);
            Group streetIcon = new Group();
            streetIcon.getChildren().add(icon);
            return streetIcon;
        }
        //Single house drawing
        private Group getHouseDrawing(Color stroke, Color fill) {
                Path walls = new Path();
                MoveTo start = new MoveTo(100,100);
                LineTo roofA = new LineTo(125,80);
                LineTo roofB = new LineTo(150,100);
                LineTo roofBa = new LineTo(140,100);
                LineTo houseA = new LineTo(140,120);
                LineTo houseB = new LineTo(110,120);
                LineTo houseC = new LineTo(110,100);
                LineTo roofAa = new LineTo(100, 100);
                walls.getElements().add(start);
                walls.getElements().addAll(roofA, roofB, roofBa, houseA, houseB, houseC, roofAa);
                walls.setFill(fill);
                walls.setStroke(stroke);
                Path door = new Path();
                MoveTo doorStart = new MoveTo(122.5,120);
                LineTo doorA = new LineTo(122.5,105);
                LineTo doorB = new LineTo(127.5,105);
                LineTo doorC = new LineTo(127.5,120);
                LineTo doorD = new LineTo(122.5,120);
                door.getElements().add(doorStart);
                door.getElements().addAll(doorA, doorB, doorC);
                door.setFill(Color.WHITE);
                door.setStroke(Color.BLACK);
                Group house = new Group();
                house.getChildren().addAll(walls, door);
                return house;
                }
        //Switch scenes
        private void switchScenes(Scene sceneName){
            this.stage.setScene(sceneName);
        } 
       
//Scene2

        //create scene 2
        private Scene createSceneTwo(){
            Pane test = new Pane();
            Rectangle rec = new Rectangle(0,0,100,100);
            test.getChildren().add(rec);
            return new Scene(test, 600, 350);
        }
    }
