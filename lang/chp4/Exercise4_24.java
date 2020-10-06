import java.util.Scanner;

public class Exercise4_24{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String first = "";
        String second = "";
        String third = "";

        if(city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0)
            first = city1;
        else if(city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0)
            first = city2;
        else
            first = city3;

        if((city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) > 0)
        || (city1.compareToIgnoreCase(city2) > 0 && city1.compareToIgnoreCase(city3) < 0))
            second = city1;
        else if((city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) > 0)
        || (city2.compareToIgnoreCase(city1) > 0 && city2.compareToIgnoreCase(city3) < 0))
            second = city2;
        else
            second = city3;

        if(city1.compareToIgnoreCase(city2) > 0 && city1.compareToIgnoreCase(city3) > 0)
            third = city1;
        else if(city2.compareToIgnoreCase(city1) > 0 && city2.compareToIgnoreCase(city3) > 0)
            third = city2;
        else
            third = city3;


        System.out.printf("The three cities in alphabetical order are %s %s %s\n", first, second, third);
        
        
    }
}