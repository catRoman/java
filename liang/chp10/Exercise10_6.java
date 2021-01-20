public class Exercise10_6{
    public static void main(String[] args){
        StackOfIntegers myStack = new StackOfIntegers();
        
        int totalNum = 120;
        boolean primeNum;
        int i = 1;
        while(i <= totalNum){
            if(checkForPrime(i)){
                myStack.push(i);
            }
            i++;
            }
        while(!myStack.empty()){
            System.out.print(myStack.pop() + " ");
        }

        
    }
  

static boolean checkForPrime(int inputNumber)
{
boolean isItPrime = true;
 
if(inputNumber <= 1) 
{
isItPrime = false;
 
return isItPrime;
}
else
{
for (int i = 2; i<= inputNumber/2; i++) 
{
if ((inputNumber % i) == 0)
{
isItPrime = false;
 
break;
}
}
 
return isItPrime;
}
}
}