import java.util.Scanner;

public class Exercise5_18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String regEx = "ABCD";
        String selection = "";
        do{
        System.out.print("Which pattern would you like to see (A to D): ");
        selection = input.nextLine();
       
        selection = selection.toUpperCase();


        if(selection.charAt(0) == 'A'){

            for(int row = 0; row <= 6; row++){
                for(int column = 1; column <= row; column++){
                    System.out.print(column);
                }
            
            System.out.println();
            }

            System.exit(0);
        }else if(selection.charAt(0) == 'B'){
            for(int i = 0; i <= 5; i++){
                for(int j = 1; j <=6 - i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
               
            }
            System.exit(0);
        }else if(selection.charAt(0)=='C'){
            for(int i = 1; i<=6;i++){
                for(int k = 1; k <=6 - i; k++){
                    System.out.print("  ");
                }
                for(int j = i; j>0; j--){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }else if(selection.charAt(0) == 'D'){
            for(int i = 0; i <6; i++){
                for(int j = 0; j < i; j++){
                    System.out.print("  ");
                }
                for(int k = 1; k<=(6-i); k++){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        System.exit(0);
        
        }else{
            System.out.println("Invalid entry try again...");
            System.out.println();
        }
    }while(selection.contains(regEx)==false); 
    }
}