import java.util.Scanner;

public class Exercise5_3{
    public static void main(String[] args){
        final double KILOGRAMS_TO_POUNDS = 2.2;

        System.out.println("Kilograms\tPounds");

        for(int i = 1; i < 200 ; i++){
            System.out.printf("%-9d\t%6.1f\n", i,(i * KILOGRAMS_TO_POUNDS));

        }

    }
}