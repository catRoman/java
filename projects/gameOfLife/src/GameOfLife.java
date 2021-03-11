import java.security.acl.Group;

import javafx.animation.AnimationTimer;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application{
   
    private double winWidth  = 100.0;
    private double winHeight = 1000;
    private Pane pane = new Pane();
    private double cellSize = 1;
    private Color alive = Color.BLACK;
    private Color dead = Color.WHITE;
    private int[][] universe = new int[(int)(winHeight/cellSize)][(int)(winWidth/cellSize)];

    @Override
    public void start(Stage primaryStage) throws Exception {
       

        Canvas canvas = new Canvas();
        canvas.setWidth(winWidth);
        canvas.setHeight(winHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        createLife();
        drawLife(gc);

        pane.getChildren().add(canvas);
     
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Game of Life");
        primaryStage.setScene(scene);
        primaryStage.show();
       
      
    //animation/game loop
    AnimationTimer animator = new AnimationTimer(){
        @Override
        public void handle(long arg0) 
        {
            drawLife(gc);
            // update
            //App.wait(10);
            rulesOfLife();
            //createLife();
            //App.wait(1);
            // render
           
        }
    };
    animator.start();

    }
    //driver
    public static void main(String[] args){
        Application.launch(args);
    }

    //init array
    public void createLife(){
        for(int i = 0; i < universe.length; i++){
            for(int j = 0; j < universe[i].length; j++){
                if(getRandomCell())
                    universe[i][j] = 1;
            }
        }
    }

    //update/draw cells
    public void drawLife(GraphicsContext gc){
       
        for(int i = 0; i < universe.length; i++){
            for(int j = 0; j < universe[i].length; j++){
                gc.setStroke(Color.BLACK);
                gc.setLineWidth(0.5);
                if(universe[i][j] == 1){
                    gc.setFill(alive);
                }else{
                    gc.setFill(dead);
                }
                gc.fillRect(i * cellSize, j * cellSize, cellSize, cellSize);
               // gc.strokeRect(i * cellSize, j * cellSize, cellSize, cellSize);

            }
        }
        
    }
    public void rulesOfLife(){
        int numLiveNeighbor= 0;
        int alive = 1;
        int dead = 0;
        
        int[][] neighbors = new int[(int)(winWidth/cellSize)][(int)(winWidth/cellSize)];

        for(int i = 0; i < universe.length; i++){
            for(int j = 0; j < universe[i].length; j++){
                if(universe[((i-1) + universe.length) % universe.length][((j-1) + universe[i].length) % universe[i].length] == alive)
                    numLiveNeighbor++;
                if(universe[((i-1) + universe.length) % universe.length][j] == alive)
                    numLiveNeighbor++;
                if(universe[((i-1) + universe.length) % universe.length][(j+1) % universe[i].length] == alive)
                    numLiveNeighbor++;
                if(universe[i][((j-1) + universe[i].length) % universe[i].length] == alive)
                    numLiveNeighbor++;
                if(universe[i][(j+1) % universe[i].length] == alive)
                    numLiveNeighbor++;
                if(universe[(i+1) % universe.length][((j-1) + universe[i].length) % universe[i].length] == alive)
                    numLiveNeighbor++;
                if(universe[(i+1) % universe.length][j] == alive)
                    numLiveNeighbor++;
                if(universe[(i+1) % universe.length][(j+1) % universe[i].length] == alive)
                    numLiveNeighbor++;

                neighbors[i][j] = numLiveNeighbor;
                numLiveNeighbor = 0;
            }
        }
            for(int i = 0; i < universe.length; i++){
                for(int j = 0; j < universe[i].length; j++){

                if(universe[i][j] == dead &&
                     neighbors[i][j] == 3 )
                    universe[i][j] = alive;
                else if(universe[i][j] == alive){
                    if(neighbors[i][j] > 3 || 
                        (neighbors[i][j] < 2))
                        universe[i][j] = dead;

                
                }
            }
        }
        
    }

    //helpers
    public static void wait(int milli){
        try{
            Thread.sleep(milli * 100);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    public static boolean getRandomCell(){
        return Math.random() > 0.75;
    }
    
   
  

}
