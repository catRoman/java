public class Exercise5_5{
    public static void main(String[] args){
        final double KILOGRAMS_TO_POUNDS = 2.2;
        
        System.out.printf("%s  %s\t|\t%s\t%s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");

        int pounds =20;

        for(int i = 1; i < 200; i += 2){
            

            System.out.printf("%-9d  %6.2f\t|\t%-6d\t%9.2f\n",i,(i * KILOGRAMS_TO_POUNDS),pounds,(pounds / KILOGRAMS_TO_POUNDS));
            pounds +=5;
        }
    }
    }
