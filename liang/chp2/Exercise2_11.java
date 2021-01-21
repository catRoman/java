import java.util.Scanner;

public class Exercise2_11{
    
public static double birthsYear = secondsInaYear() / 7;
        public static double deathsYear = secondsInaYear() / 13;
        public static double immigrationYear = secondsInaYear() / 45;    

    static double secondsInaYear() {
        double secondsInaYear = 365 * 24 * 60 * 60;
        return secondsInaYear;
    }
    static double populationChange(){
    
        double total = (birthsYear + immigrationYear) - deathsYear;
        return total;
          
    }
    static double currentPop(double year){
        double population = 312032486;
        double currentPop = (population + (year * populationChange())) + 0.5;
        return currentPop;
    }

public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
   
    
    System.out.print("Enter the number of years: ");
    double year = input.nextDouble();
    System.out.println("The current population is: " + (int)currentPop(0));
    System.out.println("The population " + year + " year from now is: " + (int)currentPop(year));
    
    
}
}