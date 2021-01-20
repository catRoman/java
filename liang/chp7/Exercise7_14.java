// lowest common denominator not greatest will return
public class Exercise7_14{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] number = new int[5];
        System.out.print("Enter a list of integers: ");
        for(int i = 0; i < number.length; i++){
            number[i] = input.nextInt();

    }
    System.out.println("The greatest common denominator is " + gcd(number));
}
    public static int gcd(int... number){
        int gcd =1;
        boolean isDivisor;

        for(int i = 2; i < min(number); i++){
            isDivisor = true;
            for(int e: number){
            if(e % i != 0)
                isDivisor = false;
            } 
            if(isDivisor)
            gcd = i;
    
        }
        return gcd;
    }
    public static int min(int... number){
        int min = number[0];

        for(int e: number){
            if(e < min)
                min = e;
        }
        return min;
        
    }
}