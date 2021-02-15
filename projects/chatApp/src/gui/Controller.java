package gui;

import app.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;


public class Controller{
    
    
    @FXML
    private TextField chatText;

    @FXML
    private static TextArea chatArea = new TextArea();
   
    public static void appendTextArea(String message){
        chatArea.appendText(message);
    }

    @FXML
    private void submit(ActionEvent event) {
        try{
            
            ClientChatApp.writer.println(chatText.getText());
            ClientChatApp.writer.flush();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        chatText.setText("");
        chatText.requestFocus();
        
    }


}
