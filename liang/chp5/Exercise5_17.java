import java.util.Scanner;

public class Exercise5_17{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numberOfRows = input.nextInt();
        String whitespaces = "";
        if(numberOfRows <= 15){
        for(int row = 1;row <= numberOfRows; row++){
            for(int i=(numberOfRows-row); i > 0 ; i--){
               
                System.out.print(("  "));
            }
            
                for(int j = row; j > 1; j--){
                    System.out.print(j + " ");
                }
            


          for(int column=1; column<= row; column++){
               
                System.out.print(column + " ");
            }
            

            System.out.println();
           
           
        }
       
    }else
        System.out.println("invalid entry");
}
}