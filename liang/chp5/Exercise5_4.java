public class Exercise5_4{
    public static void main(String[] args){
        final double MILES_TO_KILOMETERS = 1.609;

        System.out.println("Miles\tKilometers");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%-5d\t%-10.3f\n", i,(i * MILES_TO_KILOMETERS));

        }
    }
}