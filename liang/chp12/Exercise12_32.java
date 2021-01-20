import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_32{
    public static void main(String[] args)
        throws IOException{
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-10s","Year");
            for(int i = 1; i <= 2; i++){
            for(int j =1; j <=5; j++){
                String rank ="Rank " + j;
                System.out.printf("%-10s",rank);
            }
        }
            System.out.println("\n------------------------------------------------------------------------------------------------------------");
        
           
         String link = "http://liveexample.pearsoncmg.com/data/babynamesranking";
        String[] fn = new String[5];
        String[] mn = new String[5];
         for(int i = 2010; i >=2001;i--){
            int rank = 0;
            URL url = new URL(link+i+".txt");
            Scanner input = new Scanner(url.openStream());
            int j =0;
            while(input.hasNext() && rank < 5){
                rank = input.nextInt();
                mn[j]= input.next();
                input.nextInt();
                fn[j]= input.next();
                input.nextInt();
                j++;
            }
            System.out.printf("%-10d%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", 
                    i, fn[0], fn[1], fn[2], fn[3], fn[4], mn[0],mn[1],mn[2],mn[3],mn[4]);
        }
}
}