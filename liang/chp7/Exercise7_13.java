public class Exercise7_13{
    public static void main(String[] args){
        int[] test = new int[50];
        for(int i =0; i < test.length; i++){
            test[i] = i;
        }
        for(int i = 0; i < 10; i++){
            System.out.printf("%d\t<-->\t%d\n",getRandom(5,10, 15,20,25,30,35,40,45,50),getRandom(test));
            System.out.println("------------------");
            
            
        }
    }
    public static int getRandom(int ... numbers){
        boolean contains = false;
        int random;
        do{
        random = (int)(Math.random() * 55);

        for(int i = 0; i < numbers.length; i++){
            if (random == numbers[i]){
                contains = true;
                break;
            }else
                contains = false;
            
        }
    }while(contains);
    return random;
    }
}