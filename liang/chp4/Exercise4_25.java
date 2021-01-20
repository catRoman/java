import java.util.Scanner;
public class Exercise4_25{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.print("Would you like to generate a random license plate? (type y for yes and n for no): ");
        String yesNo = input.nextLine();
    
        String regExpression = "yYnN";
        boolean entry = true;
        if(regExpression.contains(yesNo)){
            switch(regExpression.indexOf(yesNo)){
                case 0: entry = true; break;
                case 1: entry = true; break;
                case 2: entry = false; break;
                case 3: entry = false; break;
            }
            if(entry){
                System.out.print("How many would you like?: ");
                int j = input.nextInt();
                for(int i =0; i < j; i++){
               System.out.printf("Your lisence plate is %s%s%s-%s%s%s\n",rl(),rl(),rl(),rn(),rn(),rn());
                }
            }else{
                System.out.println("Bu bye");
                System.exit(1);
            }
        }else{
        System.out.println("Invalid entry");
        System.exit(1);
        }
    }
    public static String rl(){
        String rl = "" + (char)((int)'A' + (int)(Math.random() * ((int)('Z'-'A') +1)));
        return rl;
    }
    public static String rn(){
        String rn = "" + (char)((int)'0' + (int)(Math.random() * ((int)('9'-'0') +1)));
        return rn;
    }
}