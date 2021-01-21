import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;

public class Exercise12_23{
    public static void main(String[] args){

        try{
            URL scoresSite = new URL(
                "http://liveexample.pearsoncmg.com/data/Scores.txt");
            
                Scanner siteInput = new Scanner(scoresSite.openStream());

                int count = 0;
                int total = 0;
                double average = 0;
                while(siteInput.hasNext()){
                    total += siteInput.nextInt();
                    count++;
                }
                average = total / count;

                System.out.println("The total is " + total);
                System.out.println("The average is " + average);
            }
            catch(MalformedURLException ex){
                System.out.println("Invalid URL");
            }
            catch(IOException ex){
                System.out.println("I/O Errors: no such file");
            }
    }
}