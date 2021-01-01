public class Exercise12_1B{
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println(
                "Usage: java Calculator operand1 operator operand2");
                System.exit(0);
        }

        int[] num = new int[2];
        for(int i = 0, j = 0; i <= 2; i +=2, j++ ){
        try {
            num[j] = Integer.parseInt(args[i]);
            
        }
        catch(NumberFormatException ex){
            System.out.println("Wrong input: " + args[i]);
            System.exit(1);
        }
    }
        

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
        + " = " + result(num, args));
    }
public static int result(int[] num, String[] args){
   
    int result = 0;   
    switch (args[1].charAt(0)){
            case '+': result = num[0] + num[1];
                    break;
            case '-': result = num[0] - num[1];
                break;
            case '.': result = num[0] * num[1];
                    break;
            case '/': result = num[0] / num[1];
                    break;
            
        }
        return result;
    }
}