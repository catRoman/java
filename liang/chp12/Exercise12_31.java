import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Exercise12_31{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String year= input.nextLine();
        System.out.print("Enter the gender: ");
        char gender = input.nextLine().charAt(0);
        System.out.print("Enter the name: ");
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
        }catch(MalformedURLException ex){
        System.out.println("Error: invaid URL");
        }catch(IOException ex){
        System.out.println("Error: invalid I/O");
    }
        boolean status = false;
        if(gender == 'M' || gender == 'm'){
            for(int i = 0; i < maleNames.size(); i++){
                if(maleNames.get(i).toLowerCase().equals(name.toLowerCase())){
                    System.out.println(name + " is ranked #" + (i +1)
                    + " in the year " + year);
                    System.out.println(maleNum.get(i) + " were named this year"); 
                    status =true;
                }
            }
            if(!status)
                System.out.println(name + " is not ranked in " + year);
        }else if(gender == 'F' || gender == 'f'){
        for(int i = 0; i < femaleNames.size(); i++){
            if(femaleNames.get(i).toLowerCase().equals(name.toLowerCase())){
                System.out.println(name + " is ranked #" + (i +1)
                + " in the year " + year);
                System.out.println(femaleNum.get(i) + " were named this year");
                status = true;
            }
        }
        if(!status)
            System.out.println(name + " is not ranked in " + year);
        }else{
    System.out.println("Gender not recognized");
}
    }
}