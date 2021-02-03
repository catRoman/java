package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

import livingspace.LivingSpace;
import livingspace.House;
import livingspace.Apartment;
import exceptions.InvalidBathNumberException;

/**Application of rental Database.
 * Enter details of rental units and add them to a database.
 * Honestly this is really messy i never planned to write the 
 * application until last night and ive never used the javafx
 * api so there deffently stuff in here that doesnt make sense,
 * and things i started with but never finished,ill come  back
 * and ticker with it myself to learn with though so i left some
 * things in id have taking out for a typical submission, animation
 * comes to mind, playing with lambdas and inner classes etc
 * anyways im exhausted lol
 * 
 * <p><b>Comp 139 - LabOne</b>
 * 
 * @author Catlin Roman - 2021-02-01
 * <ul>
 *  <li>@see livingSpace
 *  <li>@see livingspace.House
 *  <li>@see livingspace.Apartment
 *  <li>@see exceptions.InvalidBathNumberException
 * </ul>
 * 
 */
public class HousingApplicationFX extends Application {
    private Stage primaryStage;
    private Scene scene;
      
    private SceneOne sceneOne = new SceneOne();
    private SceneTwo sceneTwo = new SceneTwo();

    /**
     * Driver class 
     * @throws exception for debugging with a stack trace
     */
    
    public static void main(String[] args)
        throws Exception{
            try{
                Application.launch(args);
            }catch(Exception ex){
                System.out.println(ex);
                ex.printStackTrace();
            }
    }
    
    /**Overridden method to set the stage and apply scene */
    @Override // overrided the start method in the Application class
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.scene = sceneOne.create();

        //Set stage and apply scene
        primaryStage.setMaxHeight(400);
        primaryStage.setMaxWidth(600);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();      
        
    }
 //Scene 1
 /**Inner class for organization purpases and src file brevity, 
  * creates am object for the first scene  */  
    class SceneOne{
        
        public GridPane introLayout = new GridPane();
        /**Default constructor sets the main GridPane layout format 
         * and adds nodes to the grid */
        private SceneOne(){
            
            introLayout.setMaxWidth(600);
            introLayout.setMaxHeight(400);
            introLayout.setVgap(10);
            introLayout.setAlignment(Pos.CENTER);
            introLayout.add(getStreetIcon(Color.WHITE), 0, 0);
            introLayout.add(getIntroText(Pos.CENTER), 0, 1);
            introLayout.add(getIntroButtons(),0, 2);
    
        }
        /**used to instantiate a scene for use throughout application
         * @return scene one
         */
        public Scene create(){
            Scene introScene = new Scene(this.introLayout, 600, 400);
            return introScene;
        }
        /**
         * Simple getter
         * @return GridePane of main layout
         */
        public GridPane getIntroLayout(){
            return this.introLayout;
        }
        /**a conatiner for a vBox node, with parameter for 
         * reusability
         * @param Pos alignment position
         * @return VBox with intro text
         */
        public VBox getIntroText(Pos alignment){
            VBox introText = new VBox();
            Text labTitle = new Text("Lab One:");
            labTitle.setFont(Font.font("Montserrat Black", FontWeight.BOLD, 30));
            Text appTitle = new Text("Housing FX App");
            appTitle.setFont(Font.font("Liberation Sans", FontWeight.BOLD, 25));
            introText.setSpacing(5);
            introText.setAlignment(alignment);
            introText.getChildren().addAll(labTitle, appTitle);
            /*Group introTextGroup = new Group();
            introTextGroup.setAlignment(Pos.CENTER);
            introTextGroup.getChildren().add(introText);*/
            return introText/*Group*/;
        }
        /**Container for buttons and event handling
         * @return HBox of intro buttons
         */
        public HBox getIntroButtons() {
            HBox introButtonLayout = new HBox();
            introButtonLayout.setAlignment(Pos.CENTER);
            introButtonLayout.setPadding(new Insets(15, 15, 15,15));
            introButtonLayout.setSpacing(25);
            Button btEnter = new Button("Enter");
            Button btExit = new Button("Exit");
            introButtonLayout.getChildren().addAll(btEnter, btExit);
            

            //Create and handle button events with lambdas

            btEnter.setOnAction(e -> 
                switchScenes(new SceneTwo().create()));
            btExit.setOnAction(e -> 
                Platform.exit());
            
            return introButtonLayout;
        }
        /**Creates a icon with adjustable door color for reusability
         * @param doorColor sets the color of the door to help with 
         * transparency effect to match background
         * @return HBox multiple house icons in a row
         */
        public  HBox getStreetIcon(Color doorColor) {
            HBox street = new HBox();
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.GREEN, doorColor));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.BLACK, doorColor));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.WHITE, doorColor));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.RED, doorColor));
            street.getChildren().add(getHouseDrawing(Color.BLACK, Color.BLUE, doorColor));
            
            //Group streetIcon = new Group();
            //streetIcon.getChildren().add(street);
            return street;
        }
        /**Draws a simple house and door
         * @param Stroke set the outline of the house
         * @param fill set the fill color
         * @param doorfill set the doorfill color
         * @return drawing of house with door
         */
        public Group getHouseDrawing(Color stroke, Color fill, Color doorFill) {
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
                door.setFill(doorFill);
                door.setStroke(Color.BLACK);
                
                Group house = new Group();
                house.getChildren().addAll(walls, door);
                return house;
                }
        
    }
