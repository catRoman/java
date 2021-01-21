public class Exercise5_51{
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the first string: ");
        String stringOne = input.nextLine();
        System.out.print("Enter the second string: ");
        String stringTwo = input.nextLine();
String common = "";
String temp = "";

if(stringOne.length() < stringTwo.length()){
    temp = stringOne;
    stringOne = stringTwo;
    stringTwo = temp; 
}

        for(int i =0; i < stringOne.length(); i++){
            
                if(stringTwo.contains(stringOne.substring(0,i))){
                    
                    common = stringOne.substring(0,i);
                    
            }   
            }
        
        if(common.length() == 0){
            System.out.println(stringOne + " and " + stringTwo + " have no common prefix");
        }else
         System.out.println("The common prefix is: " + common);
    }

}