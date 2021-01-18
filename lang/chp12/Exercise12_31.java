import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_31{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String year= input.nextLine();
        System.out.print("Enter the gender: ");
        char gender = input.charAt(0);
        System.out.println("Enter the name: ");
        String name= input.nextLine();

        
    String site = "http://liveexample.pearsoncmg.com/data/babynamesranking";
    ArrayList<String> maleNames = new ArrayList<>();
    ArrayList<Integer> maleNum = new ArrayList<>();  
    ArrayList<String> femaleNames = new ArrayList<>();
    ArrayList<Integer> femaleNum = new ArrayList<>();

    try{
            URL url = new URL(site + year + ".txt");
            Scanner siteInput = new Scanner(url.openStream());

            while(siteInput.hasNext()){
                siteInput.nextInt();
                maleNames.add(siteInput.next());
                maleNum.add(siteInput.nextInt());
                femaleNames.add(siteInput.next());
                femaleNum.add(siteInput.nextInt());
            }
    }
}