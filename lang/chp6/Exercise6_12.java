public class Exercise6_12{
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter first character: ");
        String stringOne = input.nextLine();
       
        System.out.print("Enter the second character: ");
        String stringTwo = input.nextLine();
        
        final int NUMBER_PER_LINE = 10;

        char ch1 = stringOne.charAt(0);
        char ch2 = stringTwo.charAt(0);

        printChars(ch1, ch2, NUMBER_PER_LINE);
    }

    public static void printChars(char ch1, char ch2,int numberPerLine ){
     int count = 0;
     
     System.out.println("The characters between " + ch1 + " and " + ch2 + " are:");
     
     if ((int)ch1 + 1 < (int)ch2){
     for(int i =(int)ch1 + 1; i < (int)ch2; i++){
       
        System.out.print((char)i + " "); 
        count++;
            if(count % numberPerLine == 0)
                System.out.println();
            
        }
        System.out.println();
}else{
    System.out.println("Wo wo wo we dont got all day here to go through every character and end back where you started...try again...bud");
}
   
    }
}