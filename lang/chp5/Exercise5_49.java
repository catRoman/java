public class Exercise5_49{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter a string: ");
        String stringOne = input.nextLine();

        String regEx = "AEIOU";
        int vowelCount = 0;
        int consonantCount = 0;
        stringOne = stringOne.toUpperCase(); 
        for(int i = 0; i < stringOne.length(); i++){
            
            if(regEx.indexOf(stringOne.charAt(i)) > -1){
                vowelCount++;
            }else
                consonantCount++;
        
    }
        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of Consonants is " + consonantCount);

    }
}