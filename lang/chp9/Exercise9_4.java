import java.util.Random;
public class Exercise9_4{
    public static void main(String[] args){
        Random newRandom = new Random(1000);

        for(int i = 0; i < 50; i++){
            System.out.println(newRandom.nextInt(100));

        }
    }
}