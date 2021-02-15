import java.io.*;
import java.net.*;

public class ClientSide {
public void go(){
    try{
        Socket s = new Socket("178.128.6.228", 4242);

        InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
        BufferedReader reader = new BufferedReader(streamReader);

        String advice = reader.readLine();
        System.out.println();
        System.out.println("Today you should: " + advice);

        reader.close();
    } catch(IOException ex) {
        ex.printStackTrace();
    }
}

public static void main(String[] args){
    ClientSide client = new ClientSide();
    client.go();
}
}