//Scene2

/**Second inner class used to help organize the application and alow for src
 * file brevity
 */
    class SceneTwo{
    private BorderPane borderPane = new BorderPane();
    private InputOutput inputForm = new InputOutput();
    private ArrayList<LivingSpace> database = new ArrayList<LivingSpace>();
    public Text currentListing;

    /**Default construct sets the main BorderPane layout attributes  */
    public SceneTwo(){
        borderPane.setPrefSize(600,400);
        borderPane.setTop(getTitleBar());
        borderPane.setBottom(getHistoryPanel());
        borderPane.setRight(getImageTextDisplay());
        borderPane.setLeft(inputForm.createLayout());  
        
    }
/**Simple Getter
 * @return the scene for use throughout the application
 */
private Scene create(){
    return new Scene(borderPane, 600, 400);   
}
/**updates display text */
public void updateDisplay(){
    currentListing.setText(database.get(database.size()-1).toString());
}
/**Sets a vbox with a picture over the displayed database text
 * @return the Vbox for BorderPane Left
 */
public VBox getImageTextDisplay(){
    VBox imageText = new VBox();
    imageText.setPadding(new Insets(20, 0,0,0));
    imageText.setSpacing(20);
    Image mainImage = new Image("application/main.jpg");
    ImageView mainImageView = new ImageView(mainImage);
    VBox textDisplay = new VBox();
    Text title = new Text("Current Listing:");
    title.setFont(Font.font("Liberation Sans", FontWeight.BOLD, 15));
    if(database.size() == 0)
        currentListing = new Text("Welcome. Enter your listings Details.");
    currentListing.setFont(Font.font("Liberation Sans", FontWeight.BOLD, 12));
    textDisplay.getChildren().addAll(title, currentListing);
    imageText.getChildren().addAll(mainImageView, textDisplay);
    return imageText;
}
/**Was origanly going to make a scrolling history of previous entries,
 *  running short on time though ill play around with it later */
public HBox getHistoryPanel(){
    HBox historyPanel = new HBox();
    //Text historyTitle = new Text("History:");
    //historyPanel.getChildren().addAll(historyTitle);
    return historyPanel;
}
/**Sets the title bar and places scaled images gathered from existing methods 
 * @return the HBox for BorderPane top
*/
public HBox getTitleBar(){
    HBox titleBar = new HBox();
    titleBar.setPadding(new Insets(3,10,3,0));
    titleBar.setAlignment(Pos.CENTER);
    titleBar.setSpacing(200);
    titleBar.setStyle("-fx-background-color: #336699;");
    VBox text = sceneOne.getIntroText(Pos.BOTTOM_LEFT);
    text.setScaleX(.75);
    text.setScaleY(.75);
    HBox street = sceneOne.getStreetIcon(Color.web("#336699"));
    street.setScaleX(.75);
    street.setScaleY(.75);
    titleBar.getChildren().addAll(new Group(text), new Group(street));

    return titleBar;
}
/**Third inner class consists of the makeup of the GridPane used for
 * the BorderPane Right as well as eventhandling for input and output
 * for scene two
 */
private class InputOutput{
    private int livingSpace;
    private String[] text = {"Address:", "Baths:", "BedRooms:", "Sqft:", 
                            "Price/Rent:", "Enter", "Reset","Exit"};
    
    private Label[] inputLabels = new Label[5];
    private TextField[] inputFields = new TextField[5];
    private Button[] btInput = new Button[3];
    private RadioButton rbHouse = new RadioButton("House");
    private RadioButton rbApartment = new RadioButton("Apartment");    
    private HBox radioBox = new HBox();
    private HBox buttonControl = new HBox();
    private GridPane inputLayout = new GridPane(); // main layout
    private Pane voidSpace = new Pane();
    private ToggleGroup classType = new ToggleGroup();
    
    /**Default Constructor, sets all needed Objects and nodes variables 
     * for layout and event handling
     */
    private InputOutput(){
        //creating buttons, labels and textFields
        for(int i = 0,k = 0, j = 5; i < 5; i++){
            inputLabels[i] = new Label(text[i]);
            inputFields[i] = new TextField(); 
            if(i >= 2){
                btInput[k] = new Button(text[j++]);
                buttonControl.getChildren().add(btInput[k++]);
            }
        }
        radioBox.getChildren().addAll(rbHouse, rbApartment); // hBox for radioButtons
        rbHouse.setToggleGroup(classType); // grouping buttons
        rbApartment.setToggleGroup(classType);
        
        //adding labels and textfields 
        for(int i = 0;  i < 5; i++){
            inputLayout.add(inputLabels[i],0,i);
            inputLayout.add(inputFields[i],1,i);
            inputFields[i].setAlignment(Pos.BOTTOM_RIGHT);
        }
        inputLayout.add(radioBox, 0,6,6,1); //ading radio Buttons
        inputLayout.add(voidSpace, 0,7,7,1); //adding spacer
        inputLayout.add(buttonControl, 0,8,8,1); //adding buttons
        setFormatting(); // i should have looked into just using CSS layouts can be a real pain
        listenForAction(); // eventhandling organized
        
    }
    /**simple Getter for main layout of node
     * @return the formated end result of the inner classs Gridpane
     * to be used in the parents class BorderPane Left
     */
    public GridPane createLayout(){
        return inputLayout;
    }
    /**just tossed all the layout formating here to keep it togeather */
    private void setFormatting(){
        inputLayout.setHgap(10);
        inputLayout.setVgap(5);
        inputLayout.setPadding(new Insets(20, 0,0,10));
        radioBox.setSpacing(30);
        radioBox.setPadding(new Insets(5,5,5,5));
        radioBox.setAlignment(Pos.CENTER); 
        buttonControl.setSpacing(10);
        buttonControl.setAlignment(Pos.BOTTOM_CENTER); 
        voidSpace.setMinHeight(10);
    }

       
//userInput/output  
    /**Meat and Potatoes, radio buttons set a value represent a type
     * of livingspace, buttons check for valid format, reset textboxes
     * and exits application. Textpane retrevies all information and 
     * stores into an arrayList<LivingSpace> for future use
     */
    private void listenForAction(){
        //radio buttons event control
        rbHouse.setOnAction(e ->
            livingSpace = 1 ); 
        rbApartment.setOnAction(e ->
            livingSpace = 2 );

        //button IU Control
        btInput[0].setOnAction(e -> {  // Ok Button
            try{
                if(livingSpace == 0)
                    throw new NumberFormatException(); // check for unselected radio toggle
                Double.parseDouble(inputFields[1].getText());
                Integer.parseInt(inputFields[2].getText());
                Integer.parseInt(inputFields[3].getText());
                Integer.parseInt(inputFields[4].getText());
                setDatabase(); // instantiates a new object from textfield boxes and
                                // places the object into an arraylist<livingspace> 
            }catch(NumberFormatException ex){
                exceptionPopup("Invalid Input"); // alert popup
                resetTextFields(); // erases any values inputed
            }
                
        });
        btInput[1].setOnAction (e ->    //reset button
        resetTextFields());
        btInput[2].setOnAction(e ->     //exit button
            Platform.exit());
    } 
    /**resets the value of all textfield to a black string and resets the
     * current listing text display to its original
     */
    private void resetTextFields(){
        for(int i = 0; i < inputFields.length; i++){
            inputFields[i].setText("");
        }
        currentListing.setText("Welcome. Enter your listings Details.");
        
    }
    /** Instantiates an object based on radio button response and places
     * textfield values parsed into apropriate type places
     * into an instance varable of ArrayList<livingspace>
    */
    private void setDatabase(){ 
try{
        if(this.livingSpace == 1){
            database.add(new House(
                inputFields[0].getText(),
                Double.parseDouble(inputFields[1].getText()),
                Integer.parseInt(inputFields[2].getText()),
                Integer.parseInt(inputFields[3].getText()),
                inputFields[4].getText()) 
                );
        }
        else if(this.livingSpace == 2){
            database.add(new Apartment(
                inputFields[0].getText(),
                Double.parseDouble(inputFields[1].getText()),
                Integer.parseInt(inputFields[2].getText()),
                Integer.parseInt(inputFields[3].getText()),
                Integer.parseInt(inputFields[4].getText())
            ));
        }
        updateDisplay(); // updates the displaytext
        /* used for debugging
        System.out.println(database.size() + " ----->  " +database.get(database.size()-1).toString());
        System.out.println("-----------testbox-----------");
        System.out.println(currentListing.getText().toString());
        System.out.println("-----------testbox-----------");  */
    }catch(InvalidBathNumberException ex){
        exceptionPopup(ex.getMessage());   //alert pop up for having baths under 0.5 
        }
    }
}
    
}


    //Animate transition
    /**Started on this but didnt finish was going to creat a transition
     * animation from the nodes placements in scne one to where they are
     *  in the titleBar of scene two 
     */
    public void transitionAnimation(){
        // Pane animationPathPane = new Pane();
            Bounds streetIconBounds = getChild(sceneOne.getIntroLayout(),0,0).localToScene(
                getChild(sceneOne.getIntroLayout(),0,0).getBoundsInLocal());
            /*Line iconPathLine = new Line((0.5 * streetIconBounds.getMaxX()),
                (0.5 * streetIconBounds.getMaxY()), (scene.getWidth() - (0.5 * streetIconBounds.getWidth())),
                (0.5 * streetIconBounds.getHeight()));
            */
            
            Line iconPathLine = new Line(0,0,10,10);
            iconPathLine.endXProperty().bind(scene.widthProperty());
            iconPathLine.endYProperty().bind(scene.heightProperty());

            PathTransition streetPath = new PathTransition();
            streetPath.setDuration(Duration.millis(4000));
            streetPath.setPath(iconPathLine);
            streetPath.setNode(getChild(sceneOne.getIntroLayout(), 0, 0));
            streetPath.setOrientation(PathTransition.OrientationType.NONE);
            streetPath.setCycleCount(Timeline.INDEFINITE);
            streetPath.setAutoReverse(false);
            streetPath.play();
        }
    /** needed to pull the node from the GridPane in order to get cordinates
     * to help with animation, it works but the implementaion is shaky
     */
    private Node getChild(GridPane gridPane,int row, int col){
        for (Node child: gridPane.getChildren()){ 
            if(gridPane.getColumnIndex(child) == col 
                && gridPane.getRowIndex(child) == row){
                    return child;
                }
        }
        return null;
        }
    /**used to switch between scene one and two */
    private void switchScenes(Scene sceneName){
    //transitionAnimation();
        this.primaryStage.setScene(sceneName);
    } 
    /** 
     * Original started writing a little pop up then i 
     * found out about the alert class and said screw it
     */
    private void exceptionPopup(String message){
       /* VBox vbox = new VBox();
        Text errorMessage = new Text(message);
        Button btOK = new Button("Ok");
        vbox.getChildren().addAll(errorMessage, btOK);
        Scene messageScene = new Scene(vbox,100,100);

        
        Stage popup = new Stage();
        popup.setTitle("Error");
        popup.setScene(messageScene);
        popup.show();

        btOK.setOnAction(e -> 
            popup.close()
            );
            */

        Alert alert = new Alert(AlertType.ERROR, message);
        alert.showAndWait()
        .filter(response -> response == ButtonType.OK);
       

    }
}

