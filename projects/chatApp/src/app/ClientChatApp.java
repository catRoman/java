package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.net.*;

public class ClientChatApp extends Application{
    public static PrintWriter writer;
    public static BufferedReader reader;
    Socket sock;


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../gui/chatgui.fxml"));
        Scene scene = new Scene(root);
        setupNetworking();
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
        stage.setTitle("Skricthes ChatApp");
        stage.setScene(scene);
        stage.show();
    } // close start
    private void setupNetworking(){
        try {
            sock = new Socket("178.128.6.228", 5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            writer = new PrintWriter(sock.getOutputStream());
            reader = new BufferedReader(streamReader);
            System.out.println("networking established");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    } //close setUpNetworking
public static void main(String[] args) 
        throws Exception {
                
        launch(args);
    }//end main
    public class IncomingReader implements Runnable{
    public void run(){
    String message;
   
    try { 
        while((message = reader.readLine()) != null) {
          gui.Controller.appendTextArea(message + "\n");
        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
}
}
}// close outer class


