import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Exercise12_25{
    public static void main(String[] args)
        throws IOException{
            URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");

            try{
                
                Scanner input = new Scanner(url.openStream());
                BigDecimal[] allSalaries = new BigDecimal[3];
                for(int i = 0; i < allSalaries.length; i++){
                    allSalaries[i] = BigDecimal.ZERO;
                }
                int[] posCount = new int[3];
                while(input.hasNext()){
                    input.next();
                    input.next();
                    String position = input.next();
                    String salary = input.next();
                    if(position.equals("assistant")){
                        allSalaries[0] = allSalaries[0].add(new BigDecimal(salary));
                        posCount[0]++;
                    }else if(position.equals("associate")){
                        allSalaries[1] = allSalaries[1].add(new BigDecimal(salary));
                        posCount[1]++;
                    }else if(position.equals("full")){
                        allSalaries[2] = allSalaries[2].add(new BigDecimal(salary));
                        posCount[2]++;
                    }
                }
                System.out.println("total salary for assistant: " + allSalaries[0] 
                        + " | average salary: " + allSalaries[0].divide(new BigDecimal(posCount[0]),2, RoundingMode.HALF_EVEN));
                        System.out.println("total salary for associate: " + allSalaries[1] 
                        + " | average salary: " + allSalaries[1].divide(new BigDecimal(posCount[1]),2, RoundingMode.HALF_EVEN));
                        System.out.println("total salary for full professor: " + allSalaries[2] 
                        + " | average salary: " + allSalaries[2].divide(new BigDecimal(posCount[2]),2, RoundingMode.HALF_EVEN));
            }
            catch(MalformedURLException ex){
                System.out.println(ex);
            }
            catch(IOException ex){
                System.out.println(ex);
            }
    }
}