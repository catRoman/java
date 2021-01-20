public class Exercise6_10{
    public static void main(String[] args){
        int primeCount = 0;

        for(int i =0; i< 10000; i++){
            if(isPrime(i)){
               
                primeCount++;
            }
        }
        System.out.println("The total number of primes is " + primeCount);
    }
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){     //If true, number is not prime
                return false;   // Number is not a prime
            }
        }
    return true;    // Number is prime
    }
}